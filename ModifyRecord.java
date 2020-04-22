// program to accept 'empid' and update 'salary' in 'emp4' 

import java.sql.*;
import java.util.*;
class ModifyRecord extends MyDatabaseConnection
{
  public static void main(String args[]) throws Exception
  {
    connectDatabase("hr","manager");
    Statement st=cn.createStatement();
    Scanner sc=new Scanner(System.in);
    char ch;
    do
    {
       System.out.print("enter employee_id no ");
       int empid=sc.nextInt();
       System.out.print("enter employee salary ");
       double sal=sc.nextDouble();

       String q="update emp4 set salary="+sal+" where employee_id="+empid;

       int n=st.executeUpdate(q);
       if (n==0)
          System.out.println("employee_id does not exist");
       else
         System.out.println(n+" rows updated");
       System.out.print("Repeat y/n : ");
       ch=(char)System.in.read();
    }while(ch=='y'||ch=='Y');
    st.close();
    cn.close();
  }
}


