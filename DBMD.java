// program to work with DatabaseMetaData

import java.sql.*;
class DBMD extends MyDatabaseConnection
{
  public static void main(String args[]) throws Exception
  {
    connectDatabase("hr","manager");

    DatabaseMetaData dbmd = cn.getMetaData();

    System.out.println("Database name is    : "+dbmd.getDatabaseProductName());
    System.out.println("Database version is : "+dbmd.getDatabaseProductVersion());
    System.out.println("Database Driver  is : "+dbmd.getDriverName());
    System.out.println("Database Driver version is : "+dbmd.getDriverVersion());
    System.out.println("Database username  : "+dbmd.getUserName());
    System.out.println("Database URL    is : "+dbmd.getURL());


    cn.close();
  }
}

