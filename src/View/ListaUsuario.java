package View;

import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaUsuario extends javax.swing.JFrame {

    public ListaUsuario() {
        initComponents();
        preencherTabela();
    }

    private void preencherTabela() {
        try {
            SistemaDao dao;
            dao = new SistemaDao();
            ResultSet resultado = dao.listarUsuarios();

            //3 - Carregar os usuários na tabela tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);//Limpa a tabela
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("nome"),
                    resultado.getString("senha"),
                    resultado.getString("email"),
                    resultado.getString("cpf"),
                    resultado.getString("endereco"),
                    resultado.getString("tipodeseguro"),};

                tblModelo.addRow(dados);

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIconUsuario = new javax.swing.JLabel();
        lblTextoLista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Insurance Force - LISTAR USUARIOS");
        getContentPane().setLayout(null);

        lblIconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/icone usuario.png"))); // NOI18N
        getContentPane().add(lblIconUsuario);
        lblIconUsuario.setBounds(50, 20, 80, 60);

        lblTextoLista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTextoLista.setForeground(new java.awt.Color(0, 51, 204));
        lblTextoLista.setText("Lista Usuários");
        getContentPane().add(lblTextoLista);
        lblTextoLista.setBounds(140, 40, 130, 30);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Senha", "Email", "CPF", "Endereço", "Tipo de Seguro"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 700, 370);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo admin_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 480);

        setSize(new java.awt.Dimension(737, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIconUsuario;
    private javax.swing.JLabel lblTextoLista;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
