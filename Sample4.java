// crating preparedstatement object and performing dml actions 
import java.util.*;
import java.sql.*;
class Sample4 extends Sample1             //sample one is the function to establish database connection
{
  static void modifyRecord() throws Exception
  {
    Scanner sc=new Scanner(System.in);
    String upd="update emp3 set salary= ? where employee_id= ?";
    PreparedStatement ps=cn.prepareStatement(upd);
    char ch;
    do
    {
     System.out.println("enter employee id:");
     ps.setInt(2,sc.nextInt());
     System.out.println("enter salary to be updated:");
     ps.setInt(1,sc.nextInt());
     int nr=ps.executeUpdate();
     if(nr==0)
       System.out.println("employee id entered dosent exist");
     else
       System.out.println("number of rows updated="+nr);
     System.out.println("if you want to continue press y or else press n");
     ch=(char)System.in.read();
    }while(ch=='y'||ch=='Y');
   ps.close(); 
  }
 static void deleteRecord() throws Exception           //to delete a record from given table
   {
     Scanner sc=new Scanner(System.in);
     String del="delete from emp3 where employee_id=?";
     PreparedStatement ps=cn.prepareStatement(del);
     char ch;
     do
     {
      System.out.println("enter the employee id to be deleted");
      ps.setInt(1,sc.nextInt());   
      int nr=ps.executeUpdate();
      if(nr==0)
         System.out.println("column or table dosent exist");
      else
         System.out.println("number of rows updated="+nr);
      System.out.println("if you want to continue press y or else press n");
      ch=(char)System.in.read();
    }while(ch=='y'||ch=='Y');
    ps.close();
 }
 static void insertRecord()  throws Exception           //insert a record into a table
  {
    Scanner sc=new Scanner(System.in);
    String q="insert into emp3 values(?,?,?,?)";
    PreparedStatement ps = cn.prepareStatement(q);
    char ch;
    do
    {
       System.out.print("enter employee_id no ");
       ps.setInt(1,sc.nextInt());
       System.out.print("enter employee name ");
       ps.setString(2,sc.next());
       System.out.print("enter employee salary ");
       ps.setDouble(4,sc.nextDouble());
       System.out.print("enter department_id ");
       ps.setInt(3,sc.nextInt());
       int n=ps.executeUpdate();
       if (n==0)
          System.out.println("record could not be inserted");
       else
         System.out.println("one row inserted");
       System.out.print("Repeat y/n : ");
       ch=(char)System.in.read();
    }while(ch=='y'||ch=='Y');
    ps.close();
  }
static void listOfRecords()  throws Exception  //list of records with given condition i.e., department id
  {
    Scanner sc=new Scanner(System.in);
    String q="select * from emp3 where department_id=?";
    PreparedStatement ps = cn.prepareStatement(q);
    ResultSet rs;
    char ch;
    do
    {
      System.out.println("enter the department id:");
      ps.setInt(1,sc.nextInt());
      int nr=ps.executeUpdate();
      rs=ps.executeQuery();
      while(rs.next()==true)
      {
       System.out.println("Employee id is : "+rs.getInt(1));
       System.out.println("Employee Name  : "+rs.getString(2));
       System.out.println("Department id  : "+rs.getInt(3));
       System.out.println("Emp Salary is  : "+rs.getDouble(4));
       System.out.println("----------------------------------"); 
      }   
      if(nr==0)
         System.out.println("there are no records with this department id");
      else
         System.out.println("number of rows with this department id is:"+nr);
      System.out.print("Repeat search y/n : ");
       ch=(char)System.in.read();
    }while(ch=='y'||ch=='Y');
    ps.close();
  }
  public static void main(String [] args)throws Exception
 {
    Scanner sc=new Scanner(System.in); 
    String un,pw;
    System.out.print("enter user name : ");
    un=sc.next();
    System.out.print("enter password : ");
    pw=sc.next();
    connectDatabase(un,pw);
    int cho;
    do
    {
      System.out.println("********* M e n u *********");
      System.out.println("    1 Insert records");
      System.out.println("    2 Modify records");
      System.out.println("    3 Delete records");
      System.out.println("    4 List of records");
      System.out.println("    5 Exit");
      System.out.print("*** Enter your choice : ");
      cho=sc.nextInt();
      switch(cho)
      {
         case 1 : insertRecord();  break;
         case 2 : modifyRecord();  break;
         case 3 : deleteRecord();  break;
         case 4 : listOfRecords();  break;
         case 5 : System.out.println("end of program"); break;
         default: System.out.println("Invalid choice...retry...");
      }
    }while(cho!=5);
    cn.close();
  }
}