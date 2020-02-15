package designPatterns.factoryPattern.modifiedFactoryDesign;

import designPatterns.factoryPattern.simpleFactoryDesign.Pizza;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza(){

        name = " New York cheese Pizza";
        dough = " Regular Crust";
        sauce = " Marinara Pizza Sauce";
        toppings.add(" Fresh Mozzarella");
        toppings.add(" Parmesan");
    }


}
