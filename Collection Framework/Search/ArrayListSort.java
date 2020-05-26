import java.util.*;
import static java.lang.System.out;

public class ArrayListSortDesc {
     public static void main(String [] args)
      {
          ArrayList l  = new ArrayList();
          l.add("2");
          l.add("1");
          l.add("3");
          Collections.sort(l);
          out.println(l);
      }


}
