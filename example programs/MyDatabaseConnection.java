/* creating database connection */

//import java.util.Scanner; // Java is package, sub package is //util, class is Scanner
//import java.awt.event.*


import java.sql.*;
class MyDatabaseConnection
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	  Class.forName("oracle.jdbc.driver.OracleDriver");     

//class key word; Class  is Class
// registering the driver component

System.out.println("driver component registered");

String url,uname,pwd;
url="jdbc:oracle:thin:@localhost:1521:xe"; //4 parts drivertype-thin driver //drivertype:@domainname
uname="hr";
pwd="manager";
Connection cn=DriverManager.getConnection(url,uname,pwd);
System.out.println("database connection established");
	}
}
