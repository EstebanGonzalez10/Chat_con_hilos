import java.io.IOException;

public class MainJFrame extends javax.swing.JFrame {
    private Thread hiloChat1, hiloChat2;
    private HiloCuestionario hiloCuestionario;
    
    public MainJFrame() throws IOException {
        initComponents();                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlPregunta = new javax.swing.JLabel();
        jtfRespuesta = new javax.swing.JTextField();
        jbConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaHistorial = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaChat = new javax.swing.JTextArea();
        jbIniciar = new javax.swing.JButton();
        jbIniciarPrueba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generando un chat usando hilos");
        jLabel1.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("1. Observa la siguiente conversación");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("2. Completa los enunciados");

        jlPregunta.setText("¿?");

        jbConfirmar.setText("Confirmar");
        jbConfirmar.setEnabled(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jtaHistorial.setColumns(20);
        jtaHistorial.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jtaHistorial.setRows(5);
        jtaHistorial.setText("My history");
        jtaHistorial.setEnabled(false);
        jScrollPane1.setViewportView(jtaHistorial);

        jtaChat.setBackground(new java.awt.Color(255, 255, 255));
        jtaChat.setColumns(20);
        jtaChat.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jtaChat.setLineWrap(true);
        jtaChat.setRows(5);
        jtaChat.setText("Meg Martin and Kathy O'Brien chat online almost every day. Meg is an exchange student from the U.S. She's studying in Mexico. Kathy is in the U.S.\n\n");
        jtaChat.setEnabled(false);
        jScrollPane2.setViewportView(jtaChat);

        jbIniciar.setText("Iniciar conversación");
        jbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarActionPerformed(evt);
            }
        });

        jbIniciarPrueba.setText("Iniciar");
        jbIniciarPrueba.setEnabled(false);
        jbIniciarPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarPruebaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jbIniciar)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jbIniciarPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfRespuesta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbConfirmar))
                    .addComponent(jlPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jbIniciarPrueba))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jlPregunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConfirmar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jbIniciar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        hiloCuestionario.setRespuesta(jtfRespuesta.getText());
        jtfRespuesta.setText("");
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarActionPerformed
        try {
            HiloChat chat1 = new HiloChat("megm", null, true);
            HiloChat chat2 = new HiloChat("kathyo", chat1, false);
            chat1.setOtroChat(chat2);
            
            hiloChat1 = new Thread(chat1);
            hiloChat2 = new Thread(chat2);
            
            hiloChat1.start();
            hiloChat2.start();
            jbIniciar.setEnabled(false);
        } catch (IOException ex) {}        
    }//GEN-LAST:event_jbIniciarActionPerformed

    private void jbIniciarPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarPruebaActionPerformed
        try {
            hiloCuestionario = new HiloCuestionario("preguntas.csv");
            hiloCuestionario.start();
            jbIniciarPrueba.setEnabled(false);
            jbConfirmar.setEnabled(true);
        } catch (IOException ex) {}
    }//GEN-LAST:event_jbIniciarPruebaActionPerformed

    public static void main(String args[]) {               
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJFrame().setVisible(true);
                } catch (IOException ex) {}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbIniciar;
    public static javax.swing.JButton jbIniciarPrueba;
    public static javax.swing.JLabel jlPregunta;
    public static javax.swing.JTextArea jtaChat;
    public static javax.swing.JTextArea jtaHistorial;
    private javax.swing.JTextField jtfRespuesta;
    // End of variables declaration//GEN-END:variables
}
