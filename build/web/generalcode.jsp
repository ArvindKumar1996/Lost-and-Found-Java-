<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.DBManager"%>
<%
    DBManager db = new DBManager();
    int pageno = Integer.parseInt(request.getParameter("page"));
    switch (pageno) {
        // This case 1 is used to Registration Form
        case 1:
            String name = request.getParameter("name");
            String gender = request.getParameter("gen");
            String email = request.getParameter("email");
            String mobile = request.getParameter("mobile");
            String password = request.getParameter("password");
            String cmd1 = "insert into registration values('" + name + "','" + gender + "','" + email + "','" + mobile + "','" + password + "','"+db.getDate()+"')";
            String cmd2 = "insert into login values('" + email + "','" + password + "','user')";
              
            if (db.executeNoneQuery(cmd1) == true && db.executeNoneQuery(cmd2) == true) {
                out.print("<script>alert('Registration Successfully');window.location.href='register.jsp';</script>");
                
            } else {
                out.print("<script>alert('Registration is not Successfull');window.location.href='register.jsp';</script>");
                
            }
            break;
        case 2:
            String q1 = "delete from registration where email='" + request.getParameter("userid") + "'";
            boolean b1 = db.executeNoneQuery(q1);
            String q2 = "delete from  login where userid='" + request.getParameter("userid") + "'";
            boolean b2 = db.executeNoneQuery(q2);
            if (b1 == true && b2 == true) {
                out.print("<script>alert('Record is deleted');window.location.href='show.jsp';</script>");
            } else {
                out.print("<script>alert('Record is not deleted');window.location.href='show.jsp';</script>");
            }
            break;
        
        case 3:
            name = request.getParameter("name");
            email = request.getParameter("email");
            mobile = request.getParameter("mobile");
            password = request.getParameter("password");
            String q = "update registration set username='" + name + "','" + email + "','" + mobile + "','" + password + "' where email='" + email + "' ";
            if (db.executeNoneQuery(q) == true) {
                out.print("<script>alert('Record Updated Successfully');window.location.href='show.jsp';</script>");
                
            } else {
                out.print("<script>alert('Record is not updated');window.location.href='show.jsp';</script>");
                
            }
            
            break;
        case 4:
            String uid = request.getParameter("uid").trim();
            String pass = request.getParameter("password");
            String query = "select * from login where email='" + uid + "'";
            ResultSet rs = db.getRecord(query);
            if (rs.next()) {
                if (rs.getString("password").equals(pass)) {
                    if (rs.getString("usertype").equals("user")) {
                        String strname = "select name from registration where  email='" + uid + "'";
                        rs = db.getRecord(strname);
                        rs.next();
                        
                        session.setAttribute("userid", uid);
                        session.setAttribute("name", rs.getString("name"));
                        response.sendRedirect("welcome.jsp");
                    }
                    
                } else {
                    out.print("<script>alert('Invalid User');window.location.href='login.jsp';</script>");
                }
            } else {
                
                out.print("<script>alert('Invalid User');window.location.href='login.jsp';</script>");
            }
            break;
        default:
            out.print("<script>alert('Invalide Case');window.location.href='index.jsp';</script>");
            break;
    }
    

%>