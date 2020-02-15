package designPatterns.factoryPattern.modifiedFactoryDesign;

import designPatterns.factoryPattern.simpleFactoryDesign.Pizza;

public class ChicagoPeperoniPizza extends Pizza {

    public ChicagoPeperoniPizza(){

        name = " Chicago Peperoni Pizza";
        dough = " Regular Crust";
        sauce = " Marinara Pizza Sauce";
        toppings.add(" Fresh Mozzarella");
        toppings.add(" Parmesan");
    }
}
