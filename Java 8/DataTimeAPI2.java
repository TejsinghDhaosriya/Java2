
import java.time.*;
import static java.lang.System.out;

import java.time.LocalDate;
public class DataTimeAPI2 {
    public static void main(String[] args)
  {
   LocalDate date = LocalDate.now();
   out.println(date);
   int dd = date.getDayOfMonth();
   int mm = date.getMonthValue();
   int yyyy= date.getYear();
   out.println(dd+"..."+mm+"..."+yyyy);
  out.printf("%d-%d-%d",dd,mm,yyyy);
  }
}