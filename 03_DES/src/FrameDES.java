import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FrameDES extends javax.swing.JFrame {
    String path;
    
    public FrameDES() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Título = new javax.swing.JLabel();
        Título1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        btnArchivoCi = new javax.swing.JButton();
        btnCifrar = new javax.swing.JButton();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        btnArchivoDe = new javax.swing.JButton();
        btnDescifrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(36, 37, 42));

        Título.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        Título.setForeground(new java.awt.Color(248, 248, 255));
        Título.setText("Cifrado DES");
        Título.setToolTipText("");

        Título1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Título1.setForeground(new java.awt.Color(248, 248, 255));
        Título1.setText("Fernández García Gael");
        Título1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Título)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(Título1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Título)
                    .addComponent(Título1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(36, 37, 42));
        label1.setText("Proceso de cifrado");
        label1.setToolTipText("");

        label2.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        label2.setForeground(new java.awt.Color(36, 37, 42));
        label2.setText("- Ingrese la clave de cifrado:");
        label2.setToolTipText("");

        label3.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        label3.setForeground(new java.awt.Color(36, 37, 42));
        label3.setText("(8 caracteres)");
        label3.setToolTipText("");

        clave.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });
        clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                claveKeyTyped(evt);
            }
        });

        label4.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        label4.setForeground(new java.awt.Color(36, 37, 42));
        label4.setText("- Seleccione el archivo .txt a cifrar:");
        label4.setToolTipText("");

        btnArchivoCi.setBackground(new java.awt.Color(248, 248, 255));
        btnArchivoCi.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        btnArchivoCi.setText("Archivo");
        btnArchivoCi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArchivoCiMouseClicked(evt);
            }
        });
        btnArchivoCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoCiActionPerformed(evt);
            }
        });

        btnCifrar.setBackground(new java.awt.Color(248, 248, 255));
        btnCifrar.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        btnCifrar.setText("Cifrar");
        btnCifrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCifrarMouseClicked(evt);
            }
        });

        label5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(36, 37, 42));
        label5.setText("Proceso de descifrado");
        label5.setToolTipText("");

        label6.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        label6.setForeground(new java.awt.Color(36, 37, 42));
        label6.setText("- Seleccione el archivo .txt a descifrar:");
        label6.setToolTipText("");

        btnArchivoDe.setBackground(new java.awt.Color(248, 248, 255));
        btnArchivoDe.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        btnArchivoDe.setText("Archivo");
        btnArchivoDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArchivoDeMouseClicked(evt);
            }
        });

        btnDescifrar.setBackground(new java.awt.Color(248, 248, 255));
        btnDescifrar.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
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

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnCifrar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnArchivoDe)
                            .addComponent(label5)
                            .addComponent(label6)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(btnDescifrar))
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(FondoLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(clave))
                                .addComponent(label4)
                                .addComponent(label1)
                                .addComponent(label2)
                                .addComponent(btnArchivoCi)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label1)
                .addGap(18, 18, 18)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArchivoCi)
                .addGap(25, 25, 25)
                .addComponent(btnCifrar)
                .addGap(48, 48, 48)
                .addComponent(label5)
                .addGap(18, 18, 18)
                .addComponent(label6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArchivoDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnDescifrar)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed

    }//GEN-LAST:event_claveActionPerformed

    private void btnDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescifrarActionPerformed
        btnDescifrar.setBackground(Color.white);
    }//GEN-LAST:event_btnDescifrarActionPerformed

    private void btnArchivoCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoCiActionPerformed
        
    }//GEN-LAST:event_btnArchivoCiActionPerformed

    private void claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyTyped
        if (clave.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_claveKeyTyped

    private void btnCifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCifrarMouseClicked
        Tarea_DES mensaje = new Tarea_DES();
        try {
            mensaje.Cifrar(clave.getText(), path);
        } catch (Exception ex) {
            Logger.getLogger(FrameDES.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Archivo cifrado exitosamente.");
    }//GEN-LAST:event_btnCifrarMouseClicked

    private void btnArchivoCiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoCiMouseClicked
        JFileChooser jFileChooser =new JFileChooser();
        FileNameExtensionFilter filtrado=new FileNameExtensionFilter("TxT","txt");
        jFileChooser.setFileFilter(filtrado);
        int respuesta=jFileChooser.showOpenDialog(this);
        if(respuesta==JFileChooser.APPROVE_OPTION){
          path=jFileChooser.getSelectedFile().getPath();
        }
        JOptionPane.showMessageDialog(null,"Archivo seleccionado.");
    }//GEN-LAST:event_btnArchivoCiMouseClicked

    private void btnArchivoDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArchivoDeMouseClicked
        JFileChooser jFileChooser =new JFileChooser();
        FileNameExtensionFilter filtrado=new FileNameExtensionFilter("cifrado", "cifrado");
        jFileChooser.setFileFilter(filtrado);
        int respuesta=jFileChooser.showOpenDialog(this);
        if(respuesta==JFileChooser.APPROVE_OPTION){
          path=jFileChooser.getSelectedFile().getPath();
        }
        JOptionPane.showMessageDialog(null,"Archivo seleccionado.");
    }//GEN-LAST:event_btnArchivoDeMouseClicked

    private void btnDescifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescifrarMouseClicked
        Tarea_DES mensaje = new Tarea_DES();
        try {
            mensaje.Descifrar(clave.getText(), path);
        } catch (Exception ex) {
            Logger.getLogger(FrameDES.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null,"Archivo descifrado exitosamente.");
    }//GEN-LAST:event_btnDescifrarMouseClicked

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
            java.util.logging.Logger.getLogger(FrameDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Título;
    private javax.swing.JLabel Título1;
    private javax.swing.JButton btnArchivoCi;
    private javax.swing.JButton btnArchivoDe;
    private javax.swing.JButton btnCifrar;
    private javax.swing.JButton btnDescifrar;
    private javax.swing.JTextField clave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    // End of variables declaration//GEN-END:variables
}
