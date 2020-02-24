

public class PushButtonWindow extends AbstractPushButton {


    @Override
    public void displayName(AbstractPushButton abstractPushButton) {

     System.out.println(" You're invoking me "+abstractPushButton.getClass().getName());
    }
}
