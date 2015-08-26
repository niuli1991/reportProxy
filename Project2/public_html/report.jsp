<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.*,org.json.*,demo.*"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>show</title>
  </head>
  <body>
    <%      
        request.setCharacterEncoding("UTF-8");
        String params=request.getParameter("params");
        if(params!=null){
            BIPublisherServlet.service(params,request, response); 
        }
    %>
  </body>
</html>