import java.io.*;
import java.util.Scanner;
class Rat implements Serializable 
{
   Cat c = new Cat(); 
}

class Cat implements Serializable{
  Dog d = new Dog();

}
class Dog implements Serializable{
  int id = 34;
  String name = "dog";

}

class Object_graph
    {
     public static void main(String [] args) throws Exception
      {
        Scanner sc = new Scanner(System.in);
        Rat r =new Rat();
       FileOutputStream fos = new FileOutputStream("serial2.ser");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(r);
       
       // Reading the objects
       
       
       FileInputStream fis = new FileInputStream("serial2.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       Rat r2  = (Rat)ois.readObject();
       System.out.println(r2.c.d.id + " "+r2.c.d.name);

      
    }
        
    }