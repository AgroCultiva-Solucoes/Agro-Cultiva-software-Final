package dao;

import Classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOsafra {
    

    public static int obterIdSafraPorNome(String nomeSafra) throws SQLException {
        int idSafra = -1;
        String sql = "SELECT idSafra FROM tbSafra WHERE nomeSafra = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nomeSafra);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                idSafra = rs.getInt("idSafra");
            }
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao obter ID da safra pelo nome: " + e.getMessage());
        }
        
        return idSafra;
    }
}
