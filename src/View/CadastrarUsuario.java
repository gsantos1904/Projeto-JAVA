package View;

import dados.SistemaDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastrarUsuario extends javax.swing.JFrame {

    public CadastrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTextoCima = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblCpf1 = new javax.swing.JLabel();
        lblEndereco1 = new javax.swing.JLabel();
        lblTipoSeguro = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        cmbTipoSeguro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnVoltarLogin = new javax.swing.JButton();
        lblTelaFundo = new javax.swing.JLabel();

        setTitle("Insurance Forçe - CADASTRO DE USUARIO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextoCima.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTextoCima.setForeground(new java.awt.Color(0, 0, 153));
        lblTextoCima.setText("Faça seu cadastro aqui");
        getContentPane().add(lblTextoCima, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 200, 30));

        lblEmail1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail1.setForeground(new java.awt.Color(0, 0, 153));
        lblEmail1.setText("E-mail");
        getContentPane().add(lblEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 130, 30));

        lblCpf1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCpf1.setForeground(new java.awt.Color(0, 0, 153));
        lblCpf1.setText("CPF");
        getContentPane().add(lblCpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 130, 30));

        lblEndereco1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEndereco1.setForeground(new java.awt.Color(0, 0, 153));
        lblEndereco1.setText("Endereço");
        getContentPane().add(lblEndereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 130, 30));

        lblTipoSeguro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoSeguro.setForeground(new java.awt.Color(0, 0, 153));
        lblTipoSeguro.setText("Tipo de Seguro");
        getContentPane().add(lblTipoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 110, 30));

        lblNome1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(0, 0, 153));
        lblNome1.setText("Nome");
        getContentPane().add(lblNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 130, 30));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 240, 30));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 240, 30));

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 240, 30));

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 240, 30));

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 255));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 210, 30));

        cmbTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Furto ou Roubo", "Cobertura Básica", "Compreensível" }));
        cmbTipoSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoSeguroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 282, 240, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Senha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 60, 20));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 112, 240, 30));

        btnVoltarLogin.setBackground(new java.awt.Color(0, 102, 255));
        btnVoltarLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarLogin.setText("Voltar para login");
        btnVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 170, 30));

        lblTelaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo.png"))); // NOI18N
        getContentPane().add(lblTelaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 710, 450));

        setSize(new java.awt.Dimension(708, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String n, s, e, c, end, t;
        n = txtNome.getText();
        s = txtSenha.getText();
        e = txtEmail.getText();
        c = txtCpf.getText();
        end = txtEndereco.getText();
        t = cmbTipoSeguro.getSelectedItem().toString();

        try {

            SistemaDao dao;
            dao = new SistemaDao();
            dao.cadastrarUsuario(n, s, e, c, end, t);

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");

            txtNome.setText("");
            txtSenha.setText("");
            txtEmail.setText("");
            txtCpf.setText("");
            txtEndereco.setText("");
            cmbTipoSeguro.setSelectedIndex(0);
            txtNome.requestFocus();
            setVisible(false);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }

        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLoginActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btnVoltarLoginActionPerformed

    private void cmbTipoSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoSeguroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltarLogin;
    private javax.swing.JComboBox<String> cmbTipoSeguro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCpf1;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblTelaFundo;
    private javax.swing.JLabel lblTextoCima;
    private javax.swing.JLabel lblTipoSeguro;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
