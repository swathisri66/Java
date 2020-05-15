//   exams.html to ExamServlet.java 

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class ExamServlet extends HttpServlet
{
   public void service(HttpServletRequest q,HttpServletResponse s) throws IOException,ServletException
   {
      PrintWriter pw=s.getWriter();
      pw.println("<html><body><center>");
      pw.println("<h2>RESULTS</h2>");
      int p1=Integer.parseInt(q.getParameter("pap1"));
      int p2=Integer.parseInt(q.getParameter("pap2"));

      ServletConfig cfg = getServletConfig();
      int extra1=Integer.parseInt(cfg.getInitParameter("extramarksp1"));
      int extra2=Integer.parseInt(cfg.getInitParameter("extramarksp2"));

      ServletContext cnt=getServletContext();
      int g1=Integer.parseInt(cnt.getInitParameter("gvar1"));
      int tot=p1+p2+extra1+extra2+g1;
      double avg=tot/2.0;
      pw.println("<p>Paper1 Marks : "+p1);
      pw.println("<p>Paper1 Extra Marks : "+extra1);
      pw.println("<p>Paper2 Marks : "+p2);
      pw.println("<p>Paper2 Extra Marks : "+extra2);
      pw.println("<p>Bonus Marks : "+g1);
      pw.println("<p><b>Total Marks : "+tot+"</b>");
      pw.println("<p><i>Average Marks : "+avg+"</i>");
      pw.println("</center></body></html>");
   }
}  