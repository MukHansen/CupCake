/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruger
 */
public class ShoppingCart {
    private List<Line> LineItems = new ArrayList<>();

    public List<Line> getLineItems() {
        return LineItems;
    }
    
}
