package dao;

import javax.swing.JOptionPane;
import Classes.ConnectionFactory;
import Classes.Climas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class DAOclima {
    public static void inserirClima(Climas clima) {
        String sql = "INSERT INTO tbclima (idSafra, clima, data, hora, temperatura, descricao) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, clima.getIdSafra());
            stmt.setString(2, clima.getClima());
            stmt.setDate(3, Date.valueOf(clima.getData()));
            stmt.setTime(4, Time.valueOf(clima.getHora()));
            stmt.setFloat(5, clima.getTemperatura());
            stmt.setString(6, clima.getDescricao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados climáticos inseridos com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void alterarClima(Climas clima) {
        String sql = "UPDATE tbclima SET clima = ?, data = ?, hora = ?, temperatura = ?, descricao = ? WHERE idClima = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, clima.getClima());
            stmt.setDate(2, Date.valueOf(clima.getData()));
            stmt.setTime(3, Time.valueOf(clima.getHora()));
            stmt.setFloat(4, clima.getTemperatura());
            stmt.setString(5, clima.getDescricao());
            stmt.setInt(6, clima.getIdClima());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados climáticos atualizados com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static List<Climas> listarClimas() {
        List<Climas> climas = new ArrayList<>();
        String sql = "SELECT * FROM tbclima";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Climas clima = new Climas();
                clima.setIdClima(rs.getInt("idClima"));
                clima.setIdSafra(rs.getInt("idSafra"));
                clima.setClima(rs.getString("clima"));
                clima.setData(rs.getDate("data").toLocalDate());
                clima.setHora(rs.getTime("hora").toLocalTime());
                clima.setTemperatura(rs.getFloat("temperatura"));
                clima.setDescricao(rs.getString("descricao"));
                climas.add(clima);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return climas;
    }
    
    public static List<Climas> listarClimas(String safra) {
        List<Climas> climas = new ArrayList<>();
        String sql = "SELECT c.* " +
                     "FROM tbclima c " +
                     "INNER JOIN tbSafra s ON c.idSafra = s.idSafra " +
                     "WHERE s.nomeSafra = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, safra);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Climas clima = new Climas();
                    clima.setIdClima(rs.getInt("idClima"));
                    clima.setIdSafra(rs.getInt("idSafra"));
                    clima.setClima(rs.getString("clima"));
                    clima.setData(rs.getDate("data").toLocalDate());
                    clima.setHora(rs.getTime("hora").toLocalTime());
                    clima.setTemperatura(rs.getFloat("temperatura"));
                    clima.setDescricao(rs.getString("descricao"));
                    climas.add(clima);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return climas;
    }

    public static void deletarClima(int idClima) {
        String sql = "DELETE FROM tbclima WHERE idClima = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, idClima);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados climáticos excluídos com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados climáticos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
