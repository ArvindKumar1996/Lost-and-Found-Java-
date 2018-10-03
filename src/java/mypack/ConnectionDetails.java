/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author Arvind Kumar
 */
public interface ConnectionDetails {
    public static String DRIVER_NAME= "oracle.jdbc.driver.OracleDriver";
    public static String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static String USER_NAME="arvind";
    public static String PASSWORD="root";
}
