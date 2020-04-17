
import java.io.*;

class Animal  implements Serializable {
    int id =10 ;
}


class Dog  extends Animal
   {
  
   String name = "Hardik";
   transient int pass =345;
   }
   class Serializat{
public static void main(String[] args) throws Exception
  {
   Dog obj = new Dog();   
  FileOutputStream fos = new FileOutputStream("tejw.ser");
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(obj);


FileInputStream fis = new FileInputStream("tej.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
Dog d2 = (Dog)ois.readObject();



  System.out.println(d2.id+"  "+d2.name+"\n pass is"+d2.pass);




  }




}