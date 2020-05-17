import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

class PropertiesDemo
{
  public static void main(String [] args) throws Exception
   {
    Properties p = new Properties();
    FileInputStream fis = new FileInputStream("test.properties");
    p.load(fis);
    System.out.println(p);
    String s =p.getProperty("1234");
    System.out.println(s);
    p.setProperty("1234","mohan");
    System.out.println(p);
    FileOutputStream fos = new FileOutputStream("test.properties");
    p.store(fos,"updated by  tej");
    


   }

}


