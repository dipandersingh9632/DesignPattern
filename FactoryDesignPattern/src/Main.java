import components.Button.Button;
import components.Menu.Menu;
import components.dropdown.Dropdown;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        // NOw I pass the platform and get the UIFactory object of  ("Android" OR "iOS")
        UIFactory uiFactory = flutter.createUIFactory("iOS");

        /* NOw comes the overridden method since uiFactory object is of IosUIFactory
        the method that we will call is of iOS Platform
         */

        Button button = uiFactory.createButton();
        button.changeSize();

        Dropdown dropdown = uiFactory.createDropdown();
        dropdown.showAllItems();

        // Same you can do it for Android
    }
}