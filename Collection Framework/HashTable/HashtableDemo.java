import java.util.*;

class Tej {
  public static void main(String[]  args)
   {
     Hashtable h = new Hashtable(100);
     h.put(new Temp(2),"Raj");
     h.put(new Temp(3),"Mohan");
     h.put(new Temp(31),"Mohan2");
     h.put(new Temp(32),"Mohan2");
     h.put(new Temp(31),"Mohan3");
     h.put(new Temp(32),"Mohan3");
     System.out.println(h);

   }



}

class Temp{
 int i;

 Temp(int i)
  {
      this.i =i;
  }
  public int hashcode()
  {
      return i;
  }
  
 public  String toString()
    {
    return i+"";
    }


}