class InstanceControlFlowFromParentToChild {

int x=10;
{
m1();
System.out.println("Parent Instance Block");
}
InstanceControlFlowFromParentToChild()
{
    System.out.println("Parent Class Constructor");
}
public static void main(String[] args)
{
    InstanceControlFlowFromParentToChild p= new InstanceControlFlowFromParentToChild();
    System.out.println("Parent Class main method");
}
public void m1()
 {
   System.out.println(y);   
 }
 int y=20;
}

class Child extends InstanceControlFlowFromParentToChild
  {
   int i=100;
   {
       m2();
       System.out.println("Child first Instance Block");
   }
   Child()
    {
        System.out.println("Child Class Constructor");
    }
    public static void main(String[] args)
     {
         Child c =new Child();
         System.out.println("Child Clas main method");
     }
     public void m2()
      {
          System.out.println(j);
          System.out.println("child second instance block");
      }
      int j=200;
}

  