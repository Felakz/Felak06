
package Vista2;
import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuItem extends JMenuItem {

    public MenuItem(String text, ActionListener action) {
        super(text);
        addActionListener(action);
    }
}
