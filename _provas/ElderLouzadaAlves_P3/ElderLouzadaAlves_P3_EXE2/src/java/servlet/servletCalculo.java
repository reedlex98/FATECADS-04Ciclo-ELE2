package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import N50481611009.Adicao;
import N50481611009.Divisao;
import N50481611009.Multiplicacao;
import N50481611009.Subtracao;
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
@WebServlet(urlPatterns = {"/servletCalculo"})
public class servletCalculo extends HttpServlet {

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
            if (request.getParameter("val1") != null && request.getParameter("val2") != null){
            
                float val1 = Float.parseFloat(request.getParameter("val1"));
                float val2 = Float.parseFloat(request.getParameter("val2"));
                String operacao = request.getParameter("btnCalcular");
                
                RequestDispatcher rd = null;
                
                if (operacao.equals("+")){
                    Adicao adicao = new Adicao(val1,val2);
                
                    request.setAttribute("calculado", adicao.calcular());
                    rd = request.getRequestDispatcher("exibeResultado.jsp");
                    rd.forward(request, response);
                }
                else if (operacao.equals("-")){
                    Subtracao subtracao = new Subtracao(val1,val2);
                
                    request.setAttribute("calculado", subtracao.calcular());
                    rd = request.getRequestDispatcher("exibeResultado.jsp");
                    rd.forward(request, response);
                }
                else if (operacao.equals("x")){
                    Multiplicacao mult = new Multiplicacao(val1,val2);
                
                    request.setAttribute("calculado", mult.calcular());
                    rd = request.getRequestDispatcher("exibeResultado.jsp");
                    rd.forward(request, response);
                }
                else if (operacao.equals("/")){
                    Divisao divisao = new Divisao(val1,val2);
                
                    request.setAttribute("calculado", divisao.calcular());
                    rd = request.getRequestDispatcher("exibeResultado.jsp");
                    rd.forward(request, response);
                }
            }
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
