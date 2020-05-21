<!--  sum2.html  to  Add2.jsp -->

<html>
 <body>
   <%@include file="sum2.html" %>
   <%
      int x=Integer.parseInt(request.getParameter("val1"));
      int y=Integer.parseInt(request.getParameter("val2"));
      int z=x+y;
      out.println("<h2><br> first value is "+x);
      out.println("<br> second value is "+y);
      out.println("<br> sum is "+z+"<hr>");
   %>

 </body>
</html>
