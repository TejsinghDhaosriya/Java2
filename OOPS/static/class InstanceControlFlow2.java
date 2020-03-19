class InstanceControlFlow{

    int i=10;
    {
    m1();
    System.out.println("first instance block");
    }
    InstanceControlFlow()
    {
    
    System.out.println("Parent classs Constructor");
    }
    public static void main(String[] args)
    {
        InstanceControlFlow ICF=new InstanceControlFlow();
        System.out.println("main method");
        InstanceControlFlow ICF2=new InstanceControlFlow();
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