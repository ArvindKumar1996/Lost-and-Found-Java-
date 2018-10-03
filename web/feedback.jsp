<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>Feedback</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <section id="feedback">
            <div class="container">
                <div class="row clr">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-7">
                        <h3>Feedback Form</h3>
                        </hr>
                        <form>
                        <textarea class="form-control"  style="height: 70px; color:black;" placeholder="Text Here!.." required></textarea>
			<br>
                        <input type="submit" class="btn btn-success w-50" value="Submit">
                        </form>
                    </div>
                    <div class="col-sm-3"></div>
                </div>
            </div>
        </section>
        <%@include file="footer.jsp" %>
    </body>
</html>
