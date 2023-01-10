package components.Button;

public class IosButton implements  Button{
    @Override
    public void changeSize() {
        System.out.println("iOS Button size changed");
    }
}
