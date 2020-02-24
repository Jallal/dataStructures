
public class BuilderMain {


    public static void main(String[] args0){

        AerospaceEngineer aerospaceEngineer = new AerospaceEngineer();
          //build crop duster
        CropDuster cropDuster = new CropDuster();
        aerospaceEngineer.constructAirplane(cropDuster);
        cropDuster.GetAirplane().show();

       //build fighterJet
        FighterJet fighterJet = new FighterJet();
        aerospaceEngineer.constructAirplane(fighterJet);
        fighterJet.GetAirplane().show();
    }
}
