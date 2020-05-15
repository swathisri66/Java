// first servlet program to display a hello message from tomcat server
// 'javax' package is present in 'servlet-api.jar'

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class HelloServlet extends HttpServlet
// public class HelloServlet extends GenericServlet
//public class HelloServlet implements Servlet
{
   public void service(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException
   {
      PrintWriter pw=rs.getWriter();
      pw.println("hello world");
   }
}
est rq, HttpServletResponse rs) throws ServletException, IOException
   {
        PrintWriter pw=rs.getWriter();
        pw.println("Hello World, Welcome to First Servlet Program");
   }
}
