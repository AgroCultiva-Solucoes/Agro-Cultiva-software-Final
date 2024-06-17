/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Classes.ConnectionFactory;
import Classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOusuario {

    public static void cadastrarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO tbusuario (nome, usuario, email, cpf, senha, administrador) VALUES (?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getSenha());
            stmt.setBoolean(6, usuario.isAdm());
            stmt.execute();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public static Usuario Entrar(String email, String senha) throws SQLException {
        String sql = "SELECT * FROM tbusuario WHERE email = ? AND senha = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            Usuario usuario = null;
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setAdm(rs.getBoolean("administrador"));
            }
            return usuario;
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
    }

    public static List<Usuario> listarUsuarios() throws SQLException {
        String sql = "SELECT * FROM tbusuario";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            List<Usuario> usuarios = new ArrayList<>();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setAdm(rs.getBoolean("administrador"));
                usuarios.add(usuario);
            }
            return usuarios;
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
    }

    public static void atualizarUsuario(Usuario usuario) throws SQLException {
        String sql = "UPDATE tbusuario SET nome = ?, usuario = ?, email = ?, cpf = ?, senha = ?, administrador = ? WHERE idUsuario = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getSenha());
            stmt.setBoolean(6, usuario.isAdm());
            stmt.setInt(7, usuario.getId());
            stmt.executeUpdate();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public static void deletarUsuario(int id) throws SQLException {
        String sql = "DELETE FROM tbusuario WHERE idUsuario = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }
    
    public static String obterSenhaPorId(int id) throws SQLException {
    String sql = "SELECT senha FROM tbusuario WHERE idUsuario = ?";
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
        conn = ConnectionFactory.getConnection();
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getString("senha");
        }
        return null;
    } finally {
        ConnectionFactory.closeConnection(conn, stmt, rs);
    }
}
}
