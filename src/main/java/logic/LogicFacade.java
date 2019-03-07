/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.CompleteCupCake;
import data.DBAccessor;
import java.util.ArrayList;

/**
 *
 * @author Bruger
 */
public class LogicFacade {
    
    private DBAccessor data;
    
    public ArrayList<CompleteCupCake> allCupCakes() {
        ArrayList<CompleteCupCake> list = data.getAllCupCakes();
        return list;
    }
    public int getUserBalance(String name){
        int balance = data.getBalance(name);
        return balance;
    }
    public void setUserBalanceInDATA(String name, int newBalance){
        
        int Balance = logic.CalculateNewBalance(newBalance);
    }
} 
