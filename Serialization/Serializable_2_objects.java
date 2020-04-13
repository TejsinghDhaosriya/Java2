import java.io.*;
import java.util.Scanner;

class Cat implements Serializable{
  int id =22;
  String name = "cat";

}
class Dog implements Serializable{
  int id = 34;
  String name = "dog";

}

class Serializable_2_objects
    {
     public static void main(String [] args) throws Exception
      {
        Scanner sc = new Scanner(System.in);
        Dog  d = new Dog();
        Cat c = new Cat();
       FileOutputStream fos = new FileOutputStream("serial2.ser");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(d);
       oos.writeObject(c);
       // Reading the objects
       
       
       FileInputStream fis = new FileInputStream("serial2.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       Dog d2 = (Dog)ois.readObject();
       Cat c2 = (Cat)ois.readObject();
       System.out.println(d2.id + " "+d2.name);
       System.out.println(c2.id + " "+c2.name);


      
    }
        
    }