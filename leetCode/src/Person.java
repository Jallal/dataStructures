
import java.lang.*;
import java.util.*;

public class Person {


    private String lastName;
    private String firstName;
    private int age;


    //contructor
public Person(String first, String last, int a){

    this.lastName = last;
    this.firstName = first;
    this.age = a;
}

public void displayPerson(){    

System.out.println("First name : "+this.firstName);
System.out.println("Last name :"+this.lastName);
System.out.println("Age : "+this.age);
}


public String getLastName(){

    return this.lastName;
}

public String getFirstName(){

    return this.firstName;
}

public int getAge(){

    return this.age;
}
}
