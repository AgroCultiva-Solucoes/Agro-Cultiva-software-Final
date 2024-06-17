package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

    private final String usuario = "root";
    private final String senha = "root";
    private final String host = "localhost";
    private final String porta = "3306";
    private final String bd = "agrocultivasolucoes";

    public Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd
                + "?serverTimezone=UTC",
                usuario,
                senha
            );
            System.out.println("Conexão Efetuada!!");
            return c;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("NÃO CONECTOU!!!");
            return null;
        }
    }

    public static void closeConnection(Connection c, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (c != null) c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection c, PreparedStatement ps) {
        closeConnection(c, ps, null);
    }

    public static void closeConnection(Connection c) {
        closeConnection(c, null, null);
    }

    public static Connection getConnection() throws SQLException {
        return new ConnectionFactory().obtemConexao();
    }
}