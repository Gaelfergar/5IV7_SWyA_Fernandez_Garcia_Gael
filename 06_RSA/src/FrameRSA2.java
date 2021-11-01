
import java.awt.Color;

public class FrameRSA2 extends javax.swing.JFrame {

    public FrameRSA2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Marco1 = new javax.swing.JPanel();
        ValorN = new javax.swing.JTextField();
        texto5 = new javax.swing.JLabel();
        Título = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        btnDescifrar = new javax.swing.JButton();
        texto7 = new javax.swing.JLabel();
        texto8 = new javax.swing.JLabel();
        texto9 = new javax.swing.JLabel();
        texto10 = new javax.swing.JLabel();
        texto11 = new javax.swing.JLabel();
        texto12 = new javax.swing.JLabel();
        texto13 = new javax.swing.JLabel();
        texto14 = new javax.swing.JLabel();
        texto15 = new javax.swing.JLabel();
        texto16 = new javax.swing.JLabel();
        MensajeCifrado = new javax.swing.JTextField();
        ValorQ = new javax.swing.JTextField();
        ValorP = new javax.swing.JTextField();
        ValorE = new javax.swing.JTextField();
        ValorD = new javax.swing.JTextField();
        MensajeDescifrado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(83, 61, 50));
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Marco1.setBackground(new java.awt.Color(108, 75, 59));

        ValorN.setBackground(new java.awt.Color(184, 151, 120));
        ValorN.setForeground(java.awt.SystemColor.controlHighlight);
        ValorN.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorN.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorNKeyTyped(evt);
            }
        });

        texto5.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto5.setForeground(new java.awt.Color(226, 184, 144));
        texto5.setText("Mensaje cifrado:");

        Título.setFont(new java.awt.Font("Trebuchet MS", 3, 22)); // NOI18N
        Título.setForeground(new java.awt.Color(222, 180, 153));
        Título.setText("RSA rústico");

        texto6.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto6.setForeground(new java.awt.Color(222, 150, 95));
        texto6.setText("~");

        btnDescifrar.setBackground(new java.awt.Color(83, 61, 50));
        btnDescifrar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDescifrar.setForeground(new java.awt.Color(222, 150, 95));
        btnDescifrar.setText("Descifrar");
        btnDescifrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDescifrarMouseClicked(evt);
            }
        });
        btnDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescifrarActionPerformed(evt);
            }
        });

        texto7.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto7.setForeground(new java.awt.Color(222, 150, 95));
        texto7.setText("~");

        texto8.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto8.setForeground(new java.awt.Color(226, 184, 144));
        texto8.setText("n:");

        texto9.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto9.setForeground(new java.awt.Color(222, 150, 95));
        texto9.setText("~");

        texto10.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto10.setForeground(new java.awt.Color(226, 184, 144));
        texto10.setText("p:");

        texto11.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto11.setForeground(new java.awt.Color(222, 150, 95));
        texto11.setText("~");

        texto12.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto12.setForeground(new java.awt.Color(226, 184, 144));
        texto12.setText("q:");

        texto13.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto13.setForeground(new java.awt.Color(222, 150, 95));
        texto13.setText("~");

        texto14.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto14.setForeground(new java.awt.Color(226, 184, 144));
        texto14.setText("e:");

        texto15.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto15.setForeground(new java.awt.Color(226, 184, 144));
        texto15.setText("d:");

        texto16.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto16.setForeground(new java.awt.Color(222, 150, 95));
        texto16.setText("~");

        MensajeCifrado.setBackground(new java.awt.Color(184, 151, 120));
        MensajeCifrado.setForeground(java.awt.SystemColor.controlHighlight);
        MensajeCifrado.setCaretColor(new java.awt.Color(83, 61, 50));
        MensajeCifrado.setSelectionColor(new java.awt.Color(222, 150, 95));
        MensajeCifrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MensajeCifradoKeyTyped(evt);
            }
        });

        ValorQ.setBackground(new java.awt.Color(184, 151, 120));
        ValorQ.setForeground(java.awt.SystemColor.controlHighlight);
        ValorQ.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorQ.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorQKeyTyped(evt);
            }
        });

        ValorP.setBackground(new java.awt.Color(184, 151, 120));
        ValorP.setForeground(java.awt.SystemColor.controlHighlight);
        ValorP.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorP.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorPKeyTyped(evt);
            }
        });

        ValorE.setBackground(new java.awt.Color(184, 151, 120));
        ValorE.setForeground(java.awt.SystemColor.controlHighlight);
        ValorE.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorE.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorEKeyTyped(evt);
            }
        });

        ValorD.setBackground(new java.awt.Color(184, 151, 120));
        ValorD.setForeground(java.awt.SystemColor.controlHighlight);
        ValorD.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorD.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorDKeyTyped(evt);
            }
        });

        MensajeDescifrado.setBackground(new java.awt.Color(108, 75, 59));
        MensajeDescifrado.setForeground(java.awt.SystemColor.controlHighlight);
        MensajeDescifrado.setCaretColor(new java.awt.Color(83, 61, 50));
        MensajeDescifrado.setSelectionColor(new java.awt.Color(222, 150, 95));
        MensajeDescifrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MensajeDescifradoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout Marco1Layout = new javax.swing.GroupLayout(Marco1);
        Marco1.setLayout(Marco1Layout);
        Marco1Layout.setHorizontalGroup(
            Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDescifrar)
                    .addComponent(MensajeDescifrado, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Título)
                        .addGroup(Marco1Layout.createSequentialGroup()
                            .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(texto5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(MensajeCifrado))
                        .addGroup(Marco1Layout.createSequentialGroup()
                            .addComponent(texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(texto8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ValorN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(texto9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(texto10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ValorP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(texto12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ValorQ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(texto13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(texto14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ValorE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(texto16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(texto15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ValorD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        Marco1Layout.setVerticalGroup(
            Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Título)
                .addGap(28, 28, 28)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto5)
                    .addComponent(texto6)
                    .addComponent(MensajeCifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto8)
                        .addComponent(texto7)
                        .addComponent(ValorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto10)
                        .addComponent(texto9)
                        .addComponent(ValorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto12)
                        .addComponent(texto11)
                        .addComponent(ValorQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto14)
                        .addComponent(texto13)
                        .addComponent(ValorE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto15)
                        .addComponent(texto16)
                        .addComponent(ValorD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnDescifrar)
                .addGap(31, 31, 31)
                .addComponent(MensajeDescifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Marco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Marco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescifrarActionPerformed
        btnDescifrar.setBackground(Color.orange);
    }//GEN-LAST:event_btnDescifrarActionPerformed

    private void ValorNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorNKeyTyped
        if (ValorN.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_ValorNKeyTyped

    private void MensajeCifradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MensajeCifradoKeyTyped
        if (MensajeCifrado.getText().length()>=35){
            evt.consume();
        }
    }//GEN-LAST:event_MensajeCifradoKeyTyped

    private void ValorQKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorQKeyTyped
        if (ValorQ.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_ValorQKeyTyped

    private void ValorPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorPKeyTyped
        if (ValorP.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_ValorPKeyTyped

    private void ValorEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorEKeyTyped
        if (ValorE.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_ValorEKeyTyped

    private void ValorDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorDKeyTyped
        if (ValorD.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_ValorDKeyTyped

    private void MensajeDescifradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MensajeDescifradoKeyTyped
        if (MensajeCifrado.getText().length()>=35){
            evt.consume();
        }
    }//GEN-LAST:event_MensajeDescifradoKeyTyped

    private void btnDescifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescifrarMouseClicked
        
    }//GEN-LAST:event_btnDescifrarMouseClicked

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
            java.util.logging.Logger.getLogger(FrameRSA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRSA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRSA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRSA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRSA2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Marco1;
    private javax.swing.JTextField MensajeCifrado;
    private javax.swing.JTextField MensajeDescifrado;
    private javax.swing.JLabel Título;
    private javax.swing.JTextField ValorD;
    private javax.swing.JTextField ValorE;
    private javax.swing.JTextField ValorN;
    private javax.swing.JTextField ValorP;
    private javax.swing.JTextField ValorQ;
    private javax.swing.JButton btnDescifrar;
    private javax.swing.JLabel texto10;
    private javax.swing.JLabel texto11;
    private javax.swing.JLabel texto12;
    private javax.swing.JLabel texto13;
    private javax.swing.JLabel texto14;
    private javax.swing.JLabel texto15;
    private javax.swing.JLabel texto16;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JLabel texto7;
    private javax.swing.JLabel texto8;
    private javax.swing.JLabel texto9;
    // End of variables declaration//GEN-END:variables
}
