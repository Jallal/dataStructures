/* Director*/
public class AerospaceEngineer {
    public void constructAirplane(AirplaneBuilder airplaneBuilder) {
        airplaneBuilder.buildWings();
        airplaneBuilder.buildPowerplant();
        airplaneBuilder.buildSeats();
    }
}
