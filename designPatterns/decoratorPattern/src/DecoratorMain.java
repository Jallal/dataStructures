
public class DecoratorMain {

    public static void main(String[] args){

        Beverage beverage = new DarkRoast();
        System.out.println("We have the following beverage :"+ beverage.description +" and it cost : "+beverage.cost());

        Mocha mocha = new Mocha(beverage);
        System.out.println("The object got decorated :" +mocha.getDescription() +" and it cost : "+mocha.cost());
    }
}
