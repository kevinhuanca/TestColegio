package vistas;

import entidades.Alumno;
import entidades.Materia;
import javax.swing.JOptionPane;

public class FormularioInscripcion extends javax.swing.JInternalFrame {
//    private ArrayList<>

    public FormularioInscripcion() {
        initComponents();
        agregarMaterias();
        agregarAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbMaterias = new javax.swing.JComboBox<>();
        cmbAlumnos = new javax.swing.JComboBox<>();
        lblElejirMateria = new javax.swing.JLabel();
        lblElejirAlumno = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnInscribir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        lblElejirMateria.setText("Eija una materia:");

        lblElejirAlumno.setText("Elija un alumno:");

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Formulario de Inscripción");

        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblElejirMateria)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblElejirAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnInscribir)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElejirMateria))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElejirAlumno))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        Materia materiaSelecionada = (Materia)cmbMaterias.getSelectedItem();
        Alumno alumnoSeleccionado = (Alumno)cmbAlumnos.getSelectedItem();
        
        if (alumnoSeleccionado.getMaterias().contains(materiaSelecionada)) {
            JOptionPane.showMessageDialog(this, "El alumno ya fue inscrito en la materia!");
        } else {
            alumnoSeleccionado.agregarMateria(materiaSelecionada);
        
            System.out.print(alumnoSeleccionado.toString()+" esta inscrito en "+alumnoSeleccionado.cantidadMaterias()+" materias: ");
            System.out.println(alumnoSeleccionado.getMaterias()+"\n");
        
            JOptionPane.showMessageDialog(this, "Inscripcion exitosa!");
        }
    }//GEN-LAST:event_btnInscribirActionPerformed

    public void agregarMaterias() {
        for (Materia materia : Menu.listadoMaterias) {
            cmbMaterias.addItem(materia);
        }
    }
    
    public void agregarAlumnos() {
        for (Alumno alumno : Menu.listadoAlumnos) {
            cmbAlumnos.addItem(alumno);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> cmbAlumnos;
    private javax.swing.JComboBox<Materia> cmbMaterias;
    private javax.swing.JLabel lblElejirAlumno;
    private javax.swing.JLabel lblElejirMateria;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
