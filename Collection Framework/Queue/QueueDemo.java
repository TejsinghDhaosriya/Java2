import java.util.*;

public class QueueDemo2 {
public static void main(String[] args)
 {
  PriorityQueue pq=  new PriorityQueue();
   pq.offer("a");
   pq.offer("b");
   pq.offer("l");
   pq.offer("p");
   pq.offer("x");
   pq.offer("w");
   //pq.offer(1);
 //  pq.offer("2");
 
   System.out.println(pq);
   System.out.println(pq.poll());
   System.out.println(pq.peek());
   System.out.println(pq);
 
 }
    

}