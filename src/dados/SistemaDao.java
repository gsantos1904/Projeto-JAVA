package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SistemaDao {

    private Connection conectado;
    private PreparedStatement st;
    private ResultSet resultado;
    private final String url = "jdbc:mysql://localhost:3307/insuranceforce";
    private final String user = "root";
    private final String senha = "admin";
    
    private void conectar() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        conectado = DriverManager.getConnection(url, user, senha);

    }

    public void cadastrarUsuario(String n,String s, String e, String c, String end, String t) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?,?,?)");
        st.setString(1, n);
        st.setString(2, s);
        st.setString(3, e);
        st.setString(4, c);
        st.setString(5, end);
        st.setString(6, t);
        st.executeUpdate();

    }
    
     public void excluirUsuario(String c) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("DELETE FROM usuario WHERE cpf = ?");
        st.setString(1, c);
        st.executeUpdate(); //executa os comandos insert, update e delete
    }
     
     public void alterarUsuarios (String n, String s, String e, String end, String t, String c) throws ClassNotFoundException, SQLException{
        conectar();
            st = conectado.prepareStatement("UPDATE usuario SET nome = ?, senha = ?, email = ?, endereco = ?, tipodeseguro = ? WHERE cpf = ?");
            st.setString(1, n);
            st.setString(2, s);
            st.setString(3, e);
            st.setString(4, end);
            st.setString(5, t);
            st.setString(6, c);
            st.executeUpdate();

        
    }
     
     public ResultSet buscarUsuario(String c) throws ClassNotFoundException, SQLException{
        conectar();
            st = conectado.prepareStatement("SELECT * FROM usuario WHERE cpf = ? ");
            st.setString(1, c);
            ResultSet resultado = st.executeQuery();
            return resultado;
 
    }
     
     public ResultSet validarUsuario(String cpf, String senha) throws SQLException, ClassNotFoundException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario WHERE cpf = ? AND senha = ?");
        st.setString(2, senha);
        st.setString(1, cpf);
        resultado = st.executeQuery();
        return resultado;
    }
     
     public ResultSet listarUsuarios() throws ClassNotFoundException, SQLException{
        conectar();
            st = conectado.prepareStatement("SELECT * FROM usuario ORDER BY cpf ASC");
            ResultSet resultado = st.executeQuery();
            return resultado;
          
    }
     //------------------------------------------------------Tabela Admin-----------------------------------------------------
     
     public ResultSet validarUsuarioAdmin(String cpf, String senha) throws SQLException, ClassNotFoundException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM admin WHERE cpf = ? AND senha = ?");
        st.setString(2, senha);
        st.setString(1, cpf);
        resultado = st.executeQuery();
        return resultado;
    }

}
