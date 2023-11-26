
import java.lang.*;
import java.util.*;
import Person;

public class DataArray {

private Person[] arr; //refrence to array
private int nElems; // number of data items


public DataArray(int max){
    
    arr = new Person[max]; //create the array
    nElems =0; //no item yet
}


//find specified value
public Person find(String lastName){

        int j;

        for(j=0; j < arr.length ; j++ ){

        //found the item
        if(lastName.equalsIgnoreCase(arr[j].getLastName)){
        
            // exist the loop
            break;
        }

        // can't find item and reach the end
        if(j == nElems){

            return null;
        }         
    
    }
return arr[j];

}

public void insertPerson(String first, String last, int a){

    arr[nElems] = new Person(first, last, a);
    nElems++;  // increment size
}


public boolean delete(String lastName){

    int j;

    for(j=0; j< nElems ; j++){

        //found the item
        if(lastName.equalsIgnoreCase(arr[j].getLastName())){
            break;
        }
        //reach the end
        if(j == nElems){

            return false;
        }else{

            //shift down
            for(int k=j ; k<nElems; k++){

                arr[k] = arr[k+1];
            }
            nElems--;

            return true;
        }

    }
    return true;
}



public void displyArr(){

for(int i = 0; i < nElems; i++){

    arr[i].displayPerson();

}

}


}
