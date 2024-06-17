package dao;

import Classes.ConnectionFactory;
import Classes.Pesticida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOpesticida {

    public static void inserirPesticida(Pesticida pesticida) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO tbPesticida (nomePesticida, tipoPesticida, descricao) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pesticida.getNomePesticida());
            stmt.setString(2, pesticida.getTipoPesticida());
            stmt.setString(3, pesticida.getDescricao());
            stmt.executeUpdate();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public static List<Pesticida> listarPesticidas() throws SQLException {
        String sql = "SELECT * FROM tbPesticida";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            List<Pesticida> pesticidas = new ArrayList<>();
            while (rs.next()) {
                Pesticida pesticida = new Pesticida();
                pesticida.setIdPesticida(rs.getInt("idPesticida"));
                pesticida.setNomePesticida(rs.getString("nomePesticida"));
                pesticida.setTipoPesticida(rs.getString("tipoPesticida"));
                pesticida.setDescricao(rs.getString("descricao"));
                pesticidas.add(pesticida);
            }
            return pesticidas;
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
    }
    
    public static List<String> obterNomesPesticidas() throws SQLException {
        List<String> nomesPesticidas = new ArrayList<>();
        String sql = "SELECT nomePesticida FROM tbpesticida";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                nomesPesticidas.add(rs.getString("nomePesticida"));
            }
        }
        return nomesPesticidas;
    }

    public static int obterIdPorNome(String nomePesticida) throws SQLException {
        String sql = "SELECT idPesticida FROM tbpesticida WHERE nomePesticida = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nomePesticida);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idPesticida");
                } else {
                    throw new SQLException("Pesticida não encontrado com o nome: " + nomePesticida);
                }
            }
        }
    }
}
