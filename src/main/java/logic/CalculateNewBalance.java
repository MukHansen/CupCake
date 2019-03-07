/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Christian Ambjørn Kehr
 */
public class CalculateNewBalance extends LogicFacade{

    public int calculateNewBalance(int userBalance, int dif) {
        // kan give problemer (skal måske catch dif = null eller dif = 0)
        int balance = userBalance;
        int diffrences = dif;
        int newBalance = balance - dif;
        return newBalance;
    }
}
