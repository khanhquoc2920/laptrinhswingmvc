/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Product {
    private int idproduct;
    private String pname;
    private String pcategory;
    private String pprice;
    
    //Xây dựng các hàm khởi tạo

    public Product() {
    }
     public Product( String pname, String pcategory, String pprice) {
        this.pname = pname;
        this.pcategory = pcategory;
        this.pprice = pprice;
    }

    public Product(int idproduct, String pname, String pcategory, String pprice) {
        this.idproduct = idproduct;
        this.pname = pname;
        this.pcategory = pcategory;
        this.pprice = pprice;
    }
    //Xây dựng hàm kết nối đến cơ sở dữ liệu
    public Connection lay_ket_noi_csdl(){
        Connection conn = null;
        try {
            //Code của bạn ở đây
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/product",
                    "root", "292000");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
        //Xây dựng hàm thêm 1 product vào database
    public void save_product_to_db(){
        try {
            //Code của bạn ở đây
            //Buoc 1: Lay ket noi toi csdl
            Connection ketnoicsdl = lay_ket_noi_csdl();
            
            // the mysql insert statement
            String query = " insert into product (pname, pcategory, pprice)"
                    + " values (?, ?, ?)";
            
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = ketnoicsdl.prepareStatement(query);
            preparedStmt.setString(1, this.pname);
            preparedStmt.setString(2, this.pcategory);
            preparedStmt.setString(3, this.pprice);
            
            // execute the preparedstatement
            preparedStmt.execute();
            
            ketnoicsdl.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        //Hàm lấy ra danh sách các san pham trong bang product
    
    public ArrayList<Product> lay_danh_sach_san_pham(){
        ArrayList<Product> result = new ArrayList<>();
        try {
            //code của bạn ở đây
            //Buoc 1: Tao ket noi toi csdl
            Connection ketnoicsdl = lay_ket_noi_csdl();
            Statement stmt=ketnoicsdl.createStatement();
            ResultSet rs=stmt.executeQuery("select * from product");
            while(rs.next()){
                Product pd = new Product(rs.getInt("idproduct"), 
                                        rs.getString("pname"), 
                                        rs.getString("pcategory"), 
                                        rs.getString("pprice"));
                result.add(pd);
            }
            ketnoicsdl.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
     //Hàm cập nhật sản phẩm hiện tại vào csdl
    public void update_current_product(){
        try {
            //code của bạn ở đây
            //Buoc 1: Tao ket noi toi csdl
            Connection ketnoicsdl = lay_ket_noi_csdl();
            // create the java mysql update preparedstatement
            String query = "update product set pname = ?,"
                    + " pcategory = ?,"
                    + "pprice = ? where idproduct = ?";
            PreparedStatement preparedStmt = ketnoicsdl.prepareStatement(query);
            preparedStmt.setString(1, this.pname);
            preparedStmt.setString(2, this.pcategory);
            preparedStmt.setString(3, this.pprice);
            preparedStmt.setInt(4, this.idproduct);
            
            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            
            ketnoicsdl.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        //Hàm xóa san pham hiện tại ra khỏi csdl
    public void delete_current_product(){
        //code của bạn ở đây
        try {
            //code của bạn ở đây
            //Buoc 1: Tao ket noi toi csdl
            Connection ketnoicsdl = lay_ket_noi_csdl();
            // create the java mysql update preparedstatement
            String query = "delete from product where idproduct = ?";
            PreparedStatement preparedStmt = ketnoicsdl.prepareStatement(query);
            preparedStmt.setInt(1, this.idproduct);
            
            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            
            ketnoicsdl.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

    @Override
    public String toString() {
        return "Product{" + "idproduct=" + idproduct + ", pname=" + pname + ", pcategory=" + pcategory + ", pprice=" + pprice + '}';
    }
    
    
}
