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
public class LogicFacade extends CalculateNewBalance {

    private DBAccessor data;
    private CompleteCupCake Cake;

    public CompleteCupCake[] allCupCakes() {
        ArrayList<CompleteCupCake> list = data.getAllCupCakes();
        CompleteCupCake[] Cakes = new CompleteCupCake[list.size()];
        for (int i = 0; i <= list.size(); i++) {
            Cakes[i] = list.get(i);
        }
        return Cakes;
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
}
