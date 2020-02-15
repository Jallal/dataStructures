package designPatterns.singltonPattern;

public class SingletonPattern {

    public static void main(String[] args){

        //The constructor is private --> can't instatiate
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if(singleton1.equals(singleton2)){

            System.out.println("We are the same instance :" +singleton1.toString());
        }else {

            System.out.println("We are NOT the same instance :" +singleton1.toString());
        }

    }
}
