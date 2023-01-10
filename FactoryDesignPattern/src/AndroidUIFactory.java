import components.Button.AndroidButton;
import components.Menu.AndroidMenu;
import components.dropdown.AndroidDropdown;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        System.out.println("Android Button created");
        return new AndroidButton();
    }

    @Override
    public AndroidDropdown createDropdown() {
        System.out.println("Android dropDown created");
        return new AndroidDropdown();
    }

    @Override
    public AndroidMenu createMenu() {
        System.out.println("Android menu created");
        return new AndroidMenu();
    }
}
