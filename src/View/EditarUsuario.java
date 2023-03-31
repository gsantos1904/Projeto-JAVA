package View;

import dados.SistemaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditarUsuario extends javax.swing.JFrame {

    public EditarUsuario() {
        initComponents();

    }

    public EditarUsuario(String n, String s, String e, String c, String end, String t, String operacao) {
        initComponents();
        txtNome1.setText(n);
        txtSenha.setText(s);
        txtEmail1.setText(e);
        txtCpf1.setText(c);
        txtEndereco1.setText(end);
        cmbTipoSeguro.setSelectedItem(t);
        if (operacao.equals("excluído")) {
            btnSalvarAlteracoes.setVisible(false);
        } else if (operacao.equals("alterado")) {
            btnExcluir.setVisible(false);
            txtCpf1.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFotoEditarUsuario = new javax.swing.JLabel();
        lblTextoEditarUsuario = new javax.swing.JLabel();
        lblTipoSeguro = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblCpf1 = new javax.swing.JLabel();
        lblEndereco1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        txtEmail1 = new javax.swing.JTextField();
        txtCpf1 = new javax.swing.JTextField();
        txtEndereco1 = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        cmbTipoSeguro = new javax.swing.JComboBox<>();
        btnSalvarAlteracoes = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblFundoEditarUsuario = new javax.swing.JLabel();

        setTitle("Insurance Forçe");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFotoEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/icone usuario.png"))); // NOI18N
        getContentPane().add(lblFotoEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, 80));

        lblTextoEditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTextoEditarUsuario.setForeground(new java.awt.Color(0, 51, 153));
        lblTextoEditarUsuario.setText("Editar Usuario");
        getContentPane().add(lblTextoEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 130, 20));

        lblTipoSeguro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTipoSeguro.setForeground(new java.awt.Color(0, 51, 153));
        lblTipoSeguro.setText("Tipo de seguro");
        getContentPane().add(lblTipoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 140, 30));

        lblNome1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(0, 51, 153));
        lblNome1.setText("Nome");
        getContentPane().add(lblNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 80, 30));

        lblEmail1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmail1.setForeground(new java.awt.Color(0, 51, 153));
        lblEmail1.setText("E-mail");
        getContentPane().add(lblEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 80, 20));

        lblCpf1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCpf1.setForeground(new java.awt.Color(0, 51, 153));
        lblCpf1.setText("CPF");
        getContentPane().add(lblCpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 80, 20));

        lblEndereco1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEndereco1.setForeground(new java.awt.Color(0, 51, 153));
        lblEndereco1.setText("Endereço");
        getContentPane().add(lblEndereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 80, 20));

        txtNome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        txtNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, 30));

        txtEmail1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        txtEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 250, 30));

        txtCpf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        txtCpf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 250, 30));

        txtEndereco1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        txtEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndereco1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 250, 30));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 51, 153));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 30));

        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 250, 30));

        cmbTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Furto ou Roubo", "Cobertura Básica", "Compreensível" }));
        getContentPane().add(cmbTipoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 322, 250, 30));

        btnSalvarAlteracoes.setBackground(new java.awt.Color(51, 102, 255));
        btnSalvarAlteracoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarAlteracoes.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAlteracoes.setText("Salvar Alterações");
        btnSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAlteracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 30));

        btnExcluir.setBackground(new java.awt.Color(51, 102, 255));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 120, 30));

        lblFundoEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo admin.png"))); // NOI18N
        getContentPane().add(lblFundoEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 702, 500));

        setSize(new java.awt.Dimension(719, 541));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome1ActionPerformed

    private void txtEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail1ActionPerformed

    private void txtCpf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf1ActionPerformed

    private void txtEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndereco1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        if (resposta == 0) { //Resposta foi sim
            String c = txtCpf1.getText();
            try {
                SistemaDao dao;
                dao = new SistemaDao();
                dao.excluirUsuario(c);

                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!!");
                limparCampos();
                setVisible(false);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
            }
        } else {//Resposta foi não
            dispose();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesActionPerformed
        String n, s, e, end, t, c;
        n = txtNome1.getText();
        s = txtSenha.getText();
        e = txtEmail1.getText();
        c = txtCpf1.getText();
        end = txtEndereco1.getText();
        t = cmbTipoSeguro.getSelectedItem().toString();

        if (c.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É Obrigatório digitar o CPF do usuário");
            txtCpf1.requestFocus();
            return;

        }
        if (s.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório digitar a senha ");
            txtSenha.requestFocus();
            return;

        }

        try {
            SistemaDao dao;
            dao = new SistemaDao();
            dao.alterarUsuarios(n, s, e, end, t, c);

            JOptionPane.showMessageDialog(null, "Usuário Alterado com sucesso");
            limparCampos();
            setVisible(false);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_btnSalvarAlteracoesActionPerformed

    private void limparCampos() { //Limpas os campos se for chamar de outra tela seria public void LimparCampos
        txtNome1.setText("");
        txtSenha.setText("");
        txtEmail1.setText("");
        txtCpf1.setText("");
        txtEndereco1.setText("");
        txtNome1.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvarAlteracoes;
    private javax.swing.JComboBox<String> cmbTipoSeguro;
    private javax.swing.JLabel lblCpf1;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblFotoEditarUsuario;
    private javax.swing.JLabel lblFundoEditarUsuario;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTextoEditarUsuario;
    private javax.swing.JLabel lblTipoSeguro;
    private javax.swing.JTextField txtCpf1;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
