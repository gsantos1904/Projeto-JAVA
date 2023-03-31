package View;

public class FormaPagamento extends javax.swing.JFrame {

    private String nome, cpf, email, endereco, tipodeseguro;

    public FormaPagamento() {
        initComponents();
    }

    public FormaPagamento(String nome, String cpf, String email, String endereco, String tipodeseguro) {
        initComponents();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.tipodeseguro = tipodeseguro;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblCalculadora = new javax.swing.JLabel();
        lblPinpad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCartaoCredito = new javax.swing.JButton();
        btnPix = new javax.swing.JButton();
        btnBoletoBancario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblFundoFormaPagamento = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setTitle("Insurance Forçe - FORMA DE PAGAMENTO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/Calculadora.PNG"))); // NOI18N
        getContentPane().add(lblCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 80, 80));

        lblPinpad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/Pinpad.PNG"))); // NOI18N
        getContentPane().add(lblPinpad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 110, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/Pix.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 100, 110));

        btnCartaoCredito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCartaoCredito.setForeground(new java.awt.Color(0, 51, 153));
        btnCartaoCredito.setText("Cartão de crédito");
        btnCartaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaoCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        btnPix.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPix.setForeground(new java.awt.Color(0, 51, 153));
        btnPix.setText("Pix");
        btnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPixActionPerformed(evt);
            }
        });
        getContentPane().add(btnPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 140, -1));

        btnBoletoBancario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBoletoBancario.setForeground(new java.awt.Color(0, 51, 153));
        btnBoletoBancario.setText("Boleto Bancario");
        btnBoletoBancario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletoBancarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnBoletoBancario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Escolha sua forma de pagamento. ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 310, 30));

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 102, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/logo.PNG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 220, 50));

        lblFundoFormaPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo admin.png"))); // NOI18N
        getContentPane().add(lblFundoFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 707, 500));

        setSize(new java.awt.Dimension(723, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCartaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoCreditoActionPerformed
        new TelaUsuario(this.nome, this.cpf, this.email, this.endereco, this.tipodeseguro).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCartaoCreditoActionPerformed

    private void btnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPixActionPerformed
        new TelaUsuario(this.nome, this.cpf, this.email, this.endereco, this.tipodeseguro).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnPixActionPerformed

    private void btnBoletoBancarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletoBancarioActionPerformed
        new TelaUsuario(this.nome, this.cpf, this.email, this.endereco, this.tipodeseguro).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBoletoBancarioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPagamento().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoletoBancario;
    private javax.swing.JButton btnCartaoCredito;
    private javax.swing.JButton btnPix;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCalculadora;
    private javax.swing.JLabel lblFundoFormaPagamento;
    private javax.swing.JLabel lblPinpad;
    // End of variables declaration//GEN-END:variables
}
