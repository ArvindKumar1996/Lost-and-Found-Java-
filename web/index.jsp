<%-- 
    Document   : index
    Created on : May 24, 2018, 11:03:23 AM
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
        <title>Index</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <section id="main">
            <div class="container">
                <div class="row">
                    <div class="col-sm-3"></div>
                    <div class="col-sm-6">
                <h2 class="head">Win Your FREE Prize!!</h2>
                <p>Enter your email address bellow and reserve your prize on the Lost and Found in the hill.</p>
                <form>
                <div class="form-group">
                <input type="email" class="form-control" id="email" name="email" value="" placeholder="Enter email address">
               </div>
                <button type="submit" class="btn btn-success" name="submit">Submit</button>
                </form>
                    </div>
                    <div class="col-sm-3"></div>
            </div>
            </div>
        </section>
        <section id="welcome">
            <div class="container">
                <h3 class="text-center">WELCOME TO LOST AND FOUND</h3>
                <p class="text-center">At Lost & Found, we provide grief support to individuals and families from Springfield and the surrounding counties. Lost & Found Grief Center works with the bereaved to provide education and support as they travel their journey of grief to find peace, hope, and a new normal as they face life without their deceased loved one.</p>
            </div>
        </section>
         <section id="serve">
            <div class="container">
                <h3 class="text-center">WHO WE SERVE</h3>
                <p class="text-center">We have served over all counties across India. Our groups are offered at no charge to the following age groups in our community.</p>
                <div class="row">
                    <div class="col-sm-4">
                        <h4 class="text-center text-warning">YOUTH</h4>
                        <p class="text-center">Preschoolers through high schoolers, who have experienced the death of a parent, sibling, or primary caregiver are welcome to join our groups.</p>
                    </div>
                    <div class="col-sm-4">
                        <h4 class="text-center text-warning">PARENTS</h4>
                        <p class="text-center">Parents or caregivers of kids meet at the same time their kid’s groups meet, allowing for the entire family to be supported.</p>
                    </div>
                    <div class="col-sm-4">
                        <h4 class="text-center text-warning">ADULTS</h4>
                        <p class="text-center">Support services are available for adults who do not have children attending group. Please contact the office to learn more.</p>
                    </div>
                </div>
                <center>
                <input class="btn btn-outline-success w-50" value="LEARN ABOUT OUR SERVICES">
                </center>
            </div>
        </section>
        <section id="serve">
            <div class="container">
                <h3 class="text-center">VOLUNTEER OPPORTUNITIES</h3>
                <div class="row">
                    <div class="col-sm-4">
                        <h4 class="text-center text-warning">BECOME A FACILITATOR</h4>
                        <p class="text-center">Facilitators assist the group coordinator with the night’s activity and interact with the children or parents.</p>
                    </div>
                    <div class="col-sm-4">
                        <h4 class="text-center text-warning">BECOME A GREETER</h4>
                        <p class="text-center">Play an important role by welcoming our families as they come through the doors and help them through the sign in process.</p>
                    </div>
                    <div class="col-sm-4">
                        <h4 class="text-center text-warning">JOIN AN EVENT COMMITTEE</h4>
                        <p class="text-center">We are always in need of committee members to help plan, promote, secure donations for, and find sponsors for our fundraising events.</p>
                    </div>
                </div>
                <center>
                <input class="btn btn-outline-info w-50" value="LEARN ABOUT VOLUNTEER OPPORTUNITIES">
                </center>
            </div>
        </section>
        <%@include file="footer.jsp"%>
    </body>
</html>
