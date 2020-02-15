package designPatterns.factoryPattern.modifiedFactoryDesign;

import designPatterns.factoryPattern.simpleFactoryDesign.Pizza;

public class ChicagoPizza extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if(type.equalsIgnoreCase("cheese")){
            return new ChicagoCheesePizza();
        }else if(type.equalsIgnoreCase("Peperoni")) {
            return new ChicagoPeperoniPizza();
        }else {
            return null;
        }
    }
}
