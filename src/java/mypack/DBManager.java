package mypack;

import java.sql.*;

public class DBManager implements ConnectionDetails {

    public Connection getCon() {
        Connection con = null;
        try {
            Class.forName(DRIVER_NAME);
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            con = null;
        }
        return con;
    }

    /* this method used to Insert ,Update,Delete operation */
    public boolean executeNoneQuery(String cmd) {
        try {
            PreparedStatement ps = getCon().prepareStatement(cmd);
            int n = ps.executeUpdate();
            return (n > 0) ? true : false;
        } catch (Exception e) {
            return false;
        }
    }

    /* this method is used to select record from database */
    public ResultSet getRecord(String cmd)
    {
        ResultSet rs = null;
        try {
            PreparedStatement ps = getCon().prepareStatement(cmd);
            rs = ps.executeQuery();
        } catch (Exception e) {
            rs = null;
        }
        return rs;
    }
    /* this method is used to generate auto increment id*/
   public int getAutoId(String field_Name,String table_name){
       int id=0;
       try{
           String query="select nvl(max("+field_Name+"),0)+1 from "+table_name;
           ResultSet rs= getRecord(query);
           if(rs.next()){
               id=rs.getInt(1);
           }else{
               id=0;
           }
       }catch(Exception e){
           id=0;
       }
       return id;
   }
   /*this method is used to get Current Date*/
   public String getDate(){
       java.util.Date d=new java.util.Date();
       java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd-MM-yyy");
       return sdf.format(d);
   }
   public String getDateTime(){
       java.util.Date d=new java.util.Date();
       java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd-MM-yyy hh:mm:ss a");
       return sdf.format(d);
   }
}
