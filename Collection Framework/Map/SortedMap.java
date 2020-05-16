import java.util.*;
import java.lang.*;

class SortedMap{
  public static void main(String[] args)
  {
    TreeMap m = new TreeMap(new MyComparato());
    m.put("A","vijay");
    m.put("C","ram2");
    m.put("D","ram3");
    m.put("B","ram4");
    m.put("Z",54);
   // Object o = m.get(200);
    //Object o = m.remove(200);
    //System.out.println(o);
    System.out.println(m);


}
}

class MyComparato implements Comparator
{
public int compare(Object obj1, Object obj2)
{
    String s1 = obj1.toString();
    String s2 = obj2.toString();
    return -s1.compareTo(s2);
}


}