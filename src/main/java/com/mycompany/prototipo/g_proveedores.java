
package com.mycompany.prototipo;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class g_proveedores extends javax.swing.JFrame {
    
    DefaultTableModel dtm = new  DefaultTableModel();
    

    
    public g_proveedores() {
        initComponents();
        String[] titulo = new String[]{"id","nombres","material"};
        dtm.setColumnIdentifiers(titulo);
        tblDatos.setModel(dtm);
    }
    
void agregar(){

}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion de proveedores");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carpinteria Jose Abel");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 62));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 6, -1, -1));

        jButton2.setBackground(new java.awt.Color(29, 30, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Escritorio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 180, 38));

        jButton3.setBackground(new java.awt.Color(29, 30, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Inventario");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 180, 38));

        jButton4.setBackground(new java.awt.Color(29, 30, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Gestion de proveedores");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, 180, 38));

        jButton6.setBackground(new java.awt.Color(29, 30, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Gestion de usuarios");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 180, 34));

        jButton7.setBackground(new java.awt.Color(29, 30, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Configuracion");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 180, 34));

        jButton8.setBackground(new java.awt.Color(29, 30, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Gestion de pedidos");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 246, 180, 30));

        jButton9.setBackground(new java.awt.Color(29, 30, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Contabilidad");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 282, 180, 30));

        jButton10.setBackground(new java.awt.Color(29, 30, 51));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Gestion de clientes");
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 180, 35));

        jButton13.setBackground(new java.awt.Color(0, 0, 51));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Exit");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 73, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 520));

        jButton12.setText("Eliminar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "23423", "maria", "Peña", "29345345", "123 hola st"},
                { new Integer(2), "32423", "mariana", "Cruz", "23345345", "456 sogamoso St"},
                { new Integer(3), "56546", "esteban", "Grisaldo", "433453", "789 pueblo paleta St"},
                { new Integer(4), "43543", "brayan", "Perez", "1234533", "Avenida 170 Bogota"},
                { new Integer(5), "78978", "juan", "Pinzon", "34534523", "Calle 12 #33-65"}
            },
            new String [] {
                "#", "ID", "Nombre", "Apellido", "Telefono", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 150, 640, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 100, 200, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Admin");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String searchText = jTextField1.getText().trim();
        boolean found = false;

        tblDatos.clearSelection();

        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            String numberCellValue = tblDatos.getValueAt(i, 0).toString(); // Columna #
            String idCellValue = tblDatos.getValueAt(i, 1).toString(); // Columna ID
            String nameCellValue = tblDatos.getValueAt(i, 2).toString(); // Columna Nombre

            if (numberCellValue.equals(searchText) || idCellValue.equals(searchText) || nameCellValue.toLowerCase().contains(searchText.toLowerCase())) {
                tblDatos.setRowSelectionInterval(i, i);
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "No se encontró el registro.", "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
        }

        // Si no se encontró el texto, mostrar un mensaje
        if (!found) {
            JOptionPane.showMessageDialog(this, "No se encontró el ID o Nombre.", "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Crear un array para almacenar los datos
        String[] datos = new String[4];

        // Pedir al usuario que ingrese los datos
        datos[0] = JOptionPane.showInputDialog(this, "Ingrese el Nombre:");
        datos[1] = JOptionPane.showInputDialog(this, "Ingrese la Apellido:");
        datos[2] = JOptionPane.showInputDialog(this, "Ingrese la Telefono:");
        datos[3] = JOptionPane.showInputDialog(this, "Ingrese la Dirección:");

        // Validar que los campos no estén vacíos
        for (String dato : datos) {
            if (dato == null || dato.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Generar un ID aleatorio de 4 cifras
        int newId;
        do {
            newId = generateRandomId(5); // Cambia el número de cifras aquí si es necesario
        } while (idExists(newId)); // Verifica que el ID no se repita

        // Agregar los datos a la tabla
        DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
        int rowCount = model.getRowCount(); // Obtener el número actual de filas
        Object[] rowData = {rowCount + 1, newId, datos[0], datos[1], datos[2],datos[3]}; // Asignar el número de fila
        model.addRow(rowData);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // Obtener el índice de la fila seleccionada
        int selectedRow = tblDatos.getSelectedRow();

        // Verificar si se ha seleccionado alguna fila
        if (selectedRow != -1) {
            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();

            // Eliminar la fila seleccionada
            model.removeRow(selectedRow);

            // Actualizar la numeración de la columna #
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt(i + 1, i, 0); // Actualiza la columna # (índice 0)
            }

            // Mostrar un mensaje de confirmación
            JOptionPane.showMessageDialog(this, "Eliminado correctamente.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si no hay fila seleccionada, mostrar un mensaje de advertencia
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un registro para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         escritorio db = new escritorio();
            db.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        g_pedidos gpe = new g_pedidos();
            gpe.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(g_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(g_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(g_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(g_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new g_proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables

    private boolean idExists(int newId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int generateRandomId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
