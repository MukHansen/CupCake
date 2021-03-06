/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.LogicFacade;

/**
 *
 * @author Bruger
 */
@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {
    
    private LogicFacade logic = new LogicFacade();
    //næste kan bare sættes i // efter behov. ansvar = chris. 
    //private String name = request.getParameter("username");
    //private int balance = logic.getUserBalance(name);

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String origin = request.getParameter("origin");
        switch (origin) {
            case "index":
                index(request, response);
                break;
            case "login":
                login(request, response);
                break;
            case "shop":
                shop(request, response);
                break;
            case "shoppingcart":
                Shoppingcart(request, response);
                break;
            default:
                throw new AssertionError();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void index(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void login(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void shop(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList shoppingcartContent = null;
        response.setContentType("text/html;charset=UTF-8");
        
        request.setAttribute("mytable", logic.allCupCakes());
        
        String username = request.getParameter("username");
        request.getSession().setAttribute("username", username);
        
        request.getRequestDispatcher("shop.jsp").forward(request, response);
        //request.getSession().getAttribute("order");
       
        request.getAttribute("order");
    }

    private void Shoppingcart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       request.setAttribute("ShoppingCartContens", logic.getShoppingcart());
       request.getRequestDispatcher("shoppingcart.jsp").forward(request, response);
       request.setAttribute("getTotalPrice", logic.setShoppingcartPrice(logic.getShoppingcart()));
    }

}
