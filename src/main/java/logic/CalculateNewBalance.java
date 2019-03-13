/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.CompleteCupCake;
import data.DBAccessor;
import data.Line;
import data.ShoppingCart;
import java.util.ArrayList;
/**
 *
 * @author Christian Ambjørn Kehr
 */
public class CalculateNewBalance{
    private ShoppingCart  shoppingcart = new ShoppingCart();
    private CompleteCupCake cupcake = new CompleteCupCake("choko", 0);
    private Line LineI = new Line(cupcake,2);
    private DBAccessor dBA = new DBAccessor();

    public int calculateNewBalance(int userBalance, int dif) {
        // kan give problemer (skal måske catch dif = null eller dif = 0)
        int balance = userBalance;
        int diffrences = dif;
        int newBalance = balance - dif;
        return newBalance;
    }
    
    public int calculateTotalPrice(ArrayList<Line> LineItems){
        int price = 0;
        int priceOfTheseCupcakes = 0;
        
        for (Line LineI : LineItems) {
            priceOfTheseCupcakes = LineI.getQty() * dBA.getCupCakePrice(cupcake.getName());
            price = price + priceOfTheseCupcakes;
        }
        return price;
    }
}
