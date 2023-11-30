/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAO.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author HAROLD
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String add = "/view/addUser.jsp";
    String edit = "/view/editUser.jsp";
    String list = "/view/listUser.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String accion = request.getParameter("accion");
            String acceso = "";
            User u = new User();
            UserDAO userDao = new UserDAO();

            if (accion.equalsIgnoreCase("add")) {
                acceso = add;

            } else if (accion.equalsIgnoreCase("saveedit")) {
                String user = request.getParameter("username");
                String password = request.getParameter("password");
                int id = Integer.parseInt(request.getParameter("id_edit"));
                u.setIdUser(id);
                u.setUserName(user);
                u.setPassword(password);
                boolean r = userDao.edit(u);
                if (r) {
                    acceso = list;
                }

            }else if(accion.equalsIgnoreCase("edit")){
                request.setAttribute("idUser", request.getParameter("id"));
                acceso=edit;
                }
            else if(accion.equalsIgnoreCase("delete")){
                int id = Integer.parseInt(request.getParameter("id_delete"));
                boolean r = userDao.delete(id);
                if(r){
                    acceso=list;
                }
            }

            
            RequestDispatcher vista = request.getRequestDispatcher(acceso);
            vista.forward(request, response);

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

}
