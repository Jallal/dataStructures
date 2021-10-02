import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetDuplicatedNumberInAnyArray {

    public int getDuplicatedNumber(int[] numbers){

        int length = numbers.length;
        int sum1 = 0;

        for(int i=0; i< length; i++){
            if(numbers[i]<0 || numbers[i]>length-1){

                throw new IllegalArgumentException("Invalid numbers");
            }
        }

        for(int i=0; i< length; i++){
            while(numbers[i]!=i){
                System.out.print("******************** : TESTING VALUES --> "+numbers[i]+" == "+numbers[numbers[i]] +"\n");

                if(numbers[i]==numbers[numbers[i]]){
                    return numbers[i];
                }
                //swap numbers[i] and numbers[numbers[i]]

                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp]=temp;
            }
        }
        throw new IllegalArgumentException("No duplicate found");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        GetDuplicatedNumberInAnyArray getDuplicatedNumberInAnyArray = new GetDuplicatedNumberInAnyArray();

        int[] array = {1,4,1,3,2,1};

        System.out.print("******************** : duplicated number is : "+getDuplicatedNumberInAnyArray.getDuplicatedNumber(array)+"\n");


        Object o = "Hello World";
        Method toString = Object.class.getMethod("toString");
       System.out.println(toString.invoke(o));
    }

}
