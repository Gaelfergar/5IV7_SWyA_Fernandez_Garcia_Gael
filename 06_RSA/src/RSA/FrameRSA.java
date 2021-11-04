package RSA;

import java.math.BigInteger;

public class FrameRSA extends javax.swing.JFrame {

    public FrameRSA() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Marco2 = new javax.swing.JPanel();
        txtQ1 = new javax.swing.JTextField();
        texto8 = new javax.swing.JLabel();
        txtMensaje1 = new javax.swing.JTextField();
        texto2 = new javax.swing.JLabel();
        Título1 = new javax.swing.JLabel();
        txtP1 = new javax.swing.JTextField();
        texto9 = new javax.swing.JLabel();
        texto10 = new javax.swing.JLabel();
        texto11 = new javax.swing.JLabel();
        texto12 = new javax.swing.JLabel();
        btnCifrar1 = new javax.swing.JButton();
        btnGenerar1 = new javax.swing.JButton();
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
        btnGenerar = new javax.swing.JButton();
        Marco3 = new javax.swing.JPanel();
        Título2 = new javax.swing.JLabel();
        texto13 = new javax.swing.JLabel();
        texto16 = new javax.swing.JLabel();
        btnDescifrar = new javax.swing.JButton();
        MensajeCifrado = new javax.swing.JTextField();
        texto14 = new javax.swing.JLabel();
        ValorQ = new javax.swing.JTextField();
        texto15 = new javax.swing.JLabel();
        ValorP = new javax.swing.JTextField();
        texto17 = new javax.swing.JLabel();
        ValorFi = new javax.swing.JTextField();
        texto18 = new javax.swing.JLabel();
        ValorE = new javax.swing.JTextField();
        texto19 = new javax.swing.JLabel();
        MensajeDescifrado = new javax.swing.JTextField();
        texto20 = new javax.swing.JLabel();
        ValorN = new javax.swing.JTextField();
        texto21 = new javax.swing.JLabel();
        texto22 = new javax.swing.JLabel();
        texto23 = new javax.swing.JLabel();
        texto24 = new javax.swing.JLabel();
        texto25 = new javax.swing.JLabel();
        ValorD = new javax.swing.JTextField();
        texto26 = new javax.swing.JLabel();

        Marco2.setBackground(new java.awt.Color(108, 75, 59));

        txtQ1.setBackground(new java.awt.Color(184, 151, 120));
        txtQ1.setForeground(java.awt.SystemColor.controlHighlight);
        txtQ1.setCaretColor(new java.awt.Color(83, 61, 50));
        txtQ1.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQ1ActionPerformed(evt);
            }
        });
        txtQ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQ1KeyTyped(evt);
            }
        });

        texto8.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto8.setForeground(new java.awt.Color(226, 184, 144));
        texto8.setText("Escriba el mensaje a cifrar:");

        txtMensaje1.setBackground(new java.awt.Color(184, 151, 120));
        txtMensaje1.setForeground(java.awt.SystemColor.controlHighlight);
        txtMensaje1.setCaretColor(new java.awt.Color(83, 61, 50));
        txtMensaje1.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtMensaje1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMensaje1KeyTyped(evt);
            }
        });

        texto2.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto2.setForeground(new java.awt.Color(226, 184, 144));
        texto2.setText("p:");

        Título1.setFont(new java.awt.Font("Trebuchet MS", 3, 22)); // NOI18N
        Título1.setForeground(new java.awt.Color(222, 180, 153));
        Título1.setText("RSA rústico");

        txtP1.setBackground(new java.awt.Color(184, 151, 120));
        txtP1.setForeground(java.awt.SystemColor.controlHighlight);
        txtP1.setCaretColor(new java.awt.Color(83, 61, 50));
        txtP1.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtP1ActionPerformed(evt);
            }
        });
        txtP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtP1KeyTyped(evt);
            }
        });

        texto9.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto9.setForeground(new java.awt.Color(226, 184, 144));
        texto9.setText("q:");

        texto10.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto10.setForeground(new java.awt.Color(222, 150, 95));
        texto10.setText("~");

        texto11.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto11.setForeground(new java.awt.Color(222, 150, 95));
        texto11.setText("~");

        texto12.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto12.setForeground(new java.awt.Color(222, 150, 95));
        texto12.setText("~");

        btnCifrar1.setBackground(new java.awt.Color(83, 61, 50));
        btnCifrar1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCifrar1.setForeground(new java.awt.Color(222, 150, 95));
        btnCifrar1.setText("Cifrar");
        btnCifrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCifrar1MouseClicked(evt);
            }
        });
        btnCifrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrar1ActionPerformed(evt);
            }
        });

        btnGenerar1.setBackground(new java.awt.Color(83, 61, 50));
        btnGenerar1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnGenerar1.setForeground(new java.awt.Color(222, 150, 95));
        btnGenerar1.setText("Generar claves");
        btnGenerar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerar1MouseClicked(evt);
            }
        });
        btnGenerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Marco2Layout = new javax.swing.GroupLayout(Marco2);
        Marco2.setLayout(Marco2Layout);
        Marco2Layout.setHorizontalGroup(
            Marco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Marco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Marco2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnCifrar1))
                    .addGroup(Marco2Layout.createSequentialGroup()
                        .addComponent(texto11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Marco2Layout.createSequentialGroup()
                        .addComponent(btnGenerar1)
                        .addGap(31, 31, 31)
                        .addComponent(texto10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto2)
                        .addGap(8, 8, 8)
                        .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(texto12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(texto9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Título1))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        Marco2Layout.setVerticalGroup(
            Marco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Título1)
                .addGap(38, 38, 38)
                .addGroup(Marco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Marco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto2)
                        .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(texto9)
                        .addComponent(texto10)
                        .addComponent(txtQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(texto12))
                    .addComponent(btnGenerar1))
                .addGap(28, 28, 28)
                .addGroup(Marco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto8)
                    .addComponent(txtMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto11))
                .addGap(27, 27, 27)
                .addComponent(btnCifrar1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(83, 61, 50));
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Marco1.setBackground(new java.awt.Color(108, 75, 59));

        txtQ.setBackground(new java.awt.Color(184, 151, 120));
        txtQ.setForeground(java.awt.SystemColor.controlHighlight);
        txtQ.setCaretColor(new java.awt.Color(83, 61, 50));
        txtQ.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQActionPerformed(evt);
            }
        });
        txtQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQKeyTyped(evt);
            }
        });

        texto5.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto5.setForeground(new java.awt.Color(226, 184, 144));
        texto5.setText("Escriba el mensaje a cifrar:");

        txtMensaje.setBackground(new java.awt.Color(184, 151, 120));
        txtMensaje.setForeground(java.awt.SystemColor.controlHighlight);
        txtMensaje.setCaretColor(new java.awt.Color(83, 61, 50));
        txtMensaje.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeActionPerformed(evt);
            }
        });
        txtMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMensajeKeyTyped(evt);
            }
        });

        texto1.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto1.setForeground(new java.awt.Color(226, 184, 144));
        texto1.setText("p:");

        Título.setFont(new java.awt.Font("Trebuchet MS", 3, 22)); // NOI18N
        Título.setForeground(new java.awt.Color(222, 180, 153));
        Título.setText("RSA rústico / Cifrado");

        txtP.setBackground(new java.awt.Color(184, 151, 120));
        txtP.setForeground(java.awt.SystemColor.controlHighlight);
        txtP.setCaretColor(new java.awt.Color(83, 61, 50));
        txtP.setSelectionColor(new java.awt.Color(222, 150, 95));
        txtP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPActionPerformed(evt);
            }
        });
        txtP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPKeyTyped(evt);
            }
        });

        texto3.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto3.setForeground(new java.awt.Color(226, 184, 144));
        texto3.setText("q:");

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

        btnGenerar.setBackground(new java.awt.Color(83, 61, 50));
        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(222, 150, 95));
        btnGenerar.setText("Generar claves");
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
        });
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Marco1Layout = new javax.swing.GroupLayout(Marco1);
        Marco1.setLayout(Marco1Layout);
        Marco1Layout.setHorizontalGroup(
            Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Título)
                    .addGroup(Marco1Layout.createSequentialGroup()
                        .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Marco1Layout.createSequentialGroup()
                                .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto5))
                            .addComponent(btnGenerar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Marco1Layout.createSequentialGroup()
                                .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto1)
                                .addGap(18, 18, 18)
                                .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(texto7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(texto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Marco1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCifrar)
                .addGap(269, 269, 269))
        );
        Marco1Layout.setVerticalGroup(
            Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Título)
                .addGap(38, 38, 38)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(texto1)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto3)
                    .addComponent(texto4)
                    .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto7))
                .addGap(32, 32, 32)
                .addGroup(Marco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto5)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnCifrar)
                .addGap(23, 23, 23))
        );

        Marco3.setBackground(new java.awt.Color(108, 75, 59));

        Título2.setFont(new java.awt.Font("Trebuchet MS", 3, 22)); // NOI18N
        Título2.setForeground(new java.awt.Color(222, 180, 153));
        Título2.setText("RSA rústico / Descifrado");

        texto13.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto13.setForeground(new java.awt.Color(222, 150, 95));
        texto13.setText("~");

        texto16.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto16.setForeground(new java.awt.Color(222, 150, 95));
        texto16.setText("~");

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

        MensajeCifrado.setBackground(new java.awt.Color(184, 151, 120));
        MensajeCifrado.setForeground(java.awt.SystemColor.controlHighlight);
        MensajeCifrado.setCaretColor(new java.awt.Color(83, 61, 50));
        MensajeCifrado.setSelectionColor(new java.awt.Color(222, 150, 95));
        MensajeCifrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MensajeCifradoKeyTyped(evt);
            }
        });

        texto14.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto14.setForeground(new java.awt.Color(222, 150, 95));
        texto14.setText("~");

        ValorQ.setBackground(new java.awt.Color(184, 151, 120));
        ValorQ.setForeground(java.awt.SystemColor.controlHighlight);
        ValorQ.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorQ.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorQKeyTyped(evt);
            }
        });

        texto15.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto15.setForeground(new java.awt.Color(226, 184, 144));
        texto15.setText("n:");

        ValorP.setBackground(new java.awt.Color(184, 151, 120));
        ValorP.setForeground(java.awt.SystemColor.controlHighlight);
        ValorP.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorP.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorPKeyTyped(evt);
            }
        });

        texto17.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto17.setForeground(new java.awt.Color(222, 150, 95));
        texto17.setText("~");

        ValorFi.setBackground(new java.awt.Color(184, 151, 120));
        ValorFi.setForeground(java.awt.SystemColor.controlHighlight);
        ValorFi.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorFi.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorFi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorFiKeyTyped(evt);
            }
        });

        texto18.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto18.setForeground(new java.awt.Color(226, 184, 144));
        texto18.setText("p:");

        ValorE.setBackground(new java.awt.Color(184, 151, 120));
        ValorE.setForeground(java.awt.SystemColor.controlHighlight);
        ValorE.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorE.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorEKeyTyped(evt);
            }
        });

        texto19.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto19.setForeground(new java.awt.Color(222, 150, 95));
        texto19.setText("~");

        MensajeDescifrado.setBackground(new java.awt.Color(108, 75, 59));
        MensajeDescifrado.setForeground(java.awt.SystemColor.controlHighlight);
        MensajeDescifrado.setCaretColor(new java.awt.Color(83, 61, 50));
        MensajeDescifrado.setSelectionColor(new java.awt.Color(222, 150, 95));
        MensajeDescifrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MensajeDescifradoKeyTyped(evt);
            }
        });

        texto20.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto20.setForeground(new java.awt.Color(226, 184, 144));
        texto20.setText("q:");

        ValorN.setBackground(new java.awt.Color(184, 151, 120));
        ValorN.setForeground(java.awt.SystemColor.controlHighlight);
        ValorN.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorN.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorNKeyTyped(evt);
            }
        });

        texto21.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto21.setForeground(new java.awt.Color(222, 150, 95));
        texto21.setText("~");

        texto22.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto22.setForeground(new java.awt.Color(226, 184, 144));
        texto22.setText("Mensaje cifrado:");

        texto23.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto23.setForeground(new java.awt.Color(226, 184, 144));
        texto23.setText("fi:");

        texto24.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto24.setForeground(new java.awt.Color(226, 184, 144));
        texto24.setText("e:");

        texto25.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        texto25.setForeground(new java.awt.Color(226, 184, 144));
        texto25.setText("d:");

        ValorD.setBackground(new java.awt.Color(184, 151, 120));
        ValorD.setForeground(java.awt.SystemColor.controlHighlight);
        ValorD.setCaretColor(new java.awt.Color(83, 61, 50));
        ValorD.setSelectionColor(new java.awt.Color(222, 150, 95));
        ValorD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorDKeyTyped(evt);
            }
        });

        texto26.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        texto26.setForeground(new java.awt.Color(222, 150, 95));
        texto26.setText("~");

        javax.swing.GroupLayout Marco3Layout = new javax.swing.GroupLayout(Marco3);
        Marco3.setLayout(Marco3Layout);
        Marco3Layout.setHorizontalGroup(
            Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Marco3Layout.createSequentialGroup()
                        .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Marco3Layout.createSequentialGroup()
                                .addComponent(texto13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MensajeCifrado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Marco3Layout.createSequentialGroup()
                                .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Marco3Layout.createSequentialGroup()
                                        .addComponent(texto14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ValorN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Marco3Layout.createSequentialGroup()
                                        .addComponent(texto17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ValorP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(texto19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Marco3Layout.createSequentialGroup()
                                        .addGap(280, 280, 280)
                                        .addComponent(texto26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto25))
                                    .addGroup(Marco3Layout.createSequentialGroup()
                                        .addComponent(ValorQ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                        .addComponent(texto21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ValorFi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(texto16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texto24)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ValorE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ValorD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Marco3Layout.createSequentialGroup()
                                .addComponent(MensajeDescifrado, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)))
                        .addGap(29, 29, 29))
                    .addComponent(Título2)))
            .addGroup(Marco3Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(btnDescifrar))
        );
        Marco3Layout.setVerticalGroup(
            Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Marco3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Título2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto22)
                    .addComponent(texto13)
                    .addComponent(MensajeCifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto23)
                        .addComponent(texto21)
                        .addComponent(ValorFi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto24)
                        .addComponent(texto16)
                        .addComponent(ValorE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto18)
                        .addComponent(texto17)
                        .addComponent(ValorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(texto19)
                        .addComponent(texto20)
                        .addComponent(ValorQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto25)
                    .addComponent(texto26)
                    .addComponent(ValorD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Marco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto15)
                        .addComponent(texto14)
                        .addComponent(ValorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDescifrar)
                .addGap(18, 18, 18)
                .addComponent(MensajeDescifrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Marco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Marco3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Marco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Marco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed

    }//GEN-LAST:event_btnCifrarActionPerformed

    private void txtPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPKeyTyped
        //NÚMERO PRIMO P. TAMBIÉN PUEDES ESCRIBIRLO, PERO QUE SOLO TENGA 3 CARACTERES Y SOLO NÚMEROS.
        
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
        
        if (txtP.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_txtPKeyTyped

    private void txtMensajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensajeKeyTyped

    }//GEN-LAST:event_txtMensajeKeyTyped

    private void txtQKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQKeyTyped
        //NÚMERO PRIMO Q. TAMBIÉN PUEDES ESCRIBIRLO, PERO QUE SOLO TENGA 3 CARACTERES Y SOLO NÚMEROS.
        
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
        
        if (txtQ.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_txtQKeyTyped

    private void btnCifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCifrarMouseClicked
        //BOTÓN PARA CIFRAR. ENCRIPTA EL MENSAJE QUE ESCRIBES Y MUESTRA EL VALOR DE LAS VARIABLES.
        
        //Obtener p y q para luego calcular n, fi, e y d
        BigInteger p = new BigInteger(txtP.getText());
        BigInteger q = new  BigInteger(txtQ.getText());
        RSA calcular = new RSA(p, q, 10);
        
        //Mostrar los valores de las variables
        ValorP.setText(""+p);
        ValorQ.setText(""+q);
        ValorN.setText(""+calcular.getN());
        ValorFi.setText(""+calcular.getFi());
        ValorE.setText(""+calcular.getE());
        ValorD.setText(""+calcular.getD());
        
        //Cifrar
        BigInteger[] cifrado = calcular.cifrar(txtMensaje.getText());
        for (BigInteger cifrado1 : cifrado) {
            MensajeCifrado.setText(MensajeCifrado.getText() + cifrado1);
        }
    }//GEN-LAST:event_btnCifrarMouseClicked

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked
        //BOTÓN GENERAR CLAVES. CREA LOS NÚMEROS PRIMOS P Y Q.

        //Generar las claves p y q
        RSA numero = new RSA(10);
        txtP.setText(""+numero.getP());
        txtQ.setText(""+numero.getQ());
    }//GEN-LAST:event_btnGenerarMouseClicked
    
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPActionPerformed

    }//GEN-LAST:event_txtPActionPerformed

    private void txtQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQActionPerformed

    }//GEN-LAST:event_txtQActionPerformed

    private void txtQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQ1ActionPerformed

    }//GEN-LAST:event_txtQ1ActionPerformed

    private void txtQ1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQ1KeyTyped
        
    }//GEN-LAST:event_txtQ1KeyTyped

    private void txtMensaje1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensaje1KeyTyped
        
    }//GEN-LAST:event_txtMensaje1KeyTyped

    private void txtP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtP1ActionPerformed
        
    }//GEN-LAST:event_txtP1ActionPerformed

    private void txtP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtP1KeyTyped
        
    }//GEN-LAST:event_txtP1KeyTyped

    private void btnCifrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCifrar1MouseClicked
        
    }//GEN-LAST:event_btnCifrar1MouseClicked

    private void btnCifrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrar1ActionPerformed
        
    }//GEN-LAST:event_btnCifrar1ActionPerformed

    private void btnGenerar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerar1MouseClicked
        
    }//GEN-LAST:event_btnGenerar1MouseClicked

    private void btnGenerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar1ActionPerformed
        
    }//GEN-LAST:event_btnGenerar1ActionPerformed

    private void btnDescifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescifrarMouseClicked
        
    }//GEN-LAST:event_btnDescifrarMouseClicked

    private void btnDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescifrarActionPerformed
        //BOTÓN DESCIFRAR. DESENCRIPTA EL MENSAJE CIFRADO.
        
        BigInteger p = new BigInteger(txtP.getText());
        BigInteger q = new BigInteger(txtQ.getText());
        RSA calcular = new RSA(p, q, 10);
        BigInteger[] cifrado = calcular.cifrar(txtMensaje.getText());
        
        //Descifrar
        MensajeDescifrado.setText(calcular.descifrar(cifrado));
    }//GEN-LAST:event_btnDescifrarActionPerformed

    private void MensajeCifradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MensajeCifradoKeyTyped

    }//GEN-LAST:event_MensajeCifradoKeyTyped

    private void ValorQKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorQKeyTyped
        //VALOR DE Q. TAMBIÉN PUEDES ESCRIBIRLO, PERO QUE SOLO TENGA NÚMEROS.
        
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_ValorQKeyTyped

    private void ValorPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorPKeyTyped
        //VALOR DE P. TAMBIÉN PUEDES ESCRIBIRLO, PERO QUE SOLO TENGA NÚMEROS.
        
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_ValorPKeyTyped

    private void ValorFiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorFiKeyTyped
        //VALOR DE FI. TAMBIÉN PUEDES ESCRIBIRLO, PERO QUE SOLO TENGA NÚMEROS.
        
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_ValorFiKeyTyped

    private void ValorEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorEKeyTyped
        //VALOR DE E. TAMBIÉN PUEDES ESCRIBIRLO, PERO QUE SOLO TENGA NÚMEROS.
        
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_ValorEKeyTyped

    private void MensajeDescifradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MensajeDescifradoKeyTyped

    }//GEN-LAST:event_MensajeDescifradoKeyTyped

    private void ValorNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorNKeyTyped
        //VALOR DE N. TAMBIÉN PUEDES ESCRIBIRLO, PERO QUE SOLO TENGA NÚMEROS.
        
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_ValorNKeyTyped

    private void ValorDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorDKeyTyped
        //VALOR DE D. TAMBIÉN PUEDES ESCRIBIRLO, PERO QUE SOLO TENGA NÚMEROS.
        
        char c = evt.getKeyChar();
        if ((c < '0') || (c > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_ValorDKeyTyped

    private void txtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeActionPerformed

    }//GEN-LAST:event_txtMensajeActionPerformed

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
    private javax.swing.JPanel Marco2;
    private javax.swing.JPanel Marco3;
    private javax.swing.JTextField MensajeCifrado;
    private javax.swing.JTextField MensajeDescifrado;
    private javax.swing.JLabel Título;
    private javax.swing.JLabel Título1;
    private javax.swing.JLabel Título2;
    private javax.swing.JTextField ValorD;
    private javax.swing.JTextField ValorE;
    private javax.swing.JTextField ValorFi;
    private javax.swing.JTextField ValorN;
    private javax.swing.JTextField ValorP;
    private javax.swing.JTextField ValorQ;
    private javax.swing.JButton btnCifrar;
    private javax.swing.JButton btnCifrar1;
    private javax.swing.JButton btnDescifrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGenerar1;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto10;
    private javax.swing.JLabel texto11;
    private javax.swing.JLabel texto12;
    private javax.swing.JLabel texto13;
    private javax.swing.JLabel texto14;
    private javax.swing.JLabel texto15;
    private javax.swing.JLabel texto16;
    private javax.swing.JLabel texto17;
    private javax.swing.JLabel texto18;
    private javax.swing.JLabel texto19;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto20;
    private javax.swing.JLabel texto21;
    private javax.swing.JLabel texto22;
    private javax.swing.JLabel texto23;
    private javax.swing.JLabel texto24;
    private javax.swing.JLabel texto25;
    private javax.swing.JLabel texto26;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JLabel texto7;
    private javax.swing.JLabel texto8;
    private javax.swing.JLabel texto9;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtMensaje1;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextField txtQ1;
    // End of variables declaration//GEN-END:variables
    
}
