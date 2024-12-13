/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista2;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MenuButton extends JButton {
    private String itemName;

    public MenuButton(String itemName, String iconPath, String url) {
        this.itemName = itemName;
        setText(itemName);
        setIcon(new ImageIcon(iconPath));
        addActionListener(e -> openLink(url));
    }

    private void openLink(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


