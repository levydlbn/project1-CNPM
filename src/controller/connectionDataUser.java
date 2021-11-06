/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author lê văn vỹ
 */
public class connectionDataUser {
    public static Connection getConnection() throws SQLException{
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/listuser", "root", "");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return connection;
    }
    
    public List<User> findAll(){
        List<User>userList = new ArrayList<>();
        String query = "select*from listuser";
        try{
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                User user = new User(rs.getInt("id"),rs.getString("FisrtName"),rs.getString("LastName"),rs.getInt("age"),rs.getString("password"));
                userList.add(user);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return userList;
    }
    
    public void insert(User user){
        String query = "insert into student(FisrtName,LastName,age) values(?,?,?,?)";
        try{
            Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setInt(3, user.getAge());
            pstmt.setString(4, user.getPassword());
            pstmt.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
