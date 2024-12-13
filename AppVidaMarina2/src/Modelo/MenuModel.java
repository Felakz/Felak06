
package Modelo;

import Interfaces.IMenuModel;


public class MenuModel implements IMenuModel {
    private static MenuModel instance;

    private MenuModel() {
    }

    public static MenuModel getInstance() {
        if (instance == null) {
            instance = new MenuModel();
        }
        return instance;
    }

    @Override
    public void loadMenuItems() {
    }

    @Override
    public void getMenuItemDetails(String item) {
    }
    public class MenuItemPrototype implements Cloneable {
    private String name;
    private String url;
    private String iconPath;
    
    @Override
    public MenuItemPrototype clone() throws CloneNotSupportedException {
        return (MenuItemPrototype) super.clone();
    }
}

}
