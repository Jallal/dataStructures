

public class ConcreteWindow extends AbstractFactoryWidget {
    @Override
    public AbstractTextField createTextField() {
        return new TextFieldWindow();
    }

    @Override
    public AbstractPushButton createPushButton() {
        return new PushButtonWindow();
    }
}
