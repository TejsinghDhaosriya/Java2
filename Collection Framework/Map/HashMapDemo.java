import java.util.*;

class HashMapDemo{
  public static void main(String[] args)
  {
    HashMap m = new HashMap();
    m.put("100","vijay");
    m.put(200,"ram2");
    m.put(300,"ram3");
    m.put(400,"ram4");
    m.put(500,54);
    Object o = m.get(200);
    //Object o = m.remove(200);
    System.out.println(o);
    System.out.println(m);
   HashMap m2 = new HashMap();
   m2.putAll(m);

  Object o2  = m2.size();
 // m2.clear();
 Set  s= m2.keySet();
 Collection  c= m2.values();
 boolean b= m2.isEmpty();
 System.out.println(b);
 Set entry= m2.entrySet();
 System.out.println(entry);
 System.out.println(c);
 System.out.println(s);
    System.out.println(m2);

 Iterator itr = entry.iterator();
  
 while(itr.hasNext())
   {
       Map.Entry h = (Map.Entry)itr.next();
       System.out.println(h.getKey());
   }


  }


}