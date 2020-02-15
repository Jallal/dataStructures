package designPatterns.factoryPattern.simpleFactoryDesign;

public class PizzaStore{
    /* pizza store will need a reference to the factory*/
    SimplePizzaFactory simplePizzaFactory;


    /* pizza store get the factory passed to it */
    public PizzaStore(SimplePizzaFactory simplePizzaFactory){

        this.simplePizzaFactory=simplePizzaFactory;
    }

    public Pizza orderPizza(String type){

        Pizza pizza;

            /* use factory to create it pizza by simply
            passing on the type of the order*/
        pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

