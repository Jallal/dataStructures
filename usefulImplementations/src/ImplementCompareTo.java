import java.util.Date;

public class ImplementCompareTo implements Comparable<Date> {

    private int month;
    private int day;
    private int year;

    @Override
    public int compareTo(Date o) {

        /**
         *
         * implement compareTo() so that v.compareTo(w)
         *
         * is a total order
         * return a negative integer, zero, or a positive integer
         * if v is less than, equal to, or greater than w, respectively
         * Throws an exception if incompatible types (or either is null)
         */
        if (this.day < o.getDay()) return -1;
        if (this.day > o.getDay()) return +1;
        if (this.month < o.getMonth()) return -1;
        if (this.month > o.getMonth()) return +1;
        if (this.year < o.getYear()) return -1;
        if (this.year > o.getYear()) return +1;
        return 0;
    }


    /**
     * Comparable interface is build in to Java
     * <p>
     * public interface Comparable<Item>{
     * public int compareTo(Item that);
     * }
     */

    public boolean equals(Object y) {
        if (y == this) {
            return true;
        }
        if (y == null) {
            return false;
        }
        if (y.getClass() != this.getClass()) {
            return false;
        }


        ImplementCompareTo that = (ImplementCompareTo) y;

        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if(this.year != that.year) return false;

        return true;
    }

}
