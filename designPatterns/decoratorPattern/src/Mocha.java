
public class Mocha extends  CondimentDecorartor {

    Beverage beverage;
    public Mocha(Beverage beverage){

        this.beverage=beverage;
    }


    @Override
    public String getDescription() {
        return this.beverage.getDescription() +" with Mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost()+ 0.20;
    }
}
