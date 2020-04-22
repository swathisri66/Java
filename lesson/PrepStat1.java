// program to accept inputs and store the data into the table emp4 
// using PreparedStatement object

import java.sql.*;
import java.util.*;
class PrepStat1 extends MyDatabaseConnection
{
  public static void main(String args[]) throws Exception
  {
    connectDatabase("hr","manager");
    String q="insert into emp4 values(?,?,?,?)";
    PreparedStatement ps = cn.prepareStatement(q);
    Scanner sc=new Scanner(System.in);
    char ch;
    do
    {
       System.out.print("enter employee_id no ");
       ps.setInt(1,sc.nextInt());
       System.out.print("enter employee name ");
       ps.setString(2,sc.next());
       System.out.print("enter employee salary ");
       ps.setDouble(3,sc.nextDouble());
       System.out.print("enter department_id ");
       ps.setInt(4,sc.nextInt());
       int n=ps.executeUpdate();   // no argument
       if (n==0)
          System.out.println("record could not be inserted");
       else
         System.out.println("one row inserted");
       System.out.print("Repeat y/n : ");
       ch=(char)System.in.read();
    }while(ch=='y'||ch=='Y');
    ps.close();
    cn.close();
  }
}
