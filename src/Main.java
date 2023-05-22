import interfaz.Menu;

public class Main {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.mostrarClientes();
        ConexionBD conexionBD = new ConexionBD();
        ConexionBD.verificarConexion();
        Menu menu = new Menu();
    }
}