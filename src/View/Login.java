package View;

import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSenha = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblContinuarmos = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblImagemFundo = new javax.swing.JLabel();

        setTitle("Insurance Forçe - LOGIN");
        getContentPane().setLayout(null);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 102));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(80, 250, 120, 30);

        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(200, 180, 270, 40);

        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        getContentPane().add(txtSenha);
        txtSenha.setBounds(200, 242, 270, 40);

        lblContinuarmos.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblContinuarmos.setForeground(new java.awt.Color(0, 0, 102));
        lblContinuarmos.setText("Para continuarmos efetue o login");
        getContentPane().add(lblContinuarmos);
        lblContinuarmos.setBounds(120, 60, 450, 50);

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(0, 0, 102));
        lblCpf.setText("CPF");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(80, 180, 120, 30);

        btnEntrar.setBackground(new java.awt.Color(0, 102, 255));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(330, 320, 170, 40);

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 255));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(520, 320, 170, 40);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 380, 170, 40);

        lblImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Tela de fundo senha.png"))); // NOI18N
        getContentPane().add(lblImagemFundo);
        lblImagemFundo.setBounds(0, 0, 710, 490);

        setSize(new java.awt.Dimension(723, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        new CadastrarUsuario().setVisible(true);


    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            String usuario, senha;
            usuario = txtCpf.getText();
            senha = txtSenha.getText();
            //Verificar se o usuario e senha estão no BD
            SistemaDao dao;
            dao = new SistemaDao();
            ResultSet resultado = dao.validarUsuario(usuario, senha);

            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega nome e o cargo que veio da consulta do BD
                String nome;
                String cpf;
                String email;
                String endereco;
                String tipodeseguro;
                nome = resultado.getString("nome");
                cpf = resultado.getString("cpf");
                email = resultado.getString("email");
                endereco = resultado.getString("endereco");
                tipodeseguro = resultado.getString("tipodeseguro");

                //Abrir o formulário Menu.java
                TelaPagamento tela;
                tela = new TelaPagamento(nome, cpf, email, endereco, tipodeseguro);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
            }
            limparCampos();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        setVisible(false);

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String usuario, senha;
            usuario = txtCpf.getText();
            senha = txtSenha.getText();
            //Verificar se o usuario e senha estão no BD
            SistemaDao dao;
            dao = new SistemaDao();
            ResultSet resultado = dao.validarUsuarioAdmin(usuario, senha);

            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega nome e o cargo que veio da consulta do BD
                String usuarioadmin;
                String senhaadmin;
                usuarioadmin = resultado.getString("cpf");
                senhaadmin = resultado.getString("senha");
                //Abrir o formulário Menu.java
                TelaAdmin tela;
                tela = new TelaAdmin();
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
            }
            limparCampos();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limparCampos() { //Limpas os campos se for chamar de outra tela seria public void LimparCampos

        txtSenha.setText("");
        txtCpf.setText("");

    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblContinuarmos;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
