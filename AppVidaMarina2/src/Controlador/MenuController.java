
package Controlador;

import Interfaces.IMenuController;
import Interfaces.IMenuModel;
import Interfaces.IMenuView;
import Modelo.MenuModel;
import Vista2.MenuButton;

public class MenuController implements IMenuController {
    
    private IMenuView view;
    private IMenuModel model;

    public MenuController(IMenuView view) {
        this.view = view;
        this.model = MenuModel.getInstance(); // Usamos Singleton
    }

    @Override
    public void handleMenuItemClick(String item) {
        model.getMenuItemDetails(item);
    }
    
    public class MenuFactory {
    public static MenuButton createMenuButton(String text, String iconPath, String url) {
        return new MenuButton(text, iconPath, url);
    }
    
}public class MenuItemPrototype implements Cloneable {
    
    private String name;
    private String url;
    private String iconPath;


    @Override
    public MenuItemPrototype clone() throws CloneNotSupportedException {
        return (MenuItemPrototype) super.clone();
    }
}


}
