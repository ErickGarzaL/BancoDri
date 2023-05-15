/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mx.itson.BancoDiftware.ui;

import javax.swing.JOptionPane;
import mx.itson.BancoDiftware.excepciones.CompletarException;
import mx.itson.BancoDiftware.persistencia.OperacionDAO;

/**
 *  JDialog que permite ingresar la cantidad de dinero a retirar.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class RetiroForm extends javax.swing.JDialog {
int id;
    /**
     * Creates new form RetiroForm
     */
    public RetiroForm(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMonto = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAceptarD = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtMots = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtMonto.setBackground(new java.awt.Color(255, 255, 255));

        lbl.setBackground(new java.awt.Color(112, 145, 255));
        lbl.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        lbl.setForeground(new java.awt.Color(112, 145, 255));
        lbl.setText("Retiro");

        lbl1.setBackground(new java.awt.Color(112, 145, 255));
        lbl1.setFont(new java.awt.Font("Lucida Sans", 1, 15)); // NOI18N
        lbl1.setForeground(new java.awt.Color(112, 145, 255));
        lbl1.setText("Monto:");

        jSeparator1.setBackground(new java.awt.Color(112, 145, 255));
        jSeparator1.setForeground(new java.awt.Color(112, 145, 255));

        btnAceptarD.setBackground(new java.awt.Color(81, 84, 255));
        btnAceptarD.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnAceptarD.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarD.setText("Aceptar");
        btnAceptarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarDActionPerformed(evt);
            }
        });

        lbl2.setBackground(new java.awt.Color(112, 145, 255));
        lbl2.setFont(new java.awt.Font("Lucida Sans", 1, 15)); // NOI18N
        lbl2.setForeground(new java.awt.Color(112, 145, 255));
        lbl2.setText("Numero de tarjeta:");

        jSeparator2.setBackground(new java.awt.Color(112, 145, 255));
        jSeparator2.setForeground(new java.awt.Color(112, 145, 255));

        txtMots.setBackground(new java.awt.Color(255, 255, 255));
        txtMots.setForeground(new java.awt.Color(0, 0, 0));
        txtMots.setBorder(null);

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setBorder(null);

        javax.swing.GroupLayout txtMontoLayout = new javax.swing.GroupLayout(txtMonto);
        txtMonto.setLayout(txtMontoLayout);
        txtMontoLayout.setHorizontalGroup(
            txtMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMontoLayout.createSequentialGroup()
                .addGroup(txtMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtMontoLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnAceptarD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtMontoLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(lbl1))
                    .addGroup(txtMontoLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lbl2))
                    .addGroup(txtMontoLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(txtMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(txtMots, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                    .addGroup(txtMontoLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lbl)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        txtMontoLayout.setVerticalGroup(
            txtMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMontoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl)
                .addGap(29, 29, 29)
                .addComponent(lbl2)
                .addGap(20, 20, 20)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(txtMots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnAceptarD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Guarda la cantidad de dinero que se retiro y actualiza la tabla del Inicio.
     * @param evt Aceptar.
     */
    private void btnAceptarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarDActionPerformed
      
        
        
        
        
        
        
        try {
             if (txtMots.getText().isEmpty() || txtNumero.getText().isEmpty()) {
            throw new CompletarException("Favor de llenar los campos");
        } else {
                 
                 
        double saldoInicial = Double.parseDouble(txtMots.getText());
        
        
        OperacionDAO.guardar(saldoInicial); 
            
        }
             
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
        
        
        
        
        /*
        boolean resultado = this.id == 0?

        if(resultado){
            JOptionPane.showMessageDialog(this, "El deposito se realizo correctamente", "Deposito realizado", JOptionPane.INFORMATION_MESSAGE );
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error en el proceso", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
        */
    }//GEN-LAST:event_btnAceptarDActionPerformed

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
            java.util.logging.Logger.getLogger(RetiroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetiroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetiroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetiroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RetiroForm dialog = new RetiroForm(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarD;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JPanel txtMonto;
    private javax.swing.JTextField txtMots;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
