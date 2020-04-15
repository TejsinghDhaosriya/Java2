import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;

class Account implements Serializable
{
    String username = "tej";
    transient String pwd  = "ramu";
    transient int pin = 1234;

    private void writeObject(ObjectOutputStream os) throws Exception
     {
         os.defaultWriteObject();
         int epin = pin + 4444;
         String epwd = "tej" +pwd;
         os.writeObject(epin);
         os.writeObject(epwd);
     }
     private void readObject(ObjectInputStream is) throws Exception
      {
          is.defaultReadObject();
          int epin =(int)is.readObject();
          String epwd =(String) is.readObject();
          pin = 4444-epin;
          pwd = epwd.substring(3);
        }
}

class CustomizedSerializationEx2
 {
  public static void main(String[] args) throws Exception
  {
   Account ac   = new Account();
   FileOutputStream fos = new FileOutputStream("CustomizedSerializationEx2.ser");
   ObjectOutputStream oos = new ObjectOutputStream(fos);
   oos.writeObject(ac);

   FileInputStream fis = new FileInputStream("CustomizedSerializationEx2.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   Account ac2 =(Account)ois.readObject();
   System.out.println(ac2.username +" pwd is "+ac2.pwd +" pin is "+ac2.pin);
   }
 }