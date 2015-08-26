package demo;

import BIPublisher.PublicReportService;
import BIPublisher.PublicReportServiceService;

import com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfParamNameValue;
import com.oracle.xmlns.oxp.service.publicreportservice.ArrayOfString;
import com.oracle.xmlns.oxp.service.publicreportservice.ParamNameValue;
import com.oracle.xmlns.oxp.service.publicreportservice.ReportRequest;

import com.oracle.xmlns.oxp.service.publicreportservice.ReportResponse;

import java.io.OutputStream;

import java.util.Iterator;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class PdfUtils {

    private static PublicReportServiceService publicReportServiceService =
        new PublicReportServiceService();
    //报表服务器的登录账号密码
    private static final String username = "weblogic";
    private static final String password = "12345678";


    public PdfUtils() {

    }


    public static void getData(String reportAbsolutePath, JSONObject params,
                               String Type, HttpServletRequest request,
                               HttpServletResponse response) {
        //创建报表实例
        PublicReportService publicReportService =
            publicReportServiceService.getPublicReportService();

        OutputStream out = null;
        ServletOutputStream sos = null;
        try {

            ReportRequest repRequest = new ReportRequest();

            repRequest.setReportAbsolutePath(reportAbsolutePath);

            repRequest.setAttributeTemplate("Simple");
            repRequest.setAttributeFormat("pdf");
            repRequest.setAttributeLocale("zh-cn");
            repRequest.setSizeOfDataChunkDownload(-1);

            // 将报表需要的参数封装起来
            ArrayOfParamNameValue paramArray = new ArrayOfParamNameValue();
            Iterator iterator = params.keys();
            String attribute = "";
            while (iterator.hasNext()) {
                attribute = iterator.next().toString();
                ParamNameValue paramNameValue = new ParamNameValue();
                paramNameValue.setName(attribute);
                ArrayOfString array = new ArrayOfString();
                array.getItem().add(params.get(attribute).toString());
                paramNameValue.setValues(array);
                paramArray.getItem().add(paramNameValue);
            }

            repRequest.setParameterNameValues(paramArray);

            ReportResponse repResponse = new ReportResponse();

            repResponse =
                    publicReportService.runReport(repRequest, username, password);


            byte[] baReport = repResponse.getReportBytes();
            boolean isIE = request.getHeader("USER-AGENT").contains("MSIE");
            //判断浏览器是否IE 因为IE不支持看pdf 所以直接导出down
            if (Type.equals("show") && !isIE) {
                response.reset();
                response.setContentType("application/pdf");

                sos = response.getOutputStream();
                sos.write(baReport);
                sos.flush();
                sos.close();

            } else {
                //导出的pdf文件名称
                String fileName = "动态插入图片";
                response.reset();

                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/pdf");
                response.setHeader("Content-Disposition",
                                   "attachment; filename=" +
                                   java.net.URLEncoder.encode(fileName, "UTF-8") +
                                   ".pdf");

                response.setContentLength(baReport.length);

                out = response.getOutputStream();
                out.write(baReport, 0, baReport.length);

                out.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            //                response.reset();
            try {
                if (sos != null)
                    sos.close();
                if (out != null)
                    out.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
