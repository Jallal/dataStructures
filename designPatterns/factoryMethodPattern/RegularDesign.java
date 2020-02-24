package designPatterns.factoryMethodPattern;


import designPatterns.factoryMethodPattern.simpleFactoryDesign.CheesePizza;
import designPatterns.factoryMethodPattern.simpleFactoryDesign.GreekPizza;
import designPatterns.factoryMethodPattern.simpleFactoryDesign.PeperoniPizza;
import designPatterns.factoryMethodPattern.simpleFactoryDesign.Pizza;

/* regular design */
public class RegularDesign {

    /*  The type of pizza is what varies as
     the pizza selection changes over time,
     we will have to modify the code over and over */
    public Pizza orderPizza(String type) {

        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PeperoniPizza();
        }

            /* We expect the below process to stay
            the same as this it has been for ages now*/
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}