/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailme;

/**
 *
 * @author acer
 */
public class User {
    private int id;
    private int role;
    private String nama;
    private String email;
    private String password;
    
    public User(){
        
    }
    public User(int id, String nama, String email, String password){
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setRole(int role){
        this.role = role;
    }
    
    public int getRole(){
        return this.role;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
}
