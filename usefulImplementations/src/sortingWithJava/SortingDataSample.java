package sortingWithJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Comparators in Depth
 * To sort any collection of data, you need a way to compare the individual elements in that collection.
 * There are many different ways to perform the sorting—bubble sorting, quick sorting, merge sorting, etc.—but all
 * those algorithms still need the ability to decide if one element should go before or after some other element.
 *
 * Some elements are easy to compare. A list of simple numbers, for example, can be sorted with the built-in
 * comparison operators like < and > and ==. Many languages extend the use of such operators to more interesting
 * types of data like strings or objects. The String class in Java has some methods to make comparing strings easy,
 * but what about your own, custom classes? Instances of your classes can certainly be sorted, you just have
 * to supply the right logic in a format Java can use.
 *
 * ******Comparable and Comparator
 * The “old school” approach in Java uses either the Comparable interface to add the proper comparison logic
 * to your class directly, or the Comparator interface to create a class that can compare two objects—even objects
 * of different types. With an implementation of either of those interfaces, you can use Java's Collections
 * API to sort your data.
 *
 * Let's create a simple class for colors. You don't normally think of sorting colors, but that's kind of ("sort" of?)
 * the point! We'll look at how we might order colors using both Comparable and Comparator and then see
 * how lambdas can do the same work.
 *
 * We'll store the classic red, green, and blue elements you find used all the time in web colors.
 * In fact, we'll override the toString() method from the Object class to print our colors as six hex characters
 * like you might find in a CSS file. Try typing in this class and then compile and run it to make sure our colors
 * are working
 *
 * */
public class SortingDataSample {
    int r,g,b;

    public SortingDataSample(int r, int g, int b){

        this.r=r;
        this.g=g;
        this.b=b;
    }

    public int getRed(){

        return this.r;
    }
    public int getBlue(){

        return this.b;
    }
    public int getGreen(){

        return this.g;
    }

    public int getColor(){
        return (r<<16)+(g<<8)+b;
    }

    @Override
    public String toString(){

        return String.format("#%06x",getColor());
    }
    public static void main(String[] args){

        ColorComp colorComp = new ColorComp();
        List<SortingDataSample> colorList = new ArrayList<>();
        SortingDataSample white = new SortingDataSample(255,255,255);
        SortingDataSample sky = new SortingDataSample(106,207,247);
        colorList.add(white);
        colorList.add(sky);
        System.out.println("Pre-Sorting :");
        final  AtomicInteger firstCounter = new AtomicInteger(0);
        colorList.forEach( i-> System.out.println("Item " +firstCounter.getAndIncrement() +" : " + i.toString()));
        //Collections.sort(colorList,colorComp);
        Collections.sort(colorList,(x,y)-> x.getColor()-y.getColor());
        System.out.println("Post-Sorting :");
        final  AtomicInteger secondCounter = new AtomicInteger(0);
        colorList.forEach( i-> System.out.println("Item "+secondCounter.getAndIncrement() +" : " + i.toString()));
        System.out.println(" White is :"+white.toString());
        System.out.println(" Sky color is :"+sky.toString());
    }

}
