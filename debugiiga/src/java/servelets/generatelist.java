package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class generatelist extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String avg = request.getParameter("mark");
        // System.out.println("avg " + avg);

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Final round candidates</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Eligible candidates for round 2 of Debuggiga "  + "</h1>");
            out.println("<table border=\"2\">");
            out.println("<tr>");
            out.println("<td>Sl_NO</td>");
            out.println("<td>Yid</td>");
            out.println("<td>Name</td>");
            out.println("<td>Dept</td>");
            out.println("<td>Email</td>");
            out.println("<td>Collage</td>");
            out.println("<td>Contact</td>");
            out.println("</tr>");
            DAO o = new DAO();
            ResultSet rs = o.select(Integer.parseInt(avg));
            int i=1;
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>"+i+++"</td>");
                out.println("<td>"+rs.getString("yid")+"</td>");
                

                out.println("<td>");
                out.println(rs.getString("name"));
                out.println("</td>");

                out.println("<td>");
                out.println(rs.getString("dept"));
                out.println("</td>");

                out.println("<td>");
                out.println(rs.getString("email"));
                out.println("</td>");

                out.println("<td>");
                out.println(rs.getString("collage"));
                out.println("</td>");
                out.println("<td>");
                out.println(rs.getString("contact"));
                out.println("</td>");

                out.println("</tr>");
            }
            out.println("</form>");
            out.println("</html>");
            out.println("</body>");
            out.println("</html>");
        }
//        RequestDispatcher rd = request.getRequestDispatcher("/list.jsp");
//        rd.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(generatelist.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(generatelist.class.getName()).log(Level.SEVERE, null, ex);
        }
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
