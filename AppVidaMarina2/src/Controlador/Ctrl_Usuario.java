package Controlador;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Modelo.Usuario;

public class Ctrl_Usuario {
    
    private static Ctrl_Usuario instance;
    public Ctrl_Usuario() { }

    
    public static Ctrl_Usuario getInstance() {
        if (instance == null) {
            instance = new Ctrl_Usuario();
        }
        return instance;
    }
    
    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        try (Connection cn = Conexion.conectar()) {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_usuario VALUES(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); // ID
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());
            consulta.setInt(7, objeto.getEstado());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e);
        }
        return respuesta;
    }

   
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "SELECT usuario FROM tb_usuario WHERE usuario = ?";
        try (Connection cn = Conexion.conectar(); 
             PreparedStatement st = cn.prepareStatement(sql)) {
            st.setString(1, usuario);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e);
        }
        return respuesta;
    }

    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        String sql = "SELECT usuario, password FROM tb_usuario WHERE usuario = ? AND password = ?";
        try (Connection cn = Conexion.conectar(); 
             PreparedStatement st = cn.prepareStatement(sql)) {
            st.setString(1, objeto.getUsuario());
            st.setString(2, objeto.getPassword());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }

    public boolean actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        String sql = "UPDATE tb_usuario SET nombre=?, apellido=?, usuario=?, password=?, telefono=?, estado=? WHERE idUsuario=?";
        try (Connection cn = Conexion.conectar(); 
             PreparedStatement consulta = cn.prepareStatement(sql)) {
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getPassword());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6, objeto.getEstado());
            consulta.setInt(7, idUsuario);
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e);
        }
        return respuesta;
    }

   
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        String sql = "DELETE FROM tb_usuario WHERE idUsuario=?";
        try (Connection cn = Conexion.conectar(); 
             PreparedStatement consulta = cn.prepareStatement(sql)) {
            consulta.setInt(1, idUsuario);
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e);
        }
        return respuesta;
    }
}
