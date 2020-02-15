package designPatterns.factoryPattern;


import designPatterns.factoryPattern.simpleFactoryDesign.CheesePizza;
import designPatterns.factoryPattern.simpleFactoryDesign.GreekPizza;
import designPatterns.factoryPattern.simpleFactoryDesign.PeperoniPizza;
import designPatterns.factoryPattern.simpleFactoryDesign.Pizza;

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