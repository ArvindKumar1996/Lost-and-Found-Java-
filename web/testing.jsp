<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    out.println("Ok");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "arvind", "root");
    out.println("Ok");
%>