package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerservelet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAO o = new DAO();
        String yid=request.getParameter("yid");
        String name=request.getParameter("name");
        String dept=request.getParameter("dept");
        String emil=request.getParameter("email");
        String college=request.getParameter("college");
        String contact=request.getParameter("contact");
        
        o.setYid(yid);
        o.setName(name);
        o.setDept(dept);
        o.setEmail(emil);
        o.setCollage(college);
        o.setContact(contact);
       
        System.out.println("responser servelet "+ o.getYid());
        int r=o.register();
        if (r==1) {
            System.out.println("executiing connection");
            request.setAttribute("yid", yid);
            request.setAttribute("name", name);
            RequestDispatcher rd = request.getRequestDispatcher("/response.jsp");
            rd.forward(request, response);
        } else 
        {
            System.out.println("servelets.registerservelet.processRequest()");
                
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
