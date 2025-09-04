package company.dao;

import company.model.Cliente;
import company.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    public static void insertClient(Cliente client){
        String querySQL = "INSERT INTO cliente (nome, cpf_cnpj, endereco, cidade, estado) VALUES (?, ?, ?, ?, ?)";
        try(Connection conn = ConnectionDB.connection_db(); PreparedStatement stmt = conn.prepareStatement(querySQL)) {
            stmt.setString(1, client.getNome());
            stmt.setString(2, client.getCpf_cnpj());
            stmt.setString(3, client.getEndereco());
            stmt.setString(4, client.getCidade());
            stmt.setString(5, client.getEstado());
            stmt.executeUpdate();
            System.out.println("Client registered with sucess!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
