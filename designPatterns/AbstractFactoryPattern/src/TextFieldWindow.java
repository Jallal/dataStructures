

public class TextFieldWindow extends  AbstractTextField{

    @Override
    public void displayName(AbstractTextField abstractTextField) {

        System.out.println(" You're invoking me "+abstractTextField.getClass().getName());

    }
}
