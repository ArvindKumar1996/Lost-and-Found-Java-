<%-- 
    Document   : changepassword
    Created on : May 26, 2018, 3:04:19 PM
    Author     : Arvind Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <%@include file="userheader.jsp" %>
        <section id="changepsw">
            <div class="container">
                <form action="login.jsp" method="post">
                    <div class="row">
                        <div class="col-sm-4">
                    <div class="form-group">
                     <input type="number" class="form-control" name="" value="" placeholder="Enter current password">
                    </div>
                    </div>
                    </div>
                </form>
            </div>
        </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
