
import java.time.*;
import static java.lang.System.out;
import java.util.Scanner;
//import java.time.*;
public class TimeDataAPI4LeapYear {
    public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    out.printf("Enter your year which is to be check that is leap or not");
    int n = sc.nextInt();
    Year y = Year.of(n);
    
    if(y.isLeap())
      {
        out.println("is leap year ");
      }
      else 
      
      out.println("not leap year ");



  }
}