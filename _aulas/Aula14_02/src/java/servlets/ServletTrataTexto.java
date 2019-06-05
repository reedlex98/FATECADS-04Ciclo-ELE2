/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Formato;
/**
 *
 * @author dreis
 */
@WebServlet(name = "ServletTrataTexto", urlPatterns = {"/TrataTexto"})
public class ServletTrataTexto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet para tratamento de texto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet para tratamento de texto</h1>");
            
            // recupera o texto recebido
            String texto = request.getParameter("texto");
            // declara a variável do tipo dispatcher
            RequestDispatcher rd = null;
            // formata o texto utilizando as regras de negócios
            String textoMaiusculo = new Formato().retornarMaiusculo(texto);
            String textoMinusculo = new Formato().retornarMinusculo(texto);
            if (texto.length() < 10){
                out.println("<h3><p>Texto original: " + texto + "</p>");
                out.println("<p>Texto maiúsculo:  " + textoMaiusculo + "</p>");
                out.println("<p>Texto minúsculo:  " + textoMinusculo + "</h3>");
            }
            else if (texto.length() <= 20){
                request.setAttribute("textoMaiusculo", textoMaiusculo);
                request.setAttribute("textoMinusculo", textoMinusculo);
                rd = request.getRequestDispatcher("index.jsp");
                rd.include(request, response);
            }
            else{
                request.setAttribute("textoMaiusculo", textoMaiusculo);
                request.setAttribute("textoMinusculo", textoMinusculo);
                rd = request.getRequestDispatcher("textoFormatado.jsp");
                rd.forward(request, response);
            }
            
            out.println("</body>");
            out.println("</html>");
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
