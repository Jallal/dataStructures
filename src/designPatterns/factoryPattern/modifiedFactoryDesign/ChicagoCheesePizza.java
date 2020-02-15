package designPatterns.factoryPattern.modifiedFactoryDesign;

import designPatterns.factoryPattern.simpleFactoryDesign.Pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(){

        name = " Chicago cheese Pizza";
        dough = " Regular Crust";
        sauce = " Marinara Pizza Sauce";
        toppings.add(" Fresh Mozzarella");
        toppings.add(" Parmesan");
    }

}
