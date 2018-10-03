<%-- 
    Document   : logout
    Created on : May 25, 2018, 5:06:42 PM
    Author     : Arvind Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function noback()
            {
                window.history.forward();
                window.setTimeout("window.location.href='login.jsp'",500);
            }
        </script>
    </head>
    <body bgcolor="cyan" onload="noback()">
        <%
            session.invalidate();
        %>
    </body>
</html>
