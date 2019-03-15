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
import java.util.List;
/**
 *
 * @author Christian Ambjørn Kehr
 */
public class CalculateNewBalance{
    private ShoppingCart  shoppingcart = new ShoppingCart();
    private CompleteCupCake cupcake = new CompleteCupCake("choko", 0);
    private Line LineI = new Line(cupcake,2, 50);
    private DBAccessor dBA = new DBAccessor();

     public double calculateNewBalance(double userBalance, double dif) {
        double newBalance = userBalance - dif;
        return newBalance;
    }
    
    public double calculateTotalPrice(List<Line> LineItems){
        double price = 0;
        double priceOfTheseCupcakes = 0;
        
        for (Line LineI : LineItems) {
            //dBA bør nok gå gennem frontcontroller metode (ved det er kringet)
            priceOfTheseCupcakes = LineI.getQty() * dBA.getCupCakePrice(cupcake.getName());
            price = price + priceOfTheseCupcakes;
        }
        return price;
    }
}
