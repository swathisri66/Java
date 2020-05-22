import java.net.*;
class Ip
{
   public static void main(String args[]) throws Exception
   {
      InetAddress obj=InetAddress.getByName("Desktop-C52K64K");    
      // this string is computer name   MyComputer/ThisPC rightclick properties
      System.out.println(InetAddress.getLocalHost()); // shows the computer name and ip address
      System.out.println(obj.getHostName());    // computer name is returned
      System.out.println(obj.getHostAddress());   // prints the ip address 
   }
}
