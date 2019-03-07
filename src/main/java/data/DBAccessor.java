/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Bruger
 */
public class DBAccessor {

    /*
    public static void main(String[] args) {
      
        System.out.println(getCupCakePrice("Jordbær"));
        System.out.println(getAllCupCakes().toString());
        System.out.println(getUser("John").toString());
        createUser("John", "1234", "Teeest@testmail.dk", 1000);

        System.out.println("Start");
        getAllCupCakes();
        String Jordbær = "Jordbær";
        CompleteCupCake j = getCupCake(Jordbær);
        System.out.println("CupCake found: " + j.getName());
        System.out.println(getAllCupCakes().toString()); 
    }
     */
    public ArrayList<CompleteCupCake> getAllCupCakes() {
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
        return list;
    }

    public CompleteCupCake getCupCake(String name) {
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
            return CupCake;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CupCake;
    }

    public int getCupCakePrice(String name) {
        int price = 0;

        try {
            DBConnector c = new DBConnector();

            String query = "SELECT c_price FROM CupCakes_list WHERE c_name ='" + name + "';";

            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                price = rs.getInt("c_price");
            }
            return price;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return price;
    }

    public User getUser(String name) {
        User user = null;

        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * FROM Users WHERE UserName = '" + name + "';";

            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String password = rs.getString("UserPassword");
                String email = rs.getString("UserEmail");
                int balance = rs.getInt("UserBalance");
                user = new User(name, password, email, balance);
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public User createUser(String name, String password, String email, int balance) {
        User user = null;

        try {
            DBConnector c = new DBConnector();
            Connection connection = c.getConnection();

            String insert = "INSERT INTO Users VALUES ('" + name + "','" + password + "'," + balance + ",'" + email + "');";

            Statement stmt = connection.createStatement();
            PreparedStatement preparedStmt = connection.prepareStatement(insert);
            preparedStmt.execute();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
