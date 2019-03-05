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
public class CompleteCupCake {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public CompleteCupCake(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CompleteCupCake{" + "name=" + name + ", price=" + price + '}';
    }
    
}
