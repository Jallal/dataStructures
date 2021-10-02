import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaDateAndTimeAPI {


    public static void main(String[] args) {


        Date endOfTime = new Date(Long.MAX_VALUE);
        System.out.println("Java time overflows on " + endOfTime);

        //finding today's date
        LocalDate dNow = LocalDate.now();
        System.out.println(dNow);

        LocalTime tNow = LocalTime.now();
        System.out.println(tNow);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //using the clock variable
        Clock clock = Clock.systemDefaultZone();
        System.out.println("It is now " + LocalDateTime.now(clock));


        // Format a date ISO8601-like but with slashes instead of dashes
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/LL/dd");

        System.out.println(df.format(LocalDate.now()));

        // Parse a String to a date using the same formatter
        System.out.println(LocalDate.parse("2014/04/01", df));

        // Format a Date and Time without timezone information
        DateTimeFormatter nTZ = DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
        System.out.println(ZonedDateTime.now().format(nTZ));


        //Convert a number of seconds since the epoch to a local date/time
        Instant epochSec = Instant.ofEpochSecond(1000000000L);
        ZoneId zId = ZoneId.systemDefault();
        ZonedDateTime then = ZonedDateTime.ofInstant(epochSec, zId);
        System.out.println("The epoch was a billion seconds old on " + then);

        // Convert a date/time to epoch seconds
        long epochSecond = ZonedDateTime.now().toInstant().getEpochSecond();
        System.out.println("Current epoch seconds = " + epochSecond);
        LocalDateTime lnow = LocalDateTime.now();
        ZonedDateTime there = now.atZone(ZoneId.of("Canada/Pacific"));
        System.out.printf("When it's %s here, it's %s in Vancouver%n", lnow, there);

        //parsing Strings into dates

        String armisticeDate = "1914-11-11";
        LocalDate aLD = LocalDate.parse(armisticeDate);
        System.out.println("Date: " + aLD);
        String armisticeDateTime = "1914-11-11T11:11";
        LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);
        System.out.println("Date/Time: " + aLDT);

        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd MMM uuuu");
        String anotherDate = "27 Jan 2011";
        LocalDate random = LocalDate.parse(anotherDate, df2);
        System.out.println(anotherDate + " parses as " + random);

    }
}
