/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;

import model.CFdatos;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
/**
 *
 * @author Isaac Ruiz
 */
@WebServlet( value = "/lista")
public class ValoresController extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // resp.setContentType("text/html;charset=UTF-8");
        String url = "/index.html";

        String action = req.getParameter("action");
        if (action == null){
            action = "registrar";
        }

        if (action.equals("registrar")) {
            url = "/index.jsp";
        } else if (action.equals("agregar")) {
            String dato = req.getParameter("name");
            String tipo = req.getParameter("apellidos");
          

            CFdatos dat = new CFdatos(dato, tipo);
            req.setAttribute("dat",dat);
            url = "/mostrarDatos.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(req,resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      processRequest(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    public void destroy() {
    }
    
    
}
