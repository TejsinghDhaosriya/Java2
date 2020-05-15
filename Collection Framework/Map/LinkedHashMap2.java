import java.util.*;

class LinkedHashMap2{
  public static void main(String[] args)
  {
    LinkedHashMap m = new LinkedHashMap();
    m.put("100","vijay");
    m.put(200,"ram2");
    m.put(300,"ram3");
    m.put(400,"ram4");
    m.put(500,54);
    Object o = m.get(200);
    //Object o = m.remove(200);
    System.out.println(o);
    System.out.println(m);
   LinkedHashMap m2 = new LinkedHashMap();
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
      
     if(h.getKey().equals(300))
      {
          h.setValue(333333333);
      }
      System.out.println(h.getKey()+"..........."+h.getValue());
   }


  }


}