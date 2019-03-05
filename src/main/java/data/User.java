/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Bruger
 */
public class User {
    private String name;
    private String password;
    private int balance;
    private String email;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public User(String name, String password, String email, int balance) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", password=" + password + ", balance=" + balance + ", email=" + email + '}';
    }
    
}
