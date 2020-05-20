import java.util.*;
import static java.lang.System.out;

class navigableSet{
  public static void main(String[] args)
   {
       TreeSet t = new TreeSet();
       t.add(1);
       t.add(99);
       t.add(77);
       t.add(55);
       t.add(44);
       t.add(444);
       t.add(13)      ;
       t.add(23);
       t.add(53);
        out.println(t);
        out.println(t.lower(444));
        out.println(t.floor(444));
        out.println(t.higher(444));
        out.println(t.ceiling(443));
        out.println(t.pollFirst());
        out.println(t.pollLast());
        out.println(t.descendingSet());
       
   }

}