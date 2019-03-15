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
public class Line {
    private CompleteCupCake cupcake = new CompleteCupCake("Choko",2);
    private int qty;

   
    private double price;
    //private int invoiceID;

    public Line(CompleteCupCake cupcake, int qty, double price /*, int invoiceID*/) {
        this.cupcake = cupcake;
        this.qty = qty;
        this.price = price;
         //this.invoiceID = invoiceID;
    }

    public CompleteCupCake getCupcake() {
        return cupcake;
    }

    public int getQty() {
        return qty;
    }
    
     public double getPrice() {
        return price;
    }
}
