package designPatterns.factoryPattern.modifiedFactoryDesign;

import designPatterns.factoryPattern.simpleFactoryDesign.Pizza;

public class FactoryPattern {

    public static void main(String[] args) {

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.createPizza("cheese");
        System.out.println("We ordered a " + nyPizza.getName() + "\n");

        ChicagoPizza chicagoPizza = new ChicagoPizza();
        Pizza chiPizza = chicagoPizza.createPizza("peperoni");
        System.out.println("We ordered a " + chiPizza.getName() + "\n");

    }
}
