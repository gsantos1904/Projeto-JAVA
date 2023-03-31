package View;

import javax.swing.JOptionPane;

public class TelaUsuario extends javax.swing.JFrame {

    private String nome, cpf, email, endereco, tipodeseguro;

    public TelaUsuario() {
        initComponents();
    }

    public TelaUsuario(String nome, String cpf, String email, String endereco, String tipodeseguro) {
        initComponents();
        lblSaudacaoUsuario.setText("Bem vindo(a) " + nome);
        lblCpf.setText("CPF: " + cpf);
        lblEndereco.setText("Endereço: " + endereco);
        lblEmail.setText("Email: " + email);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacaoUsuario = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblIconUsuario = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblIconFormulario = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        btnInformacaoSeguro = new javax.swing.JButton();
        lblIconAtendente = new javax.swing.JLabel();
        btnFalarAtendente = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblFundoTelaUsuario = new javax.swing.JLabel();

        setTitle("Bem Vindo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaudacaoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaudacaoUsuario.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(lblSaudacaoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 380, 30));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 204));
        lblEmail.setText("e");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 270, 30));

        lblIconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/icone usuario.png"))); // NOI18N
        getContentPane().add(lblIconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, 80));

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(0, 0, 204));
        lblCpf.setText("c");
        getContentPane().add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, 30));

        lblIconFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/icone formulario.png"))); // NOI18N
        getContentPane().add(lblIconFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 90));

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(0, 0, 204));
        lblEndereco.setText("end");
        getContentPane().add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 300, 30));

        btnInformacaoSeguro.setBackground(new java.awt.Color(153, 204, 255));
        btnInformacaoSeguro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInformacaoSeguro.setForeground(new java.awt.Color(0, 0, 204));
        btnInformacaoSeguro.setText("Informações do seguro");
        btnInformacaoSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacaoSeguroActionPerformed(evt);
            }
        });
        getContentPane().add(btnInformacaoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 200, 30));

        lblIconAtendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/Atendente.PNG"))); // NOI18N
        getContentPane().add(lblIconAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 60));

        btnFalarAtendente.setBackground(new java.awt.Color(153, 204, 255));
        btnFalarAtendente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFalarAtendente.setForeground(new java.awt.Color(0, 0, 204));
        btnFalarAtendente.setText("Fale com um atendente");
        btnFalarAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalarAtendenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnFalarAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 382, 200, 30));

        btnSair.setBackground(new java.awt.Color(51, 153, 255));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 90, 30));

        lblFundoTelaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo admin.png"))); // NOI18N
        getContentPane().add(lblFundoTelaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        setSize(new java.awt.Dimension(707, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFalarAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFalarAtendenteActionPerformed
        new TelaChat().setVisible(true);
    }//GEN-LAST:event_btnFalarAtendenteActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        new Login().setVisible(true);
        setVisible(false); // sai da tela em que esta

    }//GEN-LAST:event_btnSairActionPerformed

    private void btnInformacaoSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacaoSeguroActionPerformed
        JOptionPane.showMessageDialog(null, "Seu seguro é " + tipodeseguro );
    }//GEN-LAST:event_btnInformacaoSeguroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFalarAtendente;
    private javax.swing.JButton btnInformacaoSeguro;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFundoTelaUsuario;
    private javax.swing.JLabel lblIconAtendente;
    private javax.swing.JLabel lblIconFormulario;
    private javax.swing.JLabel lblIconUsuario;
    private javax.swing.JLabel lblSaudacaoUsuario;
    // End of variables declaration//GEN-END:variables
}
