<%-- 
    Document   : register
    Created on : May 24, 2018, 11:13:16 AM
    Author     : Arvind Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" />
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>Register</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <section class="hero">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-sm-8 mx-auto">
                        <div class="card border-none">
                            <div class="card-body">
                                <div class="mt-2 text-center">
                                    <h2>Create Your Account</h2>
                                </div>
                                <p class="mt-4 text-white lead text-center">
                                    Sign up to get started with Authority
                                </p>
                                <div class="mt-4">
                                    <form action="generalcode.jsp?page=1" method="post">
                                        <div class="form-group">
                                            <input type="text" class="form-control" name="name" value="" placeholder="Enter full name">
                                        </div>
                                        <div class="form-group">
                                            <label>Gender</label><br>
                                            <input type="radio" value="male" name="gen" checked> Male &nbsp;&nbsp;
                                            <input type="radio" value="female" name="gen"> Female
                                        </div>
                                        </div>
                                        <div class="form-group">
                                            <input type="email" class="form-control" name="email" value="" placeholder="Enter email address">
                                        </div>
                                        <div class="form-group">
                                            <input type="number" class="form-control" name="mobile" value="" placeholder="Enter mobile number">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" name="password" value="" placeholder="Enter password">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" name="confirm-password" value="" placeholder="Confirm password">
                                        </div>
                                        <button type="submit" class="btn btn-primary btn-block">Create Account</button>
                                    </form>
                                    <div class="clearfix"></div>
                                    <p class="content-divider center mt-4"><span>or</span></p>
                                </div>
                                <p class="mt-4 social-login text-center">
                                    <a href="#" class="btn btn-twitter"><em class="ion-social-twitter"></em></a>
                                    <a href="#" class="btn btn-facebook"><em class="ion-social-facebook"></em></a>
                                    <a href="#" class="btn btn-linkedin"><em class="ion-social-linkedin"></em></a>
                                    <a href="#" class="btn btn-google"><em class="ion-social-googleplus"></em></a>
                                    <a href="#" class="btn btn-github"><em class="ion-social-github"></em></a>
                                </p>
                                <p class="text-center">
                                    Already have an account? <a href="login.jsp">Login Now</a>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="clearfix"></div>
                    <div class="col-sm-12 mt-5 footer">
                       
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
