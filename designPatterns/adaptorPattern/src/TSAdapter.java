public class TSAdapter extends TS {

    private TS3Adptee ts3Adptee;

    public TSAdapter(){

        ts3Adptee= new TS3Adptee();
    }


    @Override
    public void getTemp() {

        ts3Adptee.getTempinCelcious();
    }
}
