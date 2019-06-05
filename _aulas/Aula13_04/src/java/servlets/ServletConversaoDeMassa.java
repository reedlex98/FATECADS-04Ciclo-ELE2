
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Massa;

/**
 *
 * @author dreis
 */
@WebServlet(name = "ServletConversaoDeMassa", urlPatterns = {"/ConversaoDeMassa"})
public class ServletConversaoDeMassa extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet para conversão de massa</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet para conversão de massa</h1>");
            
            // instancia objeto da regra de negócio
            Massa objMassa = new Massa();
            float massaConvertida = 0;
            String msgResultado = "";
            // recupera o valor original
            float massaOriginal = Float.parseFloat(request.getParameter("massaOriginal"));
            // faz a conversão de acordo com o botão clicado
            if (request.getParameter("btnConverter").equals("de lb para kg")){
                massaConvertida = objMassa.converterLibraParaQuilo(massaOriginal);
                msgResultado = String.format("Libras: %.2f; quilos: %.2f", 
                                        massaOriginal, massaConvertida);
            }
            else {
                massaConvertida = objMassa.converterQuiloParaLibra(massaOriginal);
                msgResultado = String.format("Quilos: %.2f; libras: %.2f", 
                                        massaOriginal, massaConvertida);
            }
            out.println(msgResultado);
            
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
