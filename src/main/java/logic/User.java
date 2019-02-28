/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Bruger
 */
public class User {
    private String name;
    private String password;
    private int balance;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    private String email;

    public User(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }
    
}
