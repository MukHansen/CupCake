/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Slantefar
 */
public class VerifyLogin {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

       public VerifyLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public String toString() {
        return "Login{" + "username=" + username + ", passworde=" + password + '}';
    }
    
}