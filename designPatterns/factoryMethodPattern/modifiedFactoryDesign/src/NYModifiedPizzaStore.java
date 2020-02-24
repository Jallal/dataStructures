

public class NYModifiedPizzaStore extends ModifiedPizzaStore {

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
