import java.io.*;
import java.util.Scanner;

class Dog implements Externalizable{
  int id = 34;
  int e  =3;
  String name = "dog";
  public  void writeExternal(ObjectOutput oo ) throws IOException
{
  oo.writeInt(id);
  oo.writeObject(name);
}

public  Dog()
  {
   System.out.println("TEjsingh void const");
  }


public void readExternal(ObjectInput oi) throws IOException ,ClassNotFoundException
{
    id=oi.readInt();
    name=(String)oi.readObject();
}

}

class Externalization_Serialization
    {
     public static void main(String [] args) throws Exception
      { 
        Scanner sc = new Scanner(System.in);
        Dog  d = new Dog();
    //  Cat c = new Cat();
      FileOutputStream fos = new FileOutputStream("serial2.ser");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(d);  
      // oos.writeObject(c);
       // Reading the objects
       
       
       FileInputStream fis = new FileInputStream("serial2.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       Dog d2 = (Dog)ois.readObject();
       //##Cat c2 = (Cat)ois.readObject();
       System.out.println(d2.id + " "+d2.name);
    //   System.out.println(c2.id + " "+c2.name);


      
    }
        
    }