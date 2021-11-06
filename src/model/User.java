/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lê văn vỹ
 */
public class User {
    
    private int id;
    private String FirstName;
    private String LastName;
    private int age;
    private String Password;
    
    public User(){     
    }
    
    public User(int id, String FirstName, String LastName, int age, String Password){
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.Password = Password;
    }
    
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
}





