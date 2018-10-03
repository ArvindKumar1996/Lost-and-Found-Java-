<%
    if(session.getAttribute("userid")==null)
    {
     response.sendRedirect("login.jsp");
    }
    else
    {
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>welcome</title>
    </head>
    <body>
        <%@include file="userheader.jsp" %>
        <section id="welcome">
            <div class="containetr">
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-4">
                        <h1>Welcome <%=session.getAttribute("name") %></h1>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
            </div>
        </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
<%}%>