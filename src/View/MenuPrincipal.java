package View;

import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFundoLogo = new javax.swing.JLabel();
        lblSaudacao = new javax.swing.JLabel();
        lblFundoMenu = new javax.swing.JLabel();
        jMenuBarra = new javax.swing.JMenuBar();
        jMenuSeguros = new javax.swing.JMenu();
        itmNovoSeguro = new javax.swing.JMenuItem();
        jMenuIAlterarSeguro = new javax.swing.JMenuItem();
        mnuAdmin = new javax.swing.JMenu();
        itmEditarUsuario = new javax.swing.JMenuItem();
        jMenuICadastrarUsuario = new javax.swing.JMenuItem();
        itmExcluirUsuario = new javax.swing.JMenuItem();
        jMenuIListaUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFundoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoFundo.PNG"))); // NOI18N
        getContentPane().add(lblFundoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 480, 240));

        lblSaudacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(lblSaudacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 380, 30));

        lblFundoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Tela de fundo senha.png"))); // NOI18N
        getContentPane().add(lblFundoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 722, 495));

        jMenuBarra.setBackground(new java.awt.Color(51, 204, 255));
        jMenuBarra.setForeground(new java.awt.Color(0, 0, 255));

        jMenuSeguros.setText("Seguros");

        itmNovoSeguro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmNovoSeguro.setText("Novo Seguro");
        jMenuSeguros.add(itmNovoSeguro);

        jMenuIAlterarSeguro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuIAlterarSeguro.setText("Alterar Seguro");
        jMenuSeguros.add(jMenuIAlterarSeguro);

        jMenuBarra.add(jMenuSeguros);

        mnuAdmin.setText("Admin");

        itmEditarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmEditarUsuario.setText("Editar Usuario");
        itmEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarUsuarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmEditarUsuario);

        jMenuICadastrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuICadastrarUsuario.setText("Cadastrar Usuario");
        jMenuICadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuICadastrarUsuarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(jMenuICadastrarUsuario);

        itmExcluirUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirUsuario.setText("Apagar Usuario");
        itmExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmExcluirUsuario);

        jMenuIListaUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuIListaUsuario.setText("Listar Usuario");
        jMenuIListaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIListaUsuarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(jMenuIListaUsuario);

        jMenuBarra.add(mnuAdmin);

        setJMenuBar(jMenuBarra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuICadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuICadastrarUsuarioActionPerformed
        new CadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuICadastrarUsuarioActionPerformed

    private void itmEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarUsuarioActionPerformed
        abrirEditarUsuario("alterar");
    }//GEN-LAST:event_itmEditarUsuarioActionPerformed

    private void itmExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuarioActionPerformed
        abrirEditarUsuario("excluir");
    }//GEN-LAST:event_itmExcluirUsuarioActionPerformed

    private void jMenuIListaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIListaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuIListaUsuarioActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmEditarUsuario;
    private javax.swing.JMenuItem itmExcluirUsuario;
    private javax.swing.JMenuItem itmNovoSeguro;
    private javax.swing.JMenuBar jMenuBarra;
    private javax.swing.JMenuItem jMenuIAlterarSeguro;
    private javax.swing.JMenuItem jMenuICadastrarUsuario;
    private javax.swing.JMenuItem jMenuIListaUsuario;
    private javax.swing.JMenu jMenuSeguros;
    private javax.swing.JLabel lblFundoLogo;
    private javax.swing.JLabel lblFundoMenu;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAdmin;
    // End of variables declaration//GEN-END:variables
}
