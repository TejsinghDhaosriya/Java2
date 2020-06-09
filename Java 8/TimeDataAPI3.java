
import java.time.*;
import static java.lang.System.out;

import java.time.*;
public class TimeDataAPI3 {
    public static void main(String[] args)
  {
   LocalDateTime date = LocalDateTime.now();
  // out.println(date);
   int dd = date.getDayOfMonth();
   int mm = date.getMonthValue();
   int yyyy= date.getYear();
  // out.println(dd+"..."+mm+"..."+yyyy);
  out.printf("%d-%d-%d",dd,mm,yyyy);
  

  int h = date.getHour();
  int m = date.getMinute();
  int s = date.getSecond();
  int ns = date.getNano();
  out.printf("%d:%d:%d:%d",h,m,s,ns);
  out.printf("\n");

  LocalDateTime dt = LocalDateTime.of(1999,Month.JULY,07,12,34);
  out.println(dt);
  
  out.println(dt.plusMonths(8));
  out.println(dt.minusMonths(3));



LocalDate birthday = LocalDate.of(1999,Month.JULY,22);
LocalDate today = LocalDate.now();
Period p = Period.between(birthday,today);
out.printf("Your age is %d years %d month %d days",p.getYears(),p.getMonths(),p.getDays());



  }
}