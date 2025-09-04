package company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/logistica_entregas";
    private static final String USER = "root";
    private static final String PASSWORD = "mysqlPW";

    public static Connection connection_db () throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main (String [] args ) throws SQLException{
        try{
            Connection conn = connection_db();

            if (conn != null ){
                System.out.println("Conexão estabelecida com sucesso!!!");
            } else {
                System.out.println("A conexão falhou!!!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
