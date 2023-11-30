/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import ModeloDAO.UsuarioDAO;
import config.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Richard Bardales
 */

public class UsuarioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String listar = "vistas/listarUsuario.jsp";
    String add = "vistas/addUsuario.jsp";
    String edit = "vistas/editUsuario.jsp";
    Usuario u = new Usuario();    
    UsuarioDAO udao= new UsuarioDAO();
    int id;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String acceso = "";
            String accion = request.getParameter("accion");

            if (accion.equalsIgnoreCase("listar")) {
                acceso = listar;
            }
            else if (accion.equalsIgnoreCase("edit")) {
                
                request.setAttribute("idUsuario", request.getParameter("id"));
                acceso = edit;
            }
            else if (accion.equalsIgnoreCase("add")) {
                acceso = add;
            }
            else if (accion.equalsIgnoreCase("saveadd")) {
                
                String username=request.getParameter("username");
                String pass=request.getParameter("pass");
                u.setUsername(username);
                u.setPass(pass);
                udao.add(u);
                acceso = listar;
            }
            else if (accion.equalsIgnoreCase("saveedit")) {
                id = Integer.parseInt(request.getParameter("txtid"));
                String username=request.getParameter("username");
                String pass=request.getParameter("pass");
                u.setUsername(username);
                u.setPass(pass);
                u.setIdUsuario(id);
                udao.edit(u);
                acceso = listar;
            }
            else if (accion.equalsIgnoreCase("delete")) {
                id=Integer.parseInt(request.getParameter("id")) ;
                u.setIdUsuario(id);
                udao.delete(id);
                acceso = listar;
            }
            else{
                acceso = listar;
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
