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
  Collections.sort(l,new mycomp());
  out.println(l);
  out.println(Collections.binarySearch(l,'C',new mycomp()));
  out.println(Collections.binarySearch(l,'D',new mycomp()));
  out.println(Collections.binarySearch(l,'D'));
   }
}

class mycomp implements Comparator
  {
    public int compare(Object o1,Object o2)
    {
        Character i1=(Character)o1;
        Character i2=(Character)o2;
        return -i1.compareTo(i2);
    }      
  }