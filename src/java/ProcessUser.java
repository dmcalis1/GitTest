/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.ArrayList;
import edu.uncc.nbad.User;
import edu.uncc.nbad.Product;
/**
 *
 * @author lsafarne
 */
public class ProcessUser extends HttpServlet {

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
        HttpSession session=request.getSession();
        //A HashMap of users
        User user1=new User();
        User user2=new User();
        User user3=new User();
        user1.setFirstName("john");
        user1.setLastName("Morgan");
        user2.setFirstName("jack");
        user2.setLastName("white");
        user3.setFirstName("jill");
        user3.setLastName("smith");
        HashMap<String,User> userMap = new HashMap<>();
        userMap.put("john@uncc.edu", user1);
        userMap.put("jack@uncc.edu", user2);
        userMap.put("jill@uncc.edu", user3);
        session.setAttribute("userMap", userMap);
        session.setAttribute("user1", user1);
        
        //An ArrayList of products
        Product product1=new Product();
        product1.setName("shoe");
        product1.setBrand("Nike");
        Product product2=new Product();
        product2.setName("Top");
        product2.setBrand("Tommy");
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        session.setAttribute("productList", productList);
        
        //An array of colors
        String[] colors={"red","green","blue"};
        session.setAttribute("colors", colors);
       

        

        getServletContext().getRequestDispatcher("/welcome.jsp").forward(request, response);
        
        
        

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
        //processRequest(request, response);
        String first=request.getParameter("first");
        String last=request.getParameter("last");
        User user = new User();
        user.setFirstName(first);
        user.setLastName(last);
        HttpSession session=request.getSession();
        session.setAttribute("user", user);
        
        String[] colors={"red","green","blue"};
        session.setAttribute("colors", colors);
        
       
        
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

}
