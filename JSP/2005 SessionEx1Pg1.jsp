<!--  sessionex1.html  to  SessionEx1Pg1.jsp -->

<html>
 <body>
   <%
     String una=request.getParameter("uname"); 
     String pwd=request.getParameter("passwd"); 
     if (pwd.equalsIgnoreCase("jntu123"))
     {
        out.println("<br> Welcome "+una+" Login Success...");
        out.println("<br> Session Id is "+session.getId());
        out.println("<br> Creation Time "+session.getCreationTime());
        out.println("<br> Last accessed time "+session.getLastAccessedTime());
        out.println("<br> New Session  "+session.isNew());
        out.println("<br> Max Inactive Interval "+session.getMaxInactiveInterval());
        session.setAttribute("sesvar1",una);
        out.println("<a href='SessionEx1Pg2.jsp'> Go to Page 2 </a>");
     }
     else
     {
        out.println("<br> Sorry "+una+" Invalid password...retry");
     }
   %>
 </body>
</html>
