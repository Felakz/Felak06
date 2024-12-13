/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista2;


import Interfaces.IMenuController;
import Interfaces.IMenuView;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuPanel extends JPanel implements IMenuView {
    private IMenuController controller;
    
      public MenuPanel() {
        setLayout(new GridLayout(3, 2, 10, 10));
        setBackground(Color.WHITE);

        add(createMenuButton("Estado del Mar", new Color(255, 102, 102), "resources/images/ocean.png", "https://www.dhn.mil.pe/portal/"));
        add(createMenuButton("Flora Marina", new Color(51, 204, 102), "resources/images/flora.png", "https://www.ecologiaverde.com/mar-peruano-caracteristicas-y-animales-2134.html"));
        add(createMenuButton("Fauna Marina", new Color(255, 153, 51), "resources/images/fauna.png", "https://hazla.pe/fauna-marina-del-peru/"));
        add(createMenuButton("Noticias del Mar", new Color(255, 102, 153), "resources/images/news.png", "https://www.gob.pe/institucion/imarpe/noticias"));
        add(createMenuButton("Clima Costero", new Color(255, 153, 0), "resources/images/weather.png", "https://www.senamhi.gob.pe/?p=pronostico-meteorologico   "));
        add(createMenuButton("Acerca de", new Color(51, 153, 255), "resources/images/about.png", null));
    
      }

        private JButton createMenuButton(String text, Color backgroundColor, String iconPath, String url) {
        JButton button = new JButton();
        button.setBackground(backgroundColor);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);

        // Configurar el diseño del botón para centrar el contenido
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);

        // Crear ícono
        try {
            ImageIcon icon = new ImageIcon(iconPath);
            Image scaledIcon = icon.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(scaledIcon));
        } catch (Exception e) {
            System.out.println("Error al cargar ícono: " + iconPath);
        }

        // Agregar texto debajo del ícono
        button.setText("<html><div style='text-align: center;'>" + text + "</div></html>");
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);

        // Agregar acción al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (url != null) {
                    openWebpage(url);
                } else {
                    JOptionPane.showMessageDialog(null, "Esta sección está en construcción.");
                }
            }
        });

        return button;
    }

    private void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir el enlace: " + url);
        }
    }

    @Override
    public void showMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setController(IMenuController controller) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
