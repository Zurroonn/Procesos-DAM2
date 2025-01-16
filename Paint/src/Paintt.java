/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aazur
 */
public class Paintt extends javax.swing.JFrame {

    enum Opciones {
        PINTAR,
        CIRCULOS,
        NADA,
        BORRAR

    }
    Opciones seleccion = Opciones.NADA;

    private BufferedImage imagen;
    private Point anterior = null;
    private Color colorseleccionado = Color.BLACK;
    private static final int TAMANO_CIRCULO = 50;

    /**
     * Creates new form Paintt
     */
    public Paintt() {
        initComponents();
        imagen = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
        getContentPane().setBackground(Color.WHITE);
        // Llena el fondo con blanco
        Graphics g = imagen.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, imagen.getWidth(), imagen.getHeight());
        g.dispose();
        Borrar.setFocusable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        Pintar = new javax.swing.JButton();
        Circulos = new javax.swing.JButton();
        Colorr = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        Pintar.setText("Pintar");
        Pintar.setFocusable(false);
        Pintar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pintar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PintarActionPerformed(evt);
            }
        });
        jToolBar1.add(Pintar);

        Circulos.setText("Circulos");
        Circulos.setFocusable(false);
        Circulos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Circulos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Circulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CirculosActionPerformed(evt);
            }
        });
        jToolBar1.add(Circulos);

        Colorr.setText("Colorr");
        Colorr.setFocusable(false);
        Colorr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Colorr.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Colorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorrActionPerformed(evt);
            }
        });
        jToolBar1.add(Colorr);

        Guardar.setText("Guardar");
        Guardar.setFocusable(false);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(Guardar);

        Clear.setText("Clear");
        Clear.setFocusable(false);
        Clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Clear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jToolBar1.add(Clear);

        Borrar.setText("Borrar");
        Borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Borrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(Borrar);

        Salir.setText("Salir");
        Salir.setFocusable(false);
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jToolBar1.add(Salir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    int toolbarHeight = jToolBar1.getHeight(); // Altura de la barra de herramientas
    if (evt.getY() > toolbarHeight) {    
        if (null != seleccion) // TODO add your handling code here:
            switch (seleccion) {
                case CIRCULOS: {
                    Random rand = new Random();
                    int tamano = rand.nextInt(81) + 20;
                    Graphics gVentana = getGraphics();
                    Graphics gImagen = imagen.getGraphics();
                    gVentana.setColor(colorseleccionado);
                    gImagen.setColor(colorseleccionado);
                    int x = evt.getX() - TAMANO_CIRCULO / 2;
                    int y = evt.getY() - TAMANO_CIRCULO / 2;
                    gVentana.fillOval(x, y, TAMANO_CIRCULO, TAMANO_CIRCULO);
                    gImagen.fillOval(x, y, TAMANO_CIRCULO, TAMANO_CIRCULO);
                    break;
                }
                case PINTAR:
                    if (anterior == null) {
                        anterior = evt.getPoint();
                    } else {
                        Graphics gVentana = getGraphics();
                        Graphics gImagen = imagen.getGraphics();
                        gVentana.setColor(colorseleccionado);
                        gImagen.setColor(colorseleccionado);
                        gVentana.drawLine(anterior.x, anterior.y, evt.getX(), evt.getY());
                        gImagen.drawLine(anterior.x, anterior.y, evt.getX(), evt.getY());

                        anterior = evt.getPoint();

                        gImagen.dispose();
                    }
                    break;
                case BORRAR: {
                    Random rand = new Random();
                    int tamano = rand.nextInt(81) + 20;
                    Graphics gVentana = getGraphics();
                    Graphics gImagen = imagen.getGraphics();
                    gVentana.setColor(Color.WHITE);
                    gImagen.setColor(Color.white);
                    int x = evt.getX() - TAMANO_CIRCULO / 2;
                    int y = evt.getY() - TAMANO_CIRCULO / 2;

                    gVentana.fillOval(x, y, TAMANO_CIRCULO, TAMANO_CIRCULO);
                    gImagen.fillOval(x, y, TAMANO_CIRCULO, TAMANO_CIRCULO);
                    break;
                }
                default:
                    break;
            }
    }
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
    int toolbarHeight = jToolBar1.getHeight(); // Altura de la barra de herramientas
    if (evt.getY() > toolbarHeight) {  
        if (null != seleccion) // TODO add your handling code here:
            switch (seleccion) {
                case CIRCULOS: {
                    Random rand = new Random();
                    int tamano = rand.nextInt(81) + 20;
                    Graphics gVentana = getGraphics();
                    Graphics gImagen = imagen.getGraphics();
                    gVentana.setColor(colorseleccionado);
                    gImagen.setColor(colorseleccionado);
                    int x = evt.getX() - TAMANO_CIRCULO / 2;
                    int y = evt.getY() - TAMANO_CIRCULO / 2;

                    gVentana.fillOval(x, y, TAMANO_CIRCULO, TAMANO_CIRCULO);
                    gImagen.fillOval(x, y, TAMANO_CIRCULO, TAMANO_CIRCULO);
                    break;
                }
                case PINTAR:
                    if (anterior == null) {
                        anterior = evt.getPoint();
                    } else {
                        Graphics gVentana = getGraphics();
                        Graphics gImagen = imagen.getGraphics();
                        gVentana.setColor(colorseleccionado);
                        gImagen.setColor(colorseleccionado);

                        gVentana.drawLine(anterior.x, anterior.y, evt.getX(), evt.getY());
                        gImagen.drawLine(anterior.x, anterior.y, evt.getX(), evt.getY());

                        anterior = evt.getPoint();

                        gImagen.dispose();
                    }
                    break;
                case BORRAR: {
                    Random rand = new Random();
                    int tamano = rand.nextInt(81) + 20;
                    Graphics gVentana = getGraphics();
                    Graphics gImagen = imagen.getGraphics();
                    gVentana.setColor(Color.WHITE);
                    gImagen.setColor(Color.white);
                    int x = evt.getX() - TAMANO_CIRCULO / 2;
                    int y = evt.getY() - TAMANO_CIRCULO / 2;

                    gVentana.fillOval(x, y, TAMANO_CIRCULO, TAMANO_CIRCULO);
                    gImagen.fillOval(x, y, TAMANO_CIRCULO, TAMANO_CIRCULO);
                    break;
                }
                default:
                    break;
            }
    }
    }//GEN-LAST:event_formMouseDragged

    private void PintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PintarActionPerformed
        // TODO add your handling code here:
        seleccion = Opciones.PINTAR;
    }//GEN-LAST:event_PintarActionPerformed

    private void CirculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CirculosActionPerformed
        // TODO add your handling code here:
        seleccion = Opciones.CIRCULOS;
    }//GEN-LAST:event_CirculosActionPerformed

    private void ColorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorrActionPerformed
        // TODO add your handling code here:
        Color opcion = JColorChooser.showDialog(this, "Elige", Color.yellow);
        Graphics gVentana = getGraphics();
        Graphics gImagen = imagen.getGraphics();
        if (opcion != null) {
            colorseleccionado = opcion;
        }
    }//GEN-LAST:event_ColorrActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        imagen = new BufferedImage(getContentPane().getWidth(), getContentPane().getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics gImagen = imagen.getGraphics();
        gImagen.setColor(Color.WHITE);
        gImagen.fillRect(0, 0, imagen.getWidth(), imagen.getHeight());

    }//GEN-LAST:event_formWindowOpened

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this, "¿Desea guardar la imagen ?", "Guardar", JOptionPane.YES_NO_OPTION)) {
            JFileChooser dialogoArch = new JFileChooser();
            if (JFileChooser.APPROVE_OPTION == dialogoArch.showSaveDialog(this)) {
                File arch = dialogoArch.getSelectedFile();
                try {
                    ImageIO.write(imagen, "png", arch);
                } catch (IOException ex) {
                }
            }
        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        imagen = new BufferedImage(getContentPane().getWidth(), getContentPane().getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics gImagen = imagen.getGraphics();
        gImagen.setColor(Color.WHITE);
        gImagen.fillRect(0, 0, imagen.getWidth(), imagen.getHeight());
        repaint();
    }//GEN-LAST:event_ClearActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
        seleccion = Opciones.BORRAR;
    }//GEN-LAST:event_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Paintt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paintt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paintt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paintt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paintt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Circulos;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Colorr;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Pintar;
    private javax.swing.JButton Salir;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
