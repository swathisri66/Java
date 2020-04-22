/* creating database connection  */

import java.util.Scanner;
import java.sql.*;
class MyDatabaseConnection
{
  public static void main(String args[]) throws Exception
  {
     Scanner sc=new Scanner(System.in);
     String un,pw;
     System.out.print("enter user name : ");
     un=sc.next();
     System.out.print("enter password : ");
     pw=sc.next();
     connectDatabase(un,pw);
  }
  static void connectDatabase(String uname, String pwd)
  {
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");  // registering the driver component
      System.out.println("driver component registered");
      String url="jdbc:oracle:thin:@localhost:1521:xe";
 //   4parts of  url  drivertype:@domainname:portnumber:databasename/sid
      Connection cn=DriverManager.getConnection(url,uname,pwd);
      System.out.println("database connection established");
    }
    catch(SQLException e)
    {
       System.out.println("one");
       System.out.println(e.getMessage());
    }
    catch(ClassNotFoundException e)
    {
       System.out.println("two");
       System.out.println(e.getMessage());
    }
    catch(Exception e)
    {
       System.out.println("three");
       System.out.println(e);
    }
  }
}
