
import java.io.*;




class Dog
   {
  int id =10 ;
 

   }
   class Seriliazation_Demo{
public static void main(String[] args) throws Exception
  {
   Dog obj = new Dog();   
  FileOutputStream fos = new FileOutputStream("tej.ser");
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(obj);


//FileInputStream fis = new FileInputStream("tej.ser");
//ObjectInputStream ois = new ObjectInputStream(fis);
//Dog d2 = (Dog)ois.readObject();



  //System.out.println(d2.id+"  "+d2.name);




  }




}