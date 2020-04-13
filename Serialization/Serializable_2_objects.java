import java.io.*;
import java.util.Scanner;

class Cat{
  int id =22;
  String name = "cat";

}
class Dog{
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
          


      
    }
        
    }