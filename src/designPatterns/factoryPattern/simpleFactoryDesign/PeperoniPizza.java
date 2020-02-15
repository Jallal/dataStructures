package designPatterns.factoryPattern.simpleFactoryDesign;

public class PeperoniPizza extends Pizza {

    public PeperoniPizza(){

        name = " Peperoni Pizza";
        dough = " Regular Crust";
        sauce = " Marinara Pizza Sauce";
        toppings.add(" Fresh Mozzarella");
        toppings.add(" Parmesan");
    }
}
