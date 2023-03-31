package View;

import dados.SistemaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaAdmin extends javax.swing.JFrame {

    public TelaAdmin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblFormulario = new javax.swing.JLabel();
        lblLixeira = new javax.swing.JLabel();
        btnEditarUsuario = new javax.swing.JButton();
        btnListarUsuario = new javax.swing.JButton();
        btnApagarUsuario = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblBoasVindas = new javax.swing.JLabel();
        lblFundoAdmin = new javax.swing.JLabel();

        setTitle("Insurance Force - ADMIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/icone usuario.png"))); // NOI18N
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 80, 60));

        lblFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/icone formulario.png"))); // NOI18N
        getContentPane().add(lblFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 70, 70));

        lblLixeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/Lixeira.png"))); // NOI18N
        getContentPane().add(lblLixeira, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 90, 90));

        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarUsuario.setForeground(new java.awt.Color(0, 51, 153));
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 160, 40));

        btnListarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnListarUsuario.setForeground(new java.awt.Color(0, 51, 153));
        btnListarUsuario.setText("Listar Usuario");
        btnListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 160, 40));

        btnApagarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnApagarUsuario.setForeground(new java.awt.Color(0, 51, 153));
        btnApagarUsuario.setText("Apagar Usuario");
        btnApagarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 190, 40));

        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(51, 102, 255));
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 2));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 80, 30));

        lblBoasVindas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBoasVindas.setForeground(new java.awt.Color(0, 102, 204));
        lblBoasVindas.setText("Bem vindo Admin");
        getContentPane().add(lblBoasVindas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, 40));

        lblFundoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo admin.png"))); // NOI18N
        getContentPane().add(lblFundoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 730, 500));

        setSize(new java.awt.Dimension(740, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        abrirEditarUsuario("alterado");
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnApagarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarUsuarioActionPerformed
        abrirEditarUsuario("excluído");
    }//GEN-LAST:event_btnApagarUsuarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuarioActionPerformed
        new ListaUsuario().setVisible(true);
    }//GEN-LAST:event_btnListarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnListarUsuario;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblBoasVindas;
    private javax.swing.JLabel lblFormulario;
    private javax.swing.JLabel lblFundoAdmin;
    private javax.swing.JLabel lblLixeira;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    public void abrirEditarUsuario(String operacao) {
        //1 - Pedir o usuário a ser alterado.

        String c;
        c = JOptionPane.showInputDialog(null, "Digite o cpf do usuario a ser " + operacao, "Usuario", 1);
        if (c == null) {
            return;//stop
        }
        try {
            SistemaDao dao;
            dao = new SistemaDao();
            ResultSet resultado = dao.buscarUsuario(c);

            // 4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega nome e o cargo que veio da consulta do BD
                String nome, senha, email, cpf, endereco, tipo;
                nome = resultado.getString("nome");
                senha = resultado.getString("senha");
                email = resultado.getString("email");
                cpf = resultado.getString("cpf");
                endereco = resultado.getString("endereco");
                tipo = resultado.getString("tipodeseguro");
                //Abrir o formulário Menu.java
                EditarUsuario tela;
                tela = new EditarUsuario(nome, senha, email, cpf, endereco, tipo, operacao);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }
    }
}
