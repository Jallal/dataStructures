package designPatterns.factoryPattern.modifiedFactoryDesign;

import designPatterns.factoryPattern.simpleFactoryDesign.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        if(type.equalsIgnoreCase("cheese")){
            return new NYCheesePizza();
        }else if(type.equalsIgnoreCase("Peperoni")) {
            return new NYPeperoniPizza();
        }else{
            return null;
        }
    }
}
