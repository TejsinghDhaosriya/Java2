import java.util.*;

 class HelloWorld  {
    public static void main(String[] args)
    {
     Scanner sc  = new Scanner(System.in);
     int T = sc.nextInt();
     for (int i =0 ;i<T;i++)
       {
        int sum =1;
        int n =  sc.nextInt();
         while(n>1)
          {
              sum *= n;
              n -=1;
              
              
          }
           System.out.println(sum);
           
       }
        
        
        
    }
}