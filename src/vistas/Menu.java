package vistas;

import entidades.Alumno;
import entidades.Materia;
import java.util.ArrayList;
import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {
    public static ArrayList<Materia> listadoMaterias = new ArrayList<>();
    public static ArrayList<Alumno> listadoAlumnos = new ArrayList<>();
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBarra = new javax.swing.JMenuBar();
        menuForm = new javax.swing.JMenu();
        menuItemAlumnos = new javax.swing.JMenuItem();
        menuItemMaterias = new javax.swing.JMenuItem();
        menuItemInscripcion = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        menuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        menuForm.setText("Formularios");

        menuItemAlumnos.setText("Alumnos");
        menuItemAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAlumnosActionPerformed(evt);
            }
        });
        menuForm.add(menuItemAlumnos);

        menuItemMaterias.setText("Materias");
        menuItemMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMateriasActionPerformed(evt);
            }
        });
        menuForm.add(menuItemMaterias);

        menuItemInscripcion.setText("Inscripción");
        menuItemInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInscripcionActionPerformed(evt);
            }
        });
        menuForm.add(menuItemInscripcion);

        menuBarra.add(menuForm);

        menuSalir.setText("Salir");

        menuItemSalir.setText("Salir del Sistema");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuSalir.add(menuItemSalir);

        menuBarra.add(menuSalir);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumno formA = new FormularioAlumno();
        centrarVentana(formA);
    }//GEN-LAST:event_menuItemAlumnosActionPerformed

    private void menuItemMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMateriasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria formM = new FormularioMateria();
        centrarVentana(formM);
    }//GEN-LAST:event_menuItemMateriasActionPerformed

    private void menuItemInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion formI = new FormularioInscripcion();
        centrarVentana(formI);
    }//GEN-LAST:event_menuItemInscripcionActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    public void centrarVentana(JInternalFrame ventana) {
        int x = escritorio.getWidth()/2 - ventana.getWidth()/2;
        int y = escritorio.getHeight()/2 - ventana.getHeight()/2;
        if (ventana.isShowing()) {
            ventana.setLocation(x, y);
        } else {
            escritorio.add(ventana);
            ventana.setLocation(x, y);
            ventana.show();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuForm;
    private javax.swing.JMenuItem menuItemAlumnos;
    private javax.swing.JMenuItem menuItemInscripcion;
    private javax.swing.JMenuItem menuItemMaterias;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
