<%--
  Created by IntelliJ IDEA.
  User: shou
  Date: 2018/12/10
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>hello</title>
    <script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <script>
      $(function(){
          $("#btn").click(function () {
              alert("index");
          })
      })
    </script>
  </head>
  <body>
  <button id="btn">测试</button>
  </body>
</html>
