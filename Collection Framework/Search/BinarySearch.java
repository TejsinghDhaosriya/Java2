import java.util.*;
import static java.lang.System.out;

class Tej {
   public static void main(String[] args)
   {
   ArrayList l = new ArrayList();
   l.add('C');
   l.add('F');
   l.add('Q');
   l.add('V');
   l.add('B');
   l.add('A');
   l.add('z');
   l.add('a');
  out.println(l);
  Collections.sort(l);
  out.println(l);
  out.println(Collections.binarySearch(l,'C'));
  out.println(Collections.binarySearch(l,'D'));
   }
}