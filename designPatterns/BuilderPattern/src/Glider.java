
public class Glider extends AirplaneBuilder{
    private Airplane airplane = new Airplane();

    @Override
    public void buildWings() {
        this.airplane.wingSpan = 57.1f;
    }

    @Override
    public void buildPowerplant() {
this.airplane.powerPlant="No engine";
    }

    @Override
    public void buildSeats() {
        this.airplane.crewSeats=1;
        this.airplane.passangerSeats=0;

    }

    @Override
    public Airplane GetAirplane() {
        return this.airplane;
    }
}
