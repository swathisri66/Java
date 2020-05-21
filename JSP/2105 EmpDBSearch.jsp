<!--  empdbsearch.html to EmpDBSearch.jsp  --> 

<html>
 <body>
   <%@page import="java.sql.*" %>
   <%
      out.println("<html><body><center>");
      try
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","manager");
         PreparedStatement ps=cn.prepareStatement("select * from emp4 where employee_id=?");
         ps.setInt(1,Integer.parseInt(request.getParameter("idno")));
         ResultSet rset=ps.executeQuery();
         if (rset.next()==true)
         {
           out.println("<p><u> Employee Record Found </u><hr>");    
           out.println("<p> Employee Idno : "+rset.getInt(1));    
           out.println("<p> Employee Name : "+rset.getString(2));    
           out.println("<p> Employee Salary : "+rset.getInt(3));    
           out.println("<p> Department Idno : "+rset.getInt(4));    
           out.println("<hr>");    
         }
	 else
	 {
           out.println("<p> <font color='red' size='6'> Employee Record NOT Found </font><hr>");    
         }
      }
      catch(Exception e)
      {
         out.println(e);
      }
      out.println("</center></body></html>");
    %>
    <%@include file="empdbsearch.html" %>
  </body>
</html>
