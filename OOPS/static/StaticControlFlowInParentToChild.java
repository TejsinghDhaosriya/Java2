public class StaticControlFlowInParentToChild
  {
   static int i =10;
   static {
       m1();
       System.out.println("Base Static Block");

   }
   public static void main(String [] args) {
       m1();
       System.out.println("basee main");
            
   }
   public static void m1()
     {
         System.out.println(j);
     }
     static int j=20;


  }
   class Derived extends StaticControlFlowInParentToChild
   {
    static int x=10;
    static {
        m2();
        System.out.println("dervied first static Block");
 
    }
    public static void main(String [] args) {
        m2();
        System.out.println("dervied main");
             
    }
    public static void m2()
      {
          System.out.println(y);
      }
      static {
   
        System.out.println("dervied 2nd static Block");
 
    }

      static int y=200;
 

   }