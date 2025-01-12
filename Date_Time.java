import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time 
{

    public   static  void basictime_methods()
    {
        
        System.out.println("  present  time  now  is :");
        LocalTime c=  LocalTime.now();
        System.out.println(c);
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        System.out.println(c.getNano());
        System.out.println(c.getClass());
        LocalTime nexthour=c.plusHours(3);
        System.out.println(nexthour);
        LocalTime prhor=c.minusHours(2);
        System.out.println(prhor);
        LocalTime pmin=c.minusMinutes(90);
        System.out.println(pmin);
        boolean isbefore=c.isAfter(LocalTime.of(12,0));
        System.out.println(isbefore);
        boolean  isafter=c.isBefore(LocalTime.of(5,0));
        System.out.println(isafter);
        DateTimeFormatter f= DateTimeFormatter.ofPattern("mm:ss:HH");
        String ss=c.format(f);
        System.out.println(ss);
    }

    public   static  void  localdatetime()
    {
        LocalDateTime ll= LocalDateTime.now();
        System.out.println(ll);
        System.out.println(ll.getDayOfMonth());
        System.out.println(ll.getHour());
        System.out.println(ll.getDayOfYear());
        System.out.println(ll.getMinute());
       ZonedDateTime z= ZonedDateTime.now(ZoneId.of("Asia/kolkata"));
       System.out.println(z);
    }


    public static void main(String[] args) 
    {
        basictime_methods();
        localdatetime();
        
    }
    
}
