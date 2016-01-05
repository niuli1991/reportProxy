###Oracle BI Publisher报表的整合
***

>开发工具：[Jdeveloper 11g](http://www.oracle.com/technetwork/cn/developer-tools/jdev/downloads/index.html), [Oracle 11g数据库](http://www.oracle.com/technetwork/database/enterprise-edition/downloads/index.html), [Oracle BI Publisher](http://www.oracle.com/technetwork/middleware/bi-publisher/downloads/index.html)

###整合思路
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;前台页面调用servlet将参数传到web服务器，后台解析参数并通过报表路由找到报表地址，接着调用报表服务器发布出来的webservice服务从报表服务器取出（以文件流的方式返回）对应的报表，最后web服务器将报表返回（以文件流的方式返回）前台页面。[详细步骤](http://blog.csdn.net/github_30215003/article/details/48277265)

