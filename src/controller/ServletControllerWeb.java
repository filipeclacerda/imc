
package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletControllerWeb extends HttpServlet {

    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String url = "/index.jsp";
        String mensagem = "";

        String sexo = request.getParameter("vSexo");
        float altura = Float.parseFloat(request.getParameter("vAltura"));
        float peso = Float.parseFloat(request.getParameter("vPeso"));

        ImcController objImcController = new ImcController();
        boolean vRetorno = objImcController.Instancia(sexo, altura, peso);
        if (!vRetorno) {
            mensagem = "Erro. Objeto nao Instanciado.";
        } else {
            String resultado = objImcController.Resultado();
            mensagem = "Você está " + resultado;
            
        }
        request.setAttribute("mensagem", mensagem);

        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
