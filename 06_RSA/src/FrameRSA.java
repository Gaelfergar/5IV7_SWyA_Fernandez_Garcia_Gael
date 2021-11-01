
import java.awt.Color;

public class FrameRSA extends javax.swing.JFrame {

    public FrameRSA() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Marco1 = new javax.swing.JPanel();
        txtQ = new javax.swing.JTextField();
        texto5 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        texto1 = new javax.swing.JLabel();
        Título = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        texto7 = new javax.swing.JLabel();
        btnCifrar = new javax.swing.JButton();
        texto2 = new javax.swing.JLabel();
        texto8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(83, 61, 50));
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Marco1.setBackground(new java.awt.Color(108, 75, 59));

        txtQ.setBackground(new java.awt.Color(184, 151, 120));
        txtQ.setForeground(java.awt.SystemColor.controlHighlight);
        txtQ.setCaretColor(new java.awt.Color(83, 61, 50));
        txtQ.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQKeyTyped(evt);
            }
        });

        texto5.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto5.setForeground(new java.awt.Color(226, 184, 144));
        texto5.setText("Ingrese el mensaje a cifrar:");

        txtMensaje.setBackground(new java.awt.Color(184, 151, 120));
        txtMensaje.setForeground(java.awt.SystemColor.controlHighlight);
        txtMensaje.setCaretColor(new java.awt.Color(83, 61, 50));
        txtMensaje.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMensajeKeyTyped(evt);
            }
        });

        texto1.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto1.setForeground(new java.awt.Color(226, 184, 144));
        texto1.setText("Ingrese p:");

        Título.setFont(new java.awt.Font("Trebuchet MS", 3, 22)); // NOI18N
        Título.setForeground(new java.awt.Color(222, 180, 153));
        Título.setText("RSA rústico");

        txtP.setBackground(new java.awt.Color(184, 151, 120));
        txtP.setForeground(java.awt.SystemColor.controlHighlight);
        txtP.setCaretColor(new java.awt.Color(83, 61, 50));
        txtP.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPKeyTyped(evt);
            }
        });

        texto3.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto3.setForeground(new java.awt.Color(226, 184, 144));
        texto3.setText("Ingrese q:");

        texto4.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto4.setForeground(new java.awt.Color(222, 150, 95));
        texto4.setText("~");

        texto6.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto6.setForeground(new java.awt.Color(222, 150, 95));
        texto6.setText("~");

        texto7.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto7.setForeground(new java.awt.Color(222, 150, 95));
        texto7.setText("~");

        btnCifrar.setBackground(new java.awt.Color(83, 61, 50));
        btnCifrar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCifrar.setForeground(new java.awt.Color(222, 150, 95));
        btnCifrar.setText("Cifrar");
        btnCifrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCifrarMouseClicked(evt);
            }
        });
        btnCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarActionPerformed(evt);
            }
        });

        texto2.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto2.setForeground(new java.awt.Color(222, 180, 153));
        texto2.setText("El algoritmo de criptografía asimétrica RSA se usa para cifrar números,");

        texto8.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto8.setForeground(new java.awt.Color(222, 180, 153));
        texto8.setText("como transacciones bancarias, firmas digitales o tokens.");

        javax.swing.GroupLayout Marco1Layout = new javax.swing.GroupLayout(Marco1);
        Marco1.setLayout(Marco1Layout);
        Marco1Layout.setHorizontalGroup(
            Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(btnCifrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Marco1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Marco1Layout.createSequentialGroup()
                        .addComponent(texto2)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(Marco1Layout.createSequentialGroup()
                        .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Marco1Layout.createSequentialGroup()
                                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Marco1Layout.createSequentialGroup()
                                        .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto5))
                                    .addGroup(Marco1Layout.createSequentialGroup()
                                        .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto1)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Título))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Marco1Layout.createSequentialGroup()
                                        .addComponent(texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(texto3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtMensaje)))
                            .addGroup(Marco1Layout.createSequentialGroup()
                                .addComponent(texto8)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))))
        );
        Marco1Layout.setVerticalGroup(
            Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Título)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(texto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto8)
                .addGap(26, 26, 26)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto1)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto3)
                    .addComponent(texto4)
                    .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto7))
                .addGap(28, 28, 28)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto5)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto6))
                .addGap(27, 27, 27)
                .addComponent(btnCifrar)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Marco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Marco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed
        btnCifrar.setBackground(Color.orange);
        FrameRSA2 abrir = new FrameRSA2();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCifrarActionPerformed

    private void txtPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPKeyTyped
        if (txtP.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_txtPKeyTyped

    private void txtMensajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensajeKeyTyped
        if (txtMensaje.getText().length()>=35){
            evt.consume();
        }
    }//GEN-LAST:event_txtMensajeKeyTyped

    private void txtQKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQKeyTyped
        if (txtQ.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_txtQKeyTyped

    private void btnCifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCifrarMouseClicked
        
    }//GEN-LAST:event_btnCifrarMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrameRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRSA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Marco1;
    private javax.swing.JLabel Título;
    private javax.swing.JButton btnCifrar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JLabel texto7;
    private javax.swing.JLabel texto8;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtQ;
    // End of variables declaration//GEN-END:variables
}
