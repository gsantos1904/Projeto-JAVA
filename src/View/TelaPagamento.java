
package View;


public class TelaPagamento extends javax.swing.JFrame {
private String nome, cpf, email, endereco, tipodeseguro;
    
    public TelaPagamento() {
        initComponents();
    }
    public TelaPagamento(String nome, String cpf, String email, String endereco, String tipodeseguro) {
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
        lblTexto1 = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblTextoPagamento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setTitle("Pagamento");
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/logo.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 10, 250, 90);

        lblTexto1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTexto1.setForeground(new java.awt.Color(0, 0, 102));
        lblTexto1.setText("Você deseja prosseguir para o pagamento ou conversar ");
        getContentPane().add(lblTexto1);
        lblTexto1.setBounds(30, 100, 650, 110);

        lblTexto2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTexto2.setForeground(new java.awt.Color(0, 0, 102));
        lblTexto2.setText("com um responsável para mais dúvidas.");
        getContentPane().add(lblTexto2);
        lblTexto2.setBounds(30, 170, 360, 50);

        btnPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/Botoes/pay.PNG"))); // NOI18N
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPay);
        btnPay.setBounds(60, 280, 120, 70);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icones/Botoes/chat.PNG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 250, 120, 100);

        lblTextoPagamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTextoPagamento.setForeground(new java.awt.Color(0, 0, 102));
        lblTextoPagamento.setText("Faça seu pagameto");
        getContentPane().add(lblTextoPagamento);
        lblTextoPagamento.setBounds(60, 360, 150, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Faça uma pergunta aqui");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 360, 170, 30);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo admin_1.png"))); // NOI18N
        lblLogo.setText("jLabel1");
        getContentPane().add(lblLogo);
        lblLogo.setBounds(0, 0, 640, 520);

        setSize(new java.awt.Dimension(654, 553));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        new FormaPagamento(this.nome,this.cpf, this.email, this.endereco, this.tipodeseguro).setVisible(true);
        setVisible (false);
    }//GEN-LAST:event_btnPayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new TelaChat().setVisible(true);
        setVisible (false);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTextoPagamento;
    // End of variables declaration//GEN-END:variables
}
