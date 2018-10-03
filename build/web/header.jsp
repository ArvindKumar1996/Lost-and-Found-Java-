<%-- 
    Document   : header
    Created on : May 3, 2018, 11:23:56 AM
    Author     : Arvind Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>Arvind Kumar</title>
    </head>
    <body  data-spy="scroll" data-target=".navbar">
        <nav class="navbar navbar-expand-lg fixed-top">
            <a class="navbar-brand logo" href="index.jsp">Lost <span style="color: red; font-weight: bold;"> &AMP; </span> Found</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="index.jsp">Home</a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Volunteer
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Men</a>
          <a class="dropdown-item" href="#">Women</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Child</a>
        </div>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="contact.jsp">Contact Us</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="about.jsp">About</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="feedback.jsp">Feedback</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="faq.jsp">FAQ</a>
      </li>
    </ul>
      
      <ul class="navbar-nav my-2">
      <li class="nav-item">
        <a class="nav-link" href="login.jsp">Login</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="register.jsp">Sign Up</a>
      </li>
  </ul>
  </div>
</nav>
    </body>
</html>
