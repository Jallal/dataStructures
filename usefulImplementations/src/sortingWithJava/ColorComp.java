package sortingWithJava;

import java.util.Comparator;

public class ColorComp implements Comparator<SortingDataSample> {


    public int compare(SortingDataSample firstColor, SortingDataSample secondColor) {
        return firstColor.getColor()-secondColor.getColor();
    }
}
