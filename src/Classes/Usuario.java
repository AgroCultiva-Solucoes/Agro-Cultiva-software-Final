
package Classes;

import dao.DAOusuario;
//import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private String usuario;
    private String email;
    private String cpf;
    private String senha;
    private boolean adm;

    public Usuario() {
        this.id = 0;
        this.nome = null;
        this.usuario = null;
        this.email = null;
        this.cpf = null;
        this.senha = null;
        this.adm = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }
    
    public static void cadastrarUsuario(Usuario usuario) throws Exception {
        DAOusuario.cadastrarUsuario(usuario);
    }
    
    public static List<Usuario> listarUsuarios() throws Exception {
        return DAOusuario.listarUsuarios();
    }
    
    public static void atualizarUsuario(Usuario usuario) throws Exception {
        DAOusuario.atualizarUsuario(usuario);
    }
    
    
    public boolean validarPermanencia() {
        boolean temId = System.getProperty("id") != null;
        boolean temNome = System.getProperty("nome") != null;
        boolean temUsuario = System.getProperty("usuario") != null;
        boolean temEmail = System.getProperty("email") != null;
        boolean temCpf = System.getProperty("cpf") != null;
        boolean temAdm = System.getProperty("adm") != null;
        
        return temId && temNome && temUsuario && temEmail && temCpf && temAdm;
    }
    
    public void deslogar() {
        System.clearProperty("id");
        System.clearProperty("nome");
        System.clearProperty("usuario");
        System.clearProperty("email");
        System.clearProperty("cpf");
        System.clearProperty("senha");
        System.clearProperty("adm");
    }
}
