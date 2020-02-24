
import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public  String name;
    public String dough;
    public String sauce;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> toppings = new ArrayList<>();

    public void prepare() {

        System.out.println("Preparing :"+name);
    }
    public void bake() {

        System.out.println("baking :"+name);
    }
    public void cut() {

        System.out.println("cutting :"+name);
    }
    public void box() {

        System.out.println("boxing :"+name);
    }
}
