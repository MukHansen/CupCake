/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruger
 */
public class DBAccessor {
    
    public static void main(String[] args) {
        System.out.println("Start");
        getAllCupCakes();
        String Jordbær = "Jordbær";
        CompleteCupCake j = getCupCake(Jordbær);
        System.out.println("CupCake found: " + j.getName());
        System.out.println(getAllCupCakes().toString());
        
    }

   static public List<CompleteCupCake> getAllCupCakes() {
        ArrayList<CompleteCupCake> list = new ArrayList<>();

        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * FROM CupCakes_list;";

            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("c_name");
                int price = rs.getInt("c_price");

                list.add(new CompleteCupCake(name, price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list + "uuuuuuuuuuu");
        return list;
    }

    static public CompleteCupCake getCupCake(String name) {
        CompleteCupCake CupCake = null;

        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * FROM CupCakes_list WHERE c_name ='" + name + "';";

            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                
                int price = rs.getInt("c_price");
                CupCake = new CompleteCupCake(name, price);
            }
            System.out.println(CupCake + " ------------------ ");
            return CupCake;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(CupCake + "++++++++++++++++");
        return CupCake;
    }
}
