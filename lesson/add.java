// program to accept user input for 2 variables and print their sum
import java.util.Scanner;
class Add
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x;
    double y, z;
    System.out.println("enter an integer value ");
    x=sc.nextInt();
    System.out.println("enter a double value ");
    y=sc.nextDouble();
    z=x+y;
    System.out.println("the sum is "+z);

  }
}
