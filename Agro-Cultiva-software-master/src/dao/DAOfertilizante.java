package dao;

import Classes.ConnectionFactory;
import Classes.Fertilizante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class DAOfertilizante {

    public static void inserirFertilizante(Fertilizante fertilizante) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO tbFertilizante (nomeFertilizante, tipoFertilizante, descricao) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, fertilizante.getNomeFertilizante());
            stmt.setString(2, fertilizante.getTipoFertilizante());
            stmt.setString(3, fertilizante.getDescricao());
            stmt.executeUpdate();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

        public static List<String> obterNomesFertilizantes() throws SQLException {
        List<String> nomesFertilizantes = new ArrayList<>();
        String sql = "SELECT nomeFertilizante as nome FROM tbfertilizante";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                nomesFertilizantes.add(rs.getString("nome"));
            }
        }
        return nomesFertilizantes;
    }

    public static int obterIdPorNome(String nomeFertilizante) throws SQLException {
        String sql = "SELECT idFertilizante FROM tbfertilizante WHERE nomeFertilizante = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nomeFertilizante);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idFertilizante");
                } else {
                    throw new SQLException("Fertilizante não encontrado: " + nomeFertilizante);
                }
            }
        }
    }
}
