<!-- My first JSP program  -->

<html>
  <body bgcolor="cyan">
    <%=  "Hello All, welcome to first JSP program"   %>
    <%!
         int x=10;
         int y=60;
         int z=x+y;
    %>

    <%= "first value is "+x  %>
    <%= "second value is "+y  %>
    <%= "<b> total is "+z+"</b>"  %>

    <%  
        out.println("<p>first value is "+x);
        out.println("<br>second value is "+y);
        out.println("<p>total  is "+z);
    %>
  </body>
</html>