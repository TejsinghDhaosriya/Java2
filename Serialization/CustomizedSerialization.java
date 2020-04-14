import java.io.*;
import java.util.Scanner;

class Cat implements Serializable{

  String name = "cat";
  transient String pwd = "tej";


  private void writeObject(ObjectOutputStream os) throws Exception
    {
        os.defaultWriteObject();
        String spwd = "123"+pwd;
       os.writeObject(spwd);
    }
   private void readObject(ObjectInputStream is) throws Exception
    {
    is.defaultReadObject();
    String spwd = (String) is.readObject();
    pwd= spwd.substring(3);

    }



}


class CustomizedSerialization
    {
     public static void main(String [] args) throws Exception
      {
        Scanner sc = new Scanner(System.in);
        Cat c = new Cat();
       FileOutputStream fos = new FileOutputStream("serial32.ser");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
      
       oos.writeObject(c);
       // Reading the objects
       
       
       FileInputStream fis = new FileInputStream("serial32.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       Cat c2 = (Cat)ois.readObject();
       System.out.println(c2.name + " "+c2.pwd);


      
    }
        
    }