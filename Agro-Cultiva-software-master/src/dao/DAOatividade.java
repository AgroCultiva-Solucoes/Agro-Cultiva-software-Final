package dao;

import Classes.Atividade;
import Classes.ConnectionFactory;
import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DAOatividade {
    
    public static void InserirAtividade(Atividade ativ) {
        String sql = "INSERT INTO tbatividades(idSafra, idUsuario, tipo, qtdd, dataAtividade, descricao) VALUES (?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, ativ.getIdSafra());
            stmt.setInt(2, ativ.getIdUsuario());
            stmt.setString(3, ativ.getTipo());
            stmt.setDouble(4, ativ.getQtdd());
            stmt.setString(5, ativ.getDataAtividade().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            stmt.setString(6, ativ.getDescricao());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
    
    public static void InserirAtividadeFert(Atividade ativ) {
        String sql = "INSERT INTO tbatividades(idSafra, idUsuario, idFertilizante, tipo, qtdd, dataAtividade, descricao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, ativ.getIdSafra());
            stmt.setInt(2, ativ.getIdUsuario());
            stmt.setInt(3, ativ.getIdFertilizante());
            stmt.setString(4, ativ.getTipo());
            stmt.setDouble(5, ativ.getQtdd());
            stmt.setString(6, ativ.getDataAtividade().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            stmt.setString(7, ativ.getDescricao());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                ConnectionFactory.closeConnection(conn);
            }
        }
    }
    
        public static void InserirAtividadePest(Atividade ativ) {
        String sql = "INSERT INTO tbatividades(idSafra, idUsuario, idPesticida, tipo, qtdd, dataAtividade, descricao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, ativ.getIdSafra());
            stmt.setInt(2, ativ.getIdUsuario());
            stmt.setInt(3, ativ.getIdPesticida());
            stmt.setString(4, ativ.getTipo());
            stmt.setDouble(5, ativ.getQtdd());
            stmt.setString(6, ativ.getDataAtividade().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            stmt.setString(7, ativ.getDescricao());
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                ConnectionFactory.closeConnection(conn);
            }
        }
    }
        
        public static List<Atividade> listarAtividades() {
        List<Atividade> atividades = new ArrayList<>();
        String sql = "SELECT idAtividade, idSafra, idUsuario, tipo, qtdd, dataAtividade, descricao FROM tbatividades";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Atividade ativ = new Atividade();
                ativ.setIdAtividades(rs.getInt("idAtividade"));
                ativ.setIdSafra(rs.getInt("idSafra"));
                ativ.setIdUsuario(rs.getInt("idUsuario"));
                ativ.setTipo(rs.getString("tipo"));
                ativ.setQtdd(rs.getDouble("qtdd"));
                
                // Correção: Converte a data de String para LocalDate com o formato correto
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime dataHora = LocalDateTime.parse(rs.getString("dataAtividade"), formatter);
                ativ.setDataAtividade(dataHora.toLocalDate());
                
                ativ.setDescricao(rs.getString("descricao"));
                
                atividades.add(ativ);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }

        return atividades;
    }
        
    public static ResultSet contarAtividadesPorTipoSafra(String tipoSafra) throws SQLException {
        String sql = "SELECT " +
                     "    s.nomeSafra, " +
                     "    SUM(CASE WHEN a.tipo = 'plantio' THEN a.qtdd ELSE 0 END) AS Plantado, " +
                     "    SUM(CASE WHEN a.tipo = 'colheita' THEN a.qtdd ELSE 0 END) AS Colhido, " +
                     "    SUM(CASE WHEN a.tipo = 'fertilizante' THEN a.qtdd ELSE 0 END) AS `Uso de Fertilizante`, " +
                     "    SUM(CASE WHEN a.tipo = 'pesticida' THEN a.qtdd ELSE 0 END) AS `Uso de Pesticida` " +
                     "FROM tbAtividades a " +
                     "INNER JOIN tbSafra s ON a.idSafra = s.idSafra " +
                     "WHERE s.nomeSafra = ? " +
                     "  AND a.tipo IN ('plantio', 'colheita', 'fertilizante', 'pesticida') " +
                     "GROUP BY s.nomeSafra";

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, tipoSafra);
        ResultSet rs = stmt.executeQuery();
        return rs;  
    }

        public static boolean deletarAtividade(int idAtividade) {
        Connection conn = null;
        PreparedStatement stmt = null;
        String sql = "DELETE FROM tbatividades WHERE idAtividade = ?";
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idAtividade);
            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
}
