import java.util.*;

class Gen<T>
 {
  T obj;
  Gen(T obj)
    {
    this.obj =obj;
    }
 void show()
  {
    System.out.println(obj);  
  }
void  getType()
   {
       System.out.println(obj.getClass().getName());
   }

 }





class NormalGenrics2 {


public static void main(String[] args)
  {

  ArrayList l = new ArrayList();
  Collection c = new ArrayList();
  Collection <String> cw = new ArrayList<String>();
//  Collection <String> cw2 = new ArrayList<int>();
   Gen<Integer> g = new Gen<Integer>(23);  
   g.show();
   g.getType();
   Gen<Object> g2 = new Gen<Object>(3f);  
   g2.show();
   g2.getType();

  }



}