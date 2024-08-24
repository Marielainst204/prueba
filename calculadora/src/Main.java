import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Statement statement;
    static Connection con;
    Connection cc () {
        return con;
    }
    public static void conectar() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:8080/coneccion?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "root";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("Conexión exitosa");
            }
            statement = con.createStatement();
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void main(String[] args) throws SQLException {
       conectar();
//hola mari revisa la funcion llllll
    }
}