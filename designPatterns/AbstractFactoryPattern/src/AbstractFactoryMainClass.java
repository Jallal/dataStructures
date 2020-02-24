

public class AbstractFactoryMainClass {

    public static void main(String[] args){

        AbstractFactoryWidget factoryWidget = new ConcreteWindow();
        Client client = new Client(factoryWidget);
        client.run();

    }
}
