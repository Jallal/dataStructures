package designPatterns.singltonPattern;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){ }

    public static Singleton getInstance(){

        //use Lazy initialization
        if(null==singleton){
            singleton = new Singleton();
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "Singleton {}";
    }
}
