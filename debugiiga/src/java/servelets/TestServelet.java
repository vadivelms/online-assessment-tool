package servelets;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TestServelet")
public class TestServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doCommon(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doCommon(request,response);
	}
	protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("q11");
		String s2=request.getParameter("q21");
		String s3=request.getParameter("q31");
		String s4=request.getParameter("q41");
		String s5=request.getParameter("q51");
		System.out.println("r1: "+s1);
		System.out.println("r2: "+s2);
		System.out.println("r3: "+s3);
		System.out.println("r4: "+s4);
		System.out.println("r5: "+s5);
		
		int sum=0;
		if( (s1 != null) && s1.equalsIgnoreCase("2"))
			sum++;
		if( (s2 != null) && s2.equalsIgnoreCase("4"))
			sum++;
		if( (s3 != null) && s3.equalsIgnoreCase("1"))
			sum++;
		if( (s4 != null) && s4.equalsIgnoreCase("5"))
			sum++;
		if( (s5!=null) && s5.equalsIgnoreCase("2"))
			sum++;
                DAO o=new DAO();
                String yid=request.getParameter("yid");
                System.out.println("servelets.TestServelet.doCommon() id "+yid);
		System.out.println(sum);
		request.setAttribute("score", sum);
                o.update(yid, sum);
		RequestDispatcher rd=request.getRequestDispatcher("/result.jsp");  
		rd.forward(request, response);

	
	}

}
