/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerobalamdevs.Ventana;

/**
 *
 * @author annelis
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelMenu = new javax.swing.JLabel();
        jButtonOpcionPasajero = new javax.swing.JButton();
        jButtonOpcionAdministracion = new javax.swing.JButton();
        jLabelAviso = new javax.swing.JLabel();
        jLabelBienvenida = new javax.swing.JLabel();
        jLabelFondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AeroBalamDevs");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 51));
        jButtonSalir.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 51, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, -1));

        jLabelMenu.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMenu.setFont(new java.awt.Font("aakar", 3, 24)); // NOI18N
        jLabelMenu.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMenu.setText("Menu opciones principales");
        getContentPane().add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 300, -1));

        jButtonOpcionPasajero.setBackground(new java.awt.Color(0, 0, 153));
        jButtonOpcionPasajero.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jButtonOpcionPasajero.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpcionPasajero.setText("Pasajero");
        jButtonOpcionPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpcionPasajeroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOpcionPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 200, 40));

        jButtonOpcionAdministracion.setBackground(new java.awt.Color(0, 0, 153));
        jButtonOpcionAdministracion.setFont(new java.awt.Font("Waree", 3, 18)); // NOI18N
        jButtonOpcionAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOpcionAdministracion.setText("Administraci??n");
        jButtonOpcionAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpcionAdministracionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOpcionAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 200, 40));

        jLabelAviso.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jLabelAviso.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAviso.setText("Solo personal autoriazado");
        getContentPane().add(jLabelAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 230, 40));

        jLabelBienvenida.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jLabelBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenida.setText("Bienvenido a AeroBalamDevs, siempre su mejor opcion");
        getContentPane().add(jLabelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 20));

        jLabelFondoInicio.setFont(new java.awt.Font("aakar", 3, 18)); // NOI18N
        jLabelFondoInicio.setForeground(new java.awt.Color(255, 0, 0));
        jLabelFondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aerobalamdevs/Imagenes/aeropuerto.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        
     /**
     * Este m??todo nos permite cerrar la interfaz, ya que se esta haciendo de manera
     * personalizada
     */
        
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

     /**
     * En los siguientes dos botones vamos a llamar a las otras
     * ventanas por medio de creaci??n de objetos. Tambi??n usamos el ActionPerformed
     * para que nuestros botones tengan las acciones correspondientes
     */
    
    private void jButtonOpcionPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpcionPasajeroActionPerformed
        // Mandamos a llamar a JFrame correspondiente
        Pasajero vistaPasajero = new Pasajero();
        vistaPasajero.setVisible(true);
        
     /**
     * @param dispose para que s??lo se nos muestre una ventana a la vez
     * y no se vea una ventana tras otra
     */
        this.dispose();
    }//GEN-LAST:event_jButtonOpcionPasajeroActionPerformed

    private void jButtonOpcionAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpcionAdministracionActionPerformed
        // Mandamos a llamar a JFrame correspondiente
        InicioSesionAdministracion vistaAdministracion = new InicioSesionAdministracion();
        vistaAdministracion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonOpcionAdministracionActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOpcionAdministracion;
    private javax.swing.JButton jButtonOpcionPasajero;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelAviso;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelFondoInicio;
    private javax.swing.JLabel jLabelMenu;
    // End of variables declaration//GEN-END:variables
}
