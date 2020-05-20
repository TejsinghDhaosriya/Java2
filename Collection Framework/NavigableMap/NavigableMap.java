import java.util.*;
import static java.lang.System.out;

class NavigableMap{
  public static void main(String[] args)
   {
       TreeMap t = new TreeMap();
       t.put(1,"dd");
        t.put(2,99);
    //    t.add(77);
       t.put(11,"dd");
        t.put(22,99);
    //    t.add(77);
       t.put(14,"dd");
        t.put(24,99);
    //    t.add(77);
    //    t.add(55);
    //    t.add(44);
    //    t.add(444);
    //    t.add(13)      ;
    //    t.add(23);
    //    t.add(53);
    //     out.println(t);
        out.println(t.lowerKey(444));
        out.println(t.floorKey(444));
        out.println(t.higherKey(444));
        out.println(t.ceilingKey(443));
        out.println(t.pollFirstEntry());
        out.println(t.pollLastEntry());
        out.println(t.descendingMap());
       
   }

}