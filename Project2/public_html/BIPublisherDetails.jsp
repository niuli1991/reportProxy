<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <script type="text/javascript" src="./javascript/jquery-1.7.2.min.js"></script>
    <script type="text/javascript">
      $(function () {
          var FID = "10001";
           var params = "{\"BH\":\"" + "10001" + "\",\"TYPE\":\"show\",\"datas\":{\"FID\":\"" + FID + "\"}}";
           $("#BIPublish").html("<iframe src='report.jsp?params=" + params + "'  frameborder='0' style='width:100%;height:1000px;'><\/iframe>");
      })

      function DownFile() {
          var FID = "10001"
          var params = "{\"BH\":\"" + "10001" + "\",\"TYPE\":\"downLoad\",\"datas\":{\"FID\":\"" + FID + "\"}}";
           $("#downLoad").html("<iframe src='report.jsp?params=" + params + "'  frameborder='0' style='width:100%;height:1000px;display:flex'><\/iframe>");
      }
    </script>
    <title>BIPublisherDetails</title>
  </head>
  <body style="width: 100%;height:100%;overflow:hidden;margin-top:0px;margin-left:0px">
    <div>
      <input type="button" value="导出" onclick="DownFile()" style="float:right"/>
    </div>
    <div style="width:100%;height:100%" id="BIPublish"></div>
    <div id="downLoad"></div>
  </body>
</html>