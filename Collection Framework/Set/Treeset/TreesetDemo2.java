import java.util.*;
import java.lang.*;
import static java.lang.System.out;

class TreesetDemo{
   public static void main(String []args)
    {
     TreeSet t = new TreeSet(new MyCompare());
    // t.add("a");
     t.add("1");
     t.add("5");
     t.add("3");
     t.add("0");
    // t.add("A");
     //t.add("b");
    
  out.println(t);
    
    }

}
 class MyCompare implements Comparator
 {
  public int Compare(Object ob1 ,Object ob2)
    {
     Integer i1 =  (Integer)ob1;
     Integer i2 =  (Integer) ob2;
   //   if(i1>i2)
   //       return -1;
   //   else if (i1<i2)
   //       return +100;
   //    else 
   //    return 0;

   return i1.compareTo(i2);
}

 }