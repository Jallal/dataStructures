

public class Client {

    private AbstractTextField abstractTextField;
    private AbstractPushButton abstractPushButton;


    public Client(AbstractFactoryWidget factoryWidget) {

        abstractTextField = factoryWidget.createTextField();
        abstractPushButton = factoryWidget.createPushButton();
    }


    public void run() {
        abstractTextField.displayName(abstractTextField);
        abstractPushButton.displayName(abstractPushButton);
    }


}
