package designPatterns.factoryPattern.modifiedFactoryDesign;

import designPatterns.factoryPattern.simpleFactoryDesign.Pizza;

public abstract class PizzaStore {


    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);
            /* use factory to create it pizza by simply
            passing on the type of the order*/
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    abstract Pizza createPizza(String type);

}
