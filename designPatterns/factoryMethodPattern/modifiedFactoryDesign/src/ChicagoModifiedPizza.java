

public class ChicagoModifiedPizza extends ModifiedPizzaStore {
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
