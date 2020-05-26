import java.util.*;
import static java.lang.System.out;

public class ArrayListSortDesc {
     public static void main(String [] args)
      {
          ArrayList l  = new ArrayList();
          l.add("2");
          l.add("1");
          l.add("3");
          Collections.sort(l,new Comp());
          out.println(l);
      }


}

class Comp implements Comparator
  {
    public int compare(Object o1,Object o2)
     {
         String s1 = (String) o1;
         String s2 = (String) o2;
      
          return s2.compareTo(s1);
        } 

  }