package Vista2;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu ;
 private static FrmMenu instance;
    FrmMenu() {
        initComponents();
        this.setSize(new Dimension(800, 300));
        this.setExtendedState(FrmMenu.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Aplicativo Vida Marina");
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);

    }
  public static FrmMenu getInstance() {
        if (instance == null) {
            instance = new FrmMenu();
        }
        return instance;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Usuario = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        FloraMarina = new javax.swing.JMenuItem();
        FaunaMarina = new javax.swing.JMenuItem();
        jEstadoMar = new javax.swing.JMenuItem();
        Clima = new javax.swing.JMenuItem();
        Noticias = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(150, 200));

        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        Usuario.setText("Usuario");
        Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuario.setMaximumSize(new java.awt.Dimension(150, 100));
        Usuario.setMinimumSize(new java.awt.Dimension(150, 200));
        Usuario.setPreferredSize(new java.awt.Dimension(100, 100));

        jMenuItem_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        Usuario.add(jMenuItem_nuevo_usuario);

        jMenuBar1.add(Usuario);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu1.setText("Menu");
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setMaximumSize(new java.awt.Dimension(150, 100));
        jMenu1.setMinimumSize(new java.awt.Dimension(150, 200));
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 100));

        FloraMarina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file.png"))); // NOI18N
        FloraMarina.setText("Flora Marina");
        FloraMarina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FloraMarinaActionPerformed(evt);
            }
        });
        jMenu1.add(FloraMarina);

        FaunaMarina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file (2).png"))); // NOI18N
        FaunaMarina.setText("Fauna Marina");
        FaunaMarina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaunaMarinaActionPerformed(evt);
            }
        });
        jMenu1.add(FaunaMarina);

        jEstadoMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file (1).png"))); // NOI18N
        jEstadoMar.setText("Estado del mar");
        jEstadoMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoMarActionPerformed(evt);
            }
        });
        jMenu1.add(jEstadoMar);

        Clima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file (4).png"))); // NOI18N
        Clima.setText("Clima Costero");
        Clima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClimaActionPerformed(evt);
            }
        });
        jMenu1.add(Clima);

        Noticias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file (3).png"))); // NOI18N
        Noticias.setText("Noticias sobre el mar");
        Noticias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoticiasActionPerformed(evt);
            }
        });
        jMenu1.add(Noticias);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu4.setText("Cerrar Sesion");
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setMaximumSize(new java.awt.Dimension(150, 100));
        jMenu4.setMinimumSize(new java.awt.Dimension(150, 200));
        jMenu4.setPreferredSize(new java.awt.Dimension(100, 100));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed
        InterUsuario interUsuario = new InterUsuario();
        jDesktopPane_menu.add(interUsuario);
        interUsuario.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void FaunaMarinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaunaMarinaActionPerformed
        abrirEnlace("https://hazla.pe/fauna-marina-del-peru/");
    }//GEN-LAST:event_FaunaMarinaActionPerformed

    private void FloraMarinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FloraMarinaActionPerformed
        abrirEnlace("https://www.ecologiaverde.com/mar-peruano-caracteristicas-y-animales-2134.html");
    }//GEN-LAST:event_FloraMarinaActionPerformed

    private void jEstadoMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoMarActionPerformed
        abrirEnlace("https://www.dhn.mil.pe/portal/");
    }//GEN-LAST:event_jEstadoMarActionPerformed

    private void ClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClimaActionPerformed
        abrirEnlace("https://www.senamhi.gob.pe/?p=pronostico-meteorologico");
    }//GEN-LAST:event_ClimaActionPerformed

    private void NoticiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoticiasActionPerformed
        abrirEnlace("https://www.gob.pe/institucion/imarpe/noticias");
    }//GEN-LAST:event_NoticiasActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FrmMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Clima;
    private javax.swing.JMenuItem FaunaMarina;
    private javax.swing.JMenuItem FloraMarina;
    private javax.swing.JMenuItem Noticias;
    private javax.swing.JMenu Usuario;
    private javax.swing.JMenuItem jEstadoMar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    // End of variables declaration//GEN-END:variables

    private void abrirEnlace(String url) {
        try {
            // Verifica si Desktop es soportado en este sistema
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI(url));
            } else {
                System.err.println("El sistema no soporta esta funcionalidad.");
            }
        } catch (IOException | URISyntaxException e) {
        }
    }
}
