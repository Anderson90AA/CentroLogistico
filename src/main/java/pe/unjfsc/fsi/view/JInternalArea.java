/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pe.unjfsc.fsi.view;

/**
 *
 * @author ander
 */
public class JInternalArea extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalArea
     */
    public JInternalArea() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        jLabelArea = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelMostrarUsuario = new javax.swing.JLabel();
        jPanelBody = new javax.swing.JPanel();
        jLabelCodigoArea = new javax.swing.JLabel();
        jLabelNombreArea = new javax.swing.JLabel();
        jTextFieldCodiArea = new javax.swing.JTextField();
        jTextFieldNombArea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListarAreas = new javax.swing.JTextArea();
        jButtonInsertar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabelListado = new javax.swing.JLabel();
        jPanelFoot = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();

        jLabelArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelArea.setText("Area");

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario:");

        jLabelMostrarUsuario.setText("jLabel1");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMostrarUsuario)
                .addGap(99, 99, 99))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArea, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelMostrarUsuario))
                .addContainerGap())
        );

        jLabelCodigoArea.setText("Codigo area:");

        jLabelNombreArea.setText("Nombre area:");

        jTextAreaListarAreas.setColumns(20);
        jTextAreaListarAreas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListarAreas);

        jButtonInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/unjfsc/fsi/view/save1.png"))); // NOI18N

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/unjfsc/fsi/view/pencil.png"))); // NOI18N

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/unjfsc/fsi/view/delete.png"))); // NOI18N

        jLabelListado.setText("Listado:");

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jLabelCodigoArea)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCodiArea, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jLabelNombreArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNombArea, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelListado)))
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminar)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodigoArea)
                    .addComponent(jTextFieldCodiArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreArea)
                    .addComponent(jTextFieldNombArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelListado)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/unjfsc/fsi/view/backward.png"))); // NOI18N
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFootLayout = new javax.swing.GroupLayout(jPanelFoot);
        jPanelFoot.setLayout(jPanelFootLayout);
        jPanelFootLayout.setHorizontalGroup(
            jPanelFootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFootLayout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanelFootLayout.setVerticalGroup(
            jPanelFootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFootLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelFoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelFoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
            this.dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelCodigoArea;
    private javax.swing.JLabel jLabelListado;
    private javax.swing.JLabel jLabelMostrarUsuario;
    private javax.swing.JLabel jLabelNombreArea;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelFoot;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaListarAreas;
    private javax.swing.JTextField jTextFieldCodiArea;
    private javax.swing.JTextField jTextFieldNombArea;
    // End of variables declaration//GEN-END:variables
}
