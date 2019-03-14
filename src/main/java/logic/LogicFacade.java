/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.CompleteCupCake;
import data.DBAccessor;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author Bruger
 */
public class LogicFacade extends CalculateNewBalance {

    private DBAccessor data = new DBAccessor();

    public ArrayList<CompleteCupCake> allCupCakes() {
        ArrayList<CompleteCupCake> list = data.getAllCupCakes();
        return list;
    }

    public int getUserBalance(String name) {
        int balance = data.getBalance(name);
        return balance;
    }

    public void setUserBalanceInDATA(String name, int supFromBalance) {
        // klassen skal måske tage et parmereter mere => oldUserBalance
        int Balance = calculateNewBalance(data.getBalance(name), supFromBalance);

        data.setBalance(name, Balance);
    }

    public List getShoppingcart() {
        return data.getShoppingcart();
         
    }
}
