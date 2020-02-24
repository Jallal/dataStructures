

public class ModifiedFactoryPattern {

    public static void main(String[] args) {

        NYModifiedPizzaStore nyPizzaStore = new NYModifiedPizzaStore();
        Pizza nyPizza = nyPizzaStore.createPizza("cheese");
        System.out.println("We ordered a " + nyPizza.getName() + "\n");

        ChicagoModifiedPizza chicagoPizza = new ChicagoModifiedPizza();
        Pizza chiPizza = chicagoPizza.createPizza("peperoni");
        System.out.println("We ordered a " + chiPizza.getName() + "\n");

    }
}
