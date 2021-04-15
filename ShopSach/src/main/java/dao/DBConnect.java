/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DBConnect {
    public static Connection getConnection() throws SQLException{
        try {
            Connection cons = null ;
            Class.forName("com.microsoft.sqlSever.jdbc.SQLSeverDriver");
            cons = DriverManager.getConnection("jdbc:sqlsever://localhost:1433;databaseName=ShopSach;user=sa;password=292000");
            return cons;
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
    }
}
