package usefulImplementations;

import java.util.stream.Stream;


/*
* Search a enum 
*
* */
public enum ValidApp {
    ATT,
    INT;

    public static boolean contains(String appName) {
        return Stream.of(values()).anyMatch(validApp -> validApp.name().equalsIgnoreCase(appName));
    }

    public static boolean isOneOf(String appName, ValidApp... validApps) {
        return Stream.of(validApps).anyMatch(validApp -> validApp.name().equalsIgnoreCase(appName));
    }
}
