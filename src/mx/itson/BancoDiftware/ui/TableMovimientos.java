/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.BancoDiftware.ui;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import mx.itson.BancoDiftware.entidades.Movimiento;
import mx.itson.BancoDiftware.persistencia.MovimientoDAO;

/**
 * JFrame que muestra la tabla de movimientos del usuario
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class TableMovimientos extends javax.swing.JFrame {

    public TableMovimientos() {
        initComponents();
       llenarTabla();
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnRegresar.setBackground(new java.awt.Color(81, 84, 255));
        btnRegresar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descrioción", "Cantidad", "Fecha", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tblMovimientos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static Locale local = new Locale("es", "MX");
    static NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(local);
    SimpleDateFormat formatter = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");

    /**
     * Permite llenar la tabla con los datos de cada Movimiento del Cliente.
     */
    public  void llenarTabla() {
      
     
        List<Movimiento> a = MovimientoDAO.obtener();
        DefaultTableModel model = (DefaultTableModel) tblMovimientos.getModel();
        model.setRowCount(0);

        for (Movimiento m : a) {

            model.addRow(new Object[]{
              
                m.getDescripcion(),
                formatoMoneda.format(m.getCantidad()),
                m.getFecha(),
                m.getTipo()

            });

        }
    }

    /**
     * Boton que permite regresar a JFrame Inicio.
     * @param evt Regresar.
     */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio obj = new Inicio();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMovimientos;
    // End of variables declaration//GEN-END:variables
}
