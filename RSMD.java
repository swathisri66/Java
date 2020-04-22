// program to work with ResultSetMetadata

import java.sql.*;
import java.util.*;
class RSMD extends MyDatabaseConnection
{
  public static void main(String args[]) throws Exception
  {
    connectDatabase("hr","manager");
    String q="select * from emp4";
    
    Statement st=cn.createStatement();
//    PreperedStatement ps=cn.prepareStatement(q);

    ResultSet rs=st.executeQuery(q);

    ResultSetMetaData rsmd=rs.getMetaData();
    int numberOfColumns=rsmd.getColumnCount();
    System.out.println(numberOfColumns);
    for (int c=1;c<=numberOfColumns;c++)
    {
       System.out.println(rsmd.getColumnName(c));
       System.out.println(rsmd.getColumnType(c));
       System.out.println(rsmd.getColumnTypeName(c));
       System.out.println(rsmd.getPrecision(c));
       System.out.println(rsmd.getScale(c));
       System.out.println("-----------------------------");
    }

// Types is a class in java.sql that has list of constants refering
//  to each of the datatypes equallant to the datatypes that are in 
//  various databases
    System.out.println(Types.BIT);
    System.out.println(Types.TINYINT);
    System.out.println(Types.NUMERIC);
    System.out.println(Types.VARCHAR);

    rs.close();
    st.close();
    cn.close();
  }
}
