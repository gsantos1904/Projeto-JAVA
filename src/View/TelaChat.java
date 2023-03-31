
package View;


public class TelaChat extends javax.swing.JFrame {

    
    public TelaChat() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtaApresentacao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaRecebe = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Atendimento");
        getContentPane().setLayout(null);

        txtaApresentacao.setColumns(20);
        txtaApresentacao.setRows(5);
        jScrollPane1.setViewportView(txtaApresentacao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 510, 310);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Converse com atendente para mais informções.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 480, 30);

        txtaRecebe.setColumns(20);
        txtaRecebe.setRows(5);
        jScrollPane2.setViewportView(txtaRecebe);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 400, 400, 50);

        btnEnviar.setBackground(new java.awt.Color(51, 102, 255));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(410, 400, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela de fundo admin.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 490);

        setSize(new java.awt.Dimension(528, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtaApresentacao;
    private javax.swing.JTextArea txtaRecebe;
    // End of variables declaration//GEN-END:variables
}
