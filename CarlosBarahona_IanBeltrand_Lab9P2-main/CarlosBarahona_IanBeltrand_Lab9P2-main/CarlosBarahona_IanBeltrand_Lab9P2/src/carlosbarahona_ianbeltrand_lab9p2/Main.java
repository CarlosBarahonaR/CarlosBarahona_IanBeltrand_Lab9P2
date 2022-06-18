/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_ianbeltrand_lab9p2;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Google Drive");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearCarpetaDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NombreCarpetaCrear = new javax.swing.JTextField();
        GuardarUnidadButton = new javax.swing.JButton();
        SeleccionarCarpetaDialog = new javax.swing.JButton();
        CrearArchivoDialog = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GuardarArchivoCrear = new javax.swing.JButton();
        SizeArchivoCrear = new javax.swing.JSpinner();
        NombreArchivoCrear = new javax.swing.JTextField();
        ExtensionComboBox = new javax.swing.JComboBox<>();
        SeleccionCarpetaDialog = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TreeSeleccion = new javax.swing.JTree();
        GuardarCarpetaButton = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        MiUnidadTree = new javax.swing.JTree();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        CrearCarpetaDialog.setMaximumSize(new java.awt.Dimension(400, 180));
        CrearCarpetaDialog.setMinimumSize(new java.awt.Dimension(400, 180));

        jLabel3.setText("Creación de carpetas");

        jLabel4.setText("Nombre:");

        GuardarUnidadButton.setText("Guardar en unidad");
        GuardarUnidadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarUnidadButtonMouseClicked(evt);
            }
        });

        SeleccionarCarpetaDialog.setText("Seleccionar donde guardar");
        SeleccionarCarpetaDialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeleccionarCarpetaDialogMouseClicked(evt);
            }
        });
        SeleccionarCarpetaDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarCarpetaDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearCarpetaDialogLayout = new javax.swing.GroupLayout(CrearCarpetaDialog.getContentPane());
        CrearCarpetaDialog.getContentPane().setLayout(CrearCarpetaDialogLayout);
        CrearCarpetaDialogLayout.setHorizontalGroup(
            CrearCarpetaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearCarpetaDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(117, 117, 117))
            .addGroup(CrearCarpetaDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(CrearCarpetaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearCarpetaDialogLayout.createSequentialGroup()
                        .addComponent(GuardarUnidadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SeleccionarCarpetaDialog, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearCarpetaDialogLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NombreCarpetaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        CrearCarpetaDialogLayout.setVerticalGroup(
            CrearCarpetaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCarpetaDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(CrearCarpetaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NombreCarpetaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(CrearCarpetaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarUnidadButton)
                    .addComponent(SeleccionarCarpetaDialog))
                .addContainerGap())
        );

        CrearArchivoDialog.setMaximumSize(new java.awt.Dimension(450, 280));
        CrearArchivoDialog.setMinimumSize(new java.awt.Dimension(450, 280));

        jLabel5.setText("Creacion de archivos");

        jLabel6.setText("Nombre");

        jLabel7.setText("Extensión");

        jLabel8.setText("Tamaño");

        GuardarArchivoCrear.setText("Guardar");
        GuardarArchivoCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarArchivoCrearActionPerformed(evt);
            }
        });

        ExtensionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".pdf", ".docx", ".mp4", ".txt", ".png", ".jpg" }));

        javax.swing.GroupLayout CrearArchivoDialogLayout = new javax.swing.GroupLayout(CrearArchivoDialog.getContentPane());
        CrearArchivoDialog.getContentPane().setLayout(CrearArchivoDialogLayout);
        CrearArchivoDialogLayout.setHorizontalGroup(
            CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearArchivoDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(145, 145, 145))
            .addGroup(CrearArchivoDialogLayout.createSequentialGroup()
                .addGroup(CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearArchivoDialogLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CrearArchivoDialogLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(SizeArchivoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CrearArchivoDialogLayout.createSequentialGroup()
                                .addGroup(CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreArchivoCrear)
                                    .addComponent(ExtensionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(CrearArchivoDialogLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(GuardarArchivoCrear)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        CrearArchivoDialogLayout.setVerticalGroup(
            CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearArchivoDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NombreArchivoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ExtensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(CrearArchivoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SizeArchivoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(GuardarArchivoCrear)
                .addGap(19, 19, 19))
        );

        SeleccionCarpetaDialog.setMaximumSize(new java.awt.Dimension(400, 520));
        SeleccionCarpetaDialog.setMinimumSize(new java.awt.Dimension(400, 520));

        jLabel9.setText("¿En que parte de la Unidad dese guardar?");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mi Unidad");
        TreeSeleccion.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        TreeSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreeSeleccionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TreeSeleccion);

        GuardarCarpetaButton.setText("Guardar");
        GuardarCarpetaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarCarpetaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SeleccionCarpetaDialogLayout = new javax.swing.GroupLayout(SeleccionCarpetaDialog.getContentPane());
        SeleccionCarpetaDialog.getContentPane().setLayout(SeleccionCarpetaDialogLayout);
        SeleccionCarpetaDialogLayout.setHorizontalGroup(
            SeleccionCarpetaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionCarpetaDialogLayout.createSequentialGroup()
                .addGroup(SeleccionCarpetaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeleccionCarpetaDialogLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel9))
                    .addGroup(SeleccionCarpetaDialogLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SeleccionCarpetaDialogLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(GuardarCarpetaButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        SeleccionCarpetaDialogLayout.setVerticalGroup(
            SeleccionCarpetaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionCarpetaDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(GuardarCarpetaButton)
                .addContainerGap())
        );

        jMenuItem7.setText("Descargar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem7);

        jMenuItem6.setText("Eliminar");
        jPopupMenu1.add(jMenuItem6);

        jMenuItem8.setText("Destacar");
        jPopupMenu1.add(jMenuItem8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("MI UNIDAD");
        MiUnidadTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        MiUnidadTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiUnidadTreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MiUnidadTree);

        jLabel1.setText("Descarga individual");

        jLabel2.setText("Descarga total");

        jMenu1.setText("MENU");

        jMenuItem1.setText("Mi Unidad");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Destacados");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Papelera");
        jMenu1.add(jMenuItem3);

        jMenu2.setText("Agregar");

        jMenuItem4.setText("Agregar Archivos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Agregar Carpetas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ActualizarTreeMiUnidad() {
        DefaultTreeModel model = (DefaultTreeModel) MiUnidadTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();

        for (Carpetas carpeta : admi.getMiUnidad().getCarpetas()) {
            DefaultMutableTreeNode nodeCarpeta = new DefaultMutableTreeNode(carpeta);

            ActualizarTreeRecursiva(carpeta, nodeCarpeta);

            root.add(nodeCarpeta);
        }

        model.reload();
        TreeSeleccion.setModel(model);
    }

    public void ActualizarTreeRecursiva(Carpetas carpetaA, DefaultMutableTreeNode nodeA) {
        for (Carpetas carpeta : carpetaA.getCarpetas()) {
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(carpeta);

            ActualizarTreeRecursiva(carpeta, newNode);
            nodeA.add(newNode);

        }

        for (Archivos archivo : carpetaA.getArchivos()) {
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(archivo);

            nodeA.add(newNode);
        }
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:

        CrearArchivoDialog.setTitle("Crear archivos");
        CrearArchivoDialog.setVisible(true);
        CrearArchivoDialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        CrearCarpetaDialog.setLocationRelativeTo(null);
        CrearCarpetaDialog.setTitle("Crear carpetas");
        CrearCarpetaDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void SeleccionarCarpetaDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarCarpetaDialogActionPerformed
        // TODO add your handling code here:
        SeleccionCarpetaDialog.setLocationRelativeTo(null);
        SeleccionCarpetaDialog.setTitle("¿Donde desea guardar?");
        SeleccionCarpetaDialog.setVisible(true);
    }//GEN-LAST:event_SeleccionarCarpetaDialogActionPerformed

    private void GuardarArchivoCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarArchivoCrearActionPerformed
        // TODO add your handling code here:
        SeleccionCarpetaDialog.setLocationRelativeTo(null);
        SeleccionCarpetaDialog.setTitle("¿Donde desea guardar?");
        SeleccionCarpetaDialog.setVisible(true);
    }//GEN-LAST:event_GuardarArchivoCrearActionPerformed

    public String GenerarLinkCarpeta(Carpetas padre) {
        String link = "dive.google.com";

        link = link + admi.GenerarDireccionCarpeta(padre.getNombre(), padre, link);

        link = link + "/";

        for (int i = 0; i < 5; i++) {
            Random r = new Random();

            char c = (char) (r.nextInt(26) + 'a');

            link = link + c;
        }

        return link;
    }

    private void GuardarUnidadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarUnidadButtonMouseClicked
        // TODO add your handling code here:
        String name = NombreCarpetaCrear.getText();

        admi.getMiUnidad().getCarpetas().add(new Carpetas(name, GenerarLinkCarpeta(admi.getMiUnidad())));

        AgregarBaseDatos(new Carpetas(name, GenerarLinkCarpeta(admi.getMiUnidad())));

        ActualizarTreeMiUnidad();
    }//GEN-LAST:event_GuardarUnidadButtonMouseClicked

    private void SeleccionarCarpetaDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeleccionarCarpetaDialogMouseClicked
        // TODO add your handling code here:
        SeleccionCarpetaDialog.setLocationRelativeTo(null);
        SeleccionCarpetaDialog.setTitle("¿Donde desea guardar?");
        SeleccionCarpetaDialog.setVisible(true);

        ActualizarTreeMiUnidad();
    }//GEN-LAST:event_SeleccionarCarpetaDialogMouseClicked

    private void GuardarCarpetaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarCarpetaButtonMouseClicked
        // TODO add your handling code here:

        // TODO add your handling code here:

       if(binario == 0){

           if(SelectedNode.getUserObject() instanceof Carpetas){

               Carpetas carpetaSeleccionada = (Carpetas) SelectedNode.getUserObject();

 

               String name = NombreCarpetaCrear.getText();

 

               carpetaSeleccionada.getCarpetas().add(new Carpetas(name, GenerarLinkCarpeta(carpetaSeleccionada)));

 

               AgregarBaseDatos(new Carpetas(name, GenerarLinkCarpeta(carpetaSeleccionada)));

 

               ActualizarTreeMiUnidad();

 

           }else{

               JOptionPane.showMessageDialog(SeleccionCarpetaDialog, "Lo seleccionado no es una carpeta");

           }

       }else{

           if(binario == 1){

               if(SelectedNode.getUserObject() instanceof Carpetas){

                   Carpetas carpetaSeleccionada = (Carpetas) SelectedNode.getUserObject();

 

                   String name = NombreArchivoCrear.getText();

                   String extension = ExtensionComboBox.getSelectedItem().toString();

                   String link = "";

                   int size = (Integer) SizeArchivoCrear.getValue();

 

                   carpetaSeleccionada.getArchivos().add(new Archivos(name, extension, link, size));

 

                   AgregarBaseDatosA(new Archivos(name, extension, link, size));

                   

                   ActualizarTreeMiUnidad();

 

               }else{

                   JOptionPane.showMessageDialog(SeleccionCarpetaDialog, "Lo seleccionado no es una carpeta");

               }

           }

       }
    }//GEN-LAST:event_GuardarCarpetaButtonMouseClicked

    public void AgregarBaseDatos(Carpetas Carpeta) {
        Dba db = new Dba("./GoogleUndead.mdb");
        db.conectar();
        try {
            int c = 0;
            String n = Carpeta.getNombre();
            Date date = new Date();

            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String sDate = dateFormat.format(date);

            db.query.execute("INSERT INTO Carpetas"
                    + " VALUES ('" + n + "', '" + c + "', '" + sDate + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

    }
    
    
    private void TreeSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreeSeleccionMouseClicked
        // TODO add your handling code here:
        int row = TreeSeleccion.getClosestRowForLocation(evt.getX(), evt.getY());
        TreeSeleccion.setSelectionRow(row);
        Object Posicion = TreeSeleccion.getSelectionPath().getLastPathComponent();
        SelectedNode = (DefaultMutableTreeNode) Posicion;
    }//GEN-LAST:event_TreeSeleccionMouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        hilo = new Thread((Runnable) this);
        hilo.start();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void MiUnidadTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiUnidadTreeMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {

            //seleccionar un nodo con click derecho
            int row = MiUnidadTree.getClosestRowForLocation(evt.getX(), evt.getY());

            MiUnidadTree.setSelectionRow(row);

            Object Posicion = MiUnidadTree.getSelectionPath().getLastPathComponent();

            SelectedNode = (DefaultMutableTreeNode) Posicion;

            if (SelectedNode.getUserObject() instanceof Archivos) {

                archivo = (Archivos) SelectedNode.getUserObject();

                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());

            }

            if (SelectedNode.getUserObject() instanceof Carpetas) {

                carpeta = (Carpetas) SelectedNode.getUserObject();
                System.out.println(SelectedNode.getUserObject());

                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());

            }

        }
    }//GEN-LAST:event_MiUnidadTreeMouseClicked

    public void run() {
        if (carpeta != null) {
            int totalDescarga = 0;
            int descargaIndividual = 0;
            for (int i = 0; i < carpeta.getArchivos().size(); i++) {
                totalDescarga += carpeta.getArchivos().get(i).getTamaño();
            }

            try {
                for (int i = 0; i <= 100; i++) {
                    int x = 0;

                    jProgressBar3.setValue(jProgressBar3.getValue() + 1);
                    if (jProgressBar3.getValue() == 100) {
                        jProgressBar3.setValue(0);
                    }
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (archivo != null) {
            int totalDescarga = 0;
    
                totalDescarga = archivo.getTamaño();
        
            try {

                for (int i = 0; i <= totalDescarga; i++) {
                    int x = 0;

                    jProgressBar3.setValue(jProgressBar3.getValue() + 1);
                    if (jProgressBar3.getValue() == 100) {
                        jProgressBar3.setValue(0);
                    }
                    Thread.sleep(totalDescarga);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public void AgregarBaseDatosA(Archivos archivo){

       Dba db = new Dba("./GoogleUndead.mdb");

       db.conectar();

       try {

           int size = archivo.getTamaño();

           String n = archivo.getNombre();

           Date date = new Date();

           String carpeta = "Yes";

           

           DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh🇲🇲ss");

           String sDate = dateFormat.format(date);

           

           db.query.execute("INSERT INTO Archivos"

                   + " VALUES ('" + n + "', '" + size + "', '" + sDate + "', '" + carpeta + "')");

           db.commit();

       } catch (SQLException ex) {

           ex.printStackTrace();

       }

       db.desconectar();

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CrearArchivoDialog;
    private javax.swing.JDialog CrearCarpetaDialog;
    private javax.swing.JComboBox<String> ExtensionComboBox;
    private javax.swing.JButton GuardarArchivoCrear;
    private javax.swing.JButton GuardarCarpetaButton;
    private javax.swing.JButton GuardarUnidadButton;
    private javax.swing.JTree MiUnidadTree;
    private javax.swing.JTextField NombreArchivoCrear;
    private javax.swing.JTextField NombreCarpetaCrear;
    private javax.swing.JDialog SeleccionCarpetaDialog;
    private javax.swing.JButton SeleccionarCarpetaDialog;
    private javax.swing.JSpinner SizeArchivoCrear;
    private javax.swing.JTree TreeSeleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    Admi admi = new Admi();
    Carpetas carpeta = null;
    Archivos archivo = null;
    DefaultMutableTreeNode SelectedNode = null;
    Thread hilo;
    int binario=0;
}
