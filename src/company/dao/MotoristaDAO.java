package company.dao;

import company.model.Motorista;
import company.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MotoristaDAO {

    public static void insertTrucker(Motorista trucker){
        String querySQL = "INSERT INTO motorista (nome, cnh, veiculo, cidade_base) VALUES (?, ?, ?, ?)";

        try(Connection conn = ConnectionDB.connection_db(); PreparedStatement stmt = conn.prepareStatement(querySQL)){
            stmt.setString(1, trucker.getNome());
            stmt.setInt(2, trucker.getCnh());
            stmt.setString(3, trucker.getVeiculo());
            stmt.setString(4, trucker.getCidade_base());
            stmt.executeUpdate();
        } catch (SQLException e ){
            e.printStackTrace();
        }
    }
}
