class InstanceControlFlow2{

    int i=10;
    {
    m1();
    System.out.println("first instance block");
    }
    InstanceControlFlow2()
    {
    
    System.out.println("Parent classs Constructor");
    }
    public static void main(String[] args)
    {
        InstanceControlFlow2 ICF=new InstanceControlFlow2();
        System.out.println("main method");
        InstanceControlFlow2 ICF2=new InstanceControlFlow2();
    }
    public void m1()
      {
          System.out.println(j);
      }
      {
          System.out.println("second instance block");
      }
      int j=20;
    }