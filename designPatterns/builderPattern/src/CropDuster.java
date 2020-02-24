
/* ConcreteBuilder*/
public class CropDuster extends AirplaneBuilder {
    private Airplane airplane = new Airplane();

    @Override
    public void buildWings() {
        this.airplane.wingSpan = 9f;
    }

    @Override
    public void buildPowerplant() {
        this.airplane.powerPlant = "Single Piston";
    }

    @Override
    public void buildSeats() {
        this.airplane.crewSeats = 1;
        this.airplane.passangerSeats = 1;
    }

    @Override
    public Airplane GetAirplane() {
        return this.airplane;
    }
}
