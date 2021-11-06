/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.awt.Component;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lê văn vỹ
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        var user = "root";
        var password = "";
        PreparedStatement st = null;
        ResultSet rs = null;
        try(Connection cn = DriverManager.getConnection(url, user, password)){
            System.out.println("ket noi thanh cong");
            System.out.println(cn.getCatalog());
          String sql = "UPDATE user_info SET address = 'VietNam' WHERE address = 'England';";
          st = cn.prepareStatement(sql);
          st.executeUpdate();
          cn.close();
          System.out.println("Updated!");
//            rs = st.executeQuery(sql);
            //neu khong co du rtlieu trong bang
            if (rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, sql);
                return;
            }
//            Statement stmt = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            rs = stmt.executeQuery(sql);
//            rs.last();
//            rs.moveToInsertRow();
//            rs.updateString("name", "gásadfsdfs");
//            rs.updateInt("tuoi", 445);
//            rs.insertRow();
//            rs.beforeFirst();
//            //            rs.absolute(1);
////            System.out.println("ten: " +rs.getString("name") +", " +"tuoi: " +rs.getInt("tuoi"));
//            while(rs.next()){
//                System.out.println("ten: " +rs.getString(1)+", " + "tuoi: " +rs.getInt(2));
//            }
           

//            
        }   
        catch (SQLException ex) {
            Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
