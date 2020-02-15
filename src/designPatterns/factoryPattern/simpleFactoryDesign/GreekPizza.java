package designPatterns.factoryPattern.simpleFactoryDesign;

public class GreekPizza extends Pizza {

    public GreekPizza(){

        name = " Greek Pizza";
        dough = " Regular Crust";
        sauce = " Marinara Pizza Sauce";
        toppings.add(" Fresh Mozzarella");
        toppings.add(" Parmesan");
    }
}
