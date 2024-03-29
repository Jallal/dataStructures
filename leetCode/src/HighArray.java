//  highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
// 

import java.util.Map;

import javax.xml.validation.Schema;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.oas.inflector.examples.models.Example;
import io.swagger.oas.inflector.examples.ExampleBuilder;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.swagger.oas.inflector.processors.JsonNodeExampleSerializer;
import io.swagger.util.Json;
public class HighArray {

public static int nElems; // number of data items
   

    // -----------------------------------------------------------

    // constructor
    public static long[] buildArray(int max) {
    long[] a; // ref to array a
    

        // create the array
        a = new long[max];
        // no items yet
        nElems = 0;

        return a;
    }

    // -----------------------------------------------------------

    public static boolean find(long searchKey,long[] a) {
        boolean val = false;

        // find specified value
        int j;

        // for each element,
        for (j = 0; j < nElems; j++) {

            // found item?
            if (a[j] == searchKey) {
                // exit loop before end
                break;
            }
            // gone to end?
            if (j == nElems) {
                // yes, can't find it
                val = false;
            } else {
                // no, found it
                val = true;
            }
        }
        return val;

    }
    // end find()

    // -----------------------------------------------------------

    // put element into array
    public static void insert(long value,long[] a){

        a[nElems] = value;// insert it
        nElems++;// increment size
    }

    // -----------------------------------------------------------

    public static boolean delete(long value,long[] a) {

        int j;
       // look for it              
        for (j = 0; j < nElems; j++) {
            if (value == a[j]){
                break;
            }
            //can't find it
            if (j == nElems){
            return false;
            // found it
            }
        }

            // move higher ones down
            for (int k = j; k < nElems; k++){
                a[k] = a[k + 1];
                // decrement size
            nElems--;
            }
            return true;

        // end delete()
    }

    // -----------------------------------------------------------

    public static void display(long[] a)// displays array contents
    {
        for (int j = 0; j < a.length; j++)// for each element,
            System.out.print(a[j] + " ");// display it
            System.out.println("");
    }

    //Binary Search 
    public static int findBinaryhSearch(long searchKey, long[] a){

        int lowerBound =0;
        int upperBound = nElems-1;
        int curIn;

        while(true){

            curIn = (lowerBound + upperBound)/2;

            if(a[curIn]==searchKey){

                return curIn; //found it
            } else if(lowerBound> upperBound){

                //Can't find it divide rane
                return nElems;
            }else{

                if(a[curIn] < searchKey){

                    //it's in the upper half
                    lowerBound = curIn + 1;
                } else{
                    // it's in the lower half
                    upperBound = curIn -1;
                }

            }
        }
    }



//put element into the array
    public void insert(long value){

        int j;
//find where does the emelemnt go
        for(j=0; j< nElems; j++){

            //linear search
            if(a[j] > value){
                break;
            }

            //move bigger ones up
            for(int k = nElems; k > j; j--){

                a[k] = a[k-1];
            }

        a[i] = value; // insert it

        nElems++;  //increment the size
        }



    }



public boolean delete(long value){

}





    public static void main(String[] args) {

            int maxSize = 100;// array size
            long[] arr = HighArray.buildArray(maxSize); // create the array
            insert(77,arr); // insert 10 items
            insert(99,arr);
            insert(44,arr);
            insert(55,arr);
            insert(22,arr);
            insert(88,arr);
            insert(11,arr);
            insert(00,arr);
            insert(66,arr);
            insert(33,arr);
            display(arr);// display items
            int searchKey = 35; // search for item
        if (find(searchKey,arr)){
                System.out.println("Found " + searchKey);
        }else{
                System.out.println("Can't find " + searchKey);
                delete(00,arr); // delete 3 items
                delete(55,arr);
                delete(99,arr);
                display(arr);// display items again
        }
    }
}// end class HighArray

