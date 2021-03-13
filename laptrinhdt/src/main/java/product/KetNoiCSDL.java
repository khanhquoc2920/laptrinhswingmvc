///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package product;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
///**
// *
// * @author Admin
// */
//public class KetNoiCSDL {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args)  {
//        // TODO code application logic here
//        try{
//            //Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            try (Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3307/product",
//                    "root", "292000")) {
//                Statement stmt=conn.createStatement();
//                ResultSet rs=stmt.executeQuery("select * from product");
//                while(rs.next())
//                    System.out.println(rs.getInt("idproduct")+"  "+rs.getString("pname")+
//                            "  "+rs.getString("pcategory") +"  "+rs.getString("pprice") );
//            }  
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(KetNoiCSDL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//}
