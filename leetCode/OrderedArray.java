public class OrderedArray {

    private long[] a; //refer to array a
    private int nElems; // number of data items



//contructor 
public OrderedArray(int max){

a = new long[max]; //create a new array
nElems = 0;
}


public int size(){

    return nElems;
}

public int find(long searchKey){

int lowerBound = 0;
int upperBound = nElems -1;
long curIn;

while(true){

curIn = (lowerBound + upperBound) / 2;

if(a[curIn] == searchKey){
    
    //found it 
  return curIn;

} else if(lowerBound > upperBound){
    //can't find it
    return nElems;
} else{

if(a[curIn] < searchKey){
// the item is in the upper half
 lowerBound = curIn +1;
}else{
// it's in the lower half 
upperBound = curIn -1;
}

}



}




}

    
}
