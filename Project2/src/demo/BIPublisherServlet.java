package demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class BIPublisherServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public BIPublisherServlet() {

    }

    public static void service(String param, HttpServletRequest request,
                               HttpServletResponse response) throws ServletException,
                                                                    IOException {

        response.setContentType(CONTENT_TYPE);
        request.setCharacterEncoding("UTF-8");
        try {
            //params参数:BH-报表编号 datas-查询报表参数  TYPE-是页面显示还是下载文件【show,downLoad】
            JSONObject params = new JSONObject(param);
            JSONObject datas = params.getJSONObject("datas");
            String BH = params.getString("BH");
            String type = params.getString("TYPE");
            //根据报表编号找到对应的报表路径
            String BH_arr[] =
            { "10001" };
            //报表路径
            String Path_arr[] =
            { "~weblogic/Drafts/动态插入图片.xdo"};
            int position = 0;
            for (int index = 0; index < BH_arr.length; index++) {
                if (BH.equals(BH_arr[index])) {
                    position = index;
                    break;
                }
            }
            String Path = Path_arr[position];
            PdfUtils.getData(Path, datas, type, request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
