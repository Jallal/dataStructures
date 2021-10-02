
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ControllingCases {

    public static void main(String[] args) {

        /*String name = "Java Cookbook";
        String javaName = "java cookBook";
        System.out.println("Normal:\t" + name);
        System.out.println("Upper:\t" + name.toUpperCase());
        System.out.println("Lower:\t" + name.toLowerCase());

        // If it were Java identifiers :-)
        if (!name.equals(javaName)) {

            System.err.println("equals() correctly reports false");
        } else {

            System.err.println("equals() incorrectly reports true");
        }
        if (name.equalsIgnoreCase(javaName)) {

            System.err.println("equalsIgnoreCase() correctly reports true");
        } else
            System.err.println("equalsIgnoreCase() incorrectly reports false");*/

        //Date class

        // predefined
        Locale frLocale = Locale.FRANCE;
        Locale ukLocale = new Locale("en", "UK");
        // English, UK version
        Locale usLocale = Locale.US;
        DateTimeFormatter defaultDateFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter frDateFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(frLocale);
        DateTimeFormatter ukDateFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(ukLocale);
        DateTimeFormatter usDateFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(usLocale);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Default: " + ' ' + now.format(defaultDateFormatter));
        System.out.println(frLocale.getDisplayName() + ' ' + now.format(frDateFormatter));
        System.out.println(ukLocale.getDisplayName() + ' ' + now.format(ukDateFormatter));
        System.out.println(usLocale.getDisplayName() + ' ' + now.format(usDateFormatter ));
    }
}
