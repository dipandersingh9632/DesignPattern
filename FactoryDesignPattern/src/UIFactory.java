import components.Button.Button;
import components.Menu.Menu;
import components.dropdown.Dropdown;

public interface UIFactory {
    /* THESE are nothing but Factory methods as they have diifernt types of return type according to the platform */
    public Button createButton();
    public Dropdown createDropdown();
    public Menu createMenu();
}
