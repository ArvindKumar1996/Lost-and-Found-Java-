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
        <a class="nav-link" href="welcome.jsp">Home</a>
      </li>
            
       <li class="nav-item">
        <a class="nav-link" href="feedback.jsp">Feedback</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="complain.jsp">Complain</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="lostitems.jsp">Lost Items</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="uploadfinditems.jsp">Upload Find Item</a>
      </li>
    </ul>
      
      <ul class="navbar-nav my-2">
      <li class="nav-item">
        <a class="nav-link" href="changepassword.jsp">Change Pwd</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="logout.jsp">Logout</a>
      </li>
  </ul>
  </div>
</nav>
    </body>
</html>
