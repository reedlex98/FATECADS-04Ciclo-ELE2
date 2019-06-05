/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N50481611009;

import Negocio.Retangulo;
import Negocio.Triangulo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author elder
 */
@WebServlet(name = "ServletFigura", urlPatterns = {"/ServletFigura"})
public class ServletFigura extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher rd = null;
            if(!request.getParameter("height").isEmpty() && !request.getParameter("base").isEmpty()){
                double height = Double.parseDouble(request.getParameter("height"));
                double base = Double.parseDouble(request.getParameter("base"));
                if(height > 0 && base > 0){
                    Retangulo retangulo = new Retangulo(height, base);
                    Triangulo triangulo = new Triangulo(height, base);
                    request.setAttribute("TrianguloArea", triangulo.calculateArea());
                    request.setAttribute("TrianguloPerimeter", triangulo.calculatePerimeter());
                    request.setAttribute("RetanguloArea", retangulo.calculateArea());
                    request.setAttribute("RetanguloPerimeter", retangulo.calculatePerimeter());
                    rd = request.getRequestDispatcher("exibeResultado.jsp");
                    rd.forward(request, response);
                }
                out.println("<p>Um ou mais campos com valores iguais ou menores que 0...</p>");
                rd = request.getRequestDispatcher("index.jsp");
                rd.include(request, response);
            }else{
            out.println("<p>Um ou mais campos vazios...</p>");
            rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
            }
            /* TODO output your page here. You may use following sample code. */
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
