import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ClienteDAO {


    public void insertarCliente(String nombre, String apellido, String correo) {
        String sql = "INSERT INTO clientes (nombre, apellido, correo) VALUES (?, ?, ?)";
        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setString(3, correo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /* Mostrar todos los clientes */
    public void mostrarClientes() {
        String sql = "SELECT * FROM clientes";
        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
