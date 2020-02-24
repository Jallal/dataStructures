
/* ConcreteBuilder*/
public class FighterJet extends AirplaneBuilder {

    private Airplane airplane = new Airplane();

    @Override
    public void buildWings() {
        this.airplane.wingSpan = 35.0f;
    }

    @Override
    public void buildPowerplant() {
        this.airplane.powerPlant = "dual thrust vectoring";
    }

    @Override
    public void buildSeats() {
        this.airplane.crewSeats = 1;
        this.airplane.passangerSeats = 0;
    }

    @Override
    public Airplane GetAirplane() {
        return this.airplane;
    }
}
