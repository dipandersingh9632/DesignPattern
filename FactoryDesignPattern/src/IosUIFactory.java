import components.Button.IosButton;
import components.Menu.IosMenu;
import components.dropdown.IosDropdown;

public class IosUIFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        System.out.println("iOS Button created");
        return new IosButton();
    }

    @Override
    public IosDropdown createDropdown() {
        System.out.println("iOS Dropdown created");
        return new IosDropdown();
    }

    @Override
    public IosMenu createMenu() {
        System.out.println("iOS Menu created");
        return new IosMenu();
    }
}
