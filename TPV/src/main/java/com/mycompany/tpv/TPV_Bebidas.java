package com.mycompany.tpv;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

public class TPV_Bebidas extends javax.swing.JDialog {

    static int cantidad;

    /**
     * Creates new form TPV_Bebidas
     */
    Productos bebidaSeleccionada = null;
    Productos bediasIconos;

    public TPV_Bebidas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setupIcons();
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);
        cantidadSpinner.setModel(spinnerModel);
    }

    private void setupIcons() {
        List<String> nombresBebidas = Arrays.asList("cerveza", "vino", "sprite", "tequila", "margarita", "bloody", "mojito", "coke", "water");
        List<ImageIcon> iconosBebidas = new ArrayList<>();
//        System.out.println(Arrays.asList(iconosBebidas).toString()); check de la lista bebidas por si algo falla con los nombrews        
        for (String nombreBebida : nombresBebidas) {
            // Crea la URL de la imagen usando el nombre de la bebida
            java.net.URL urlImagen = getClass().getClassLoader().getResource("images/" + nombreBebida + ".png");
            // Verifica si la URL de la imagen es válida
            if (urlImagen != null) {
                // Crea el icono a partir de la URL de la imagen
                ImageIcon iconoBebida = new ImageIcon(urlImagen);
                iconosBebidas.add(iconoBebida);
            } else {
                // Si la URL de la imagen es nula, puedes manejar el error o mostrar un mensaje
                System.out.println("Error: No se encontró la imagen para la bebida " + nombreBebida);
            }
        }
        List<JToggleButton> botonesBebidas = Arrays.asList(beerButton, wineButton, spriteButton, tequilaButton, margaritaButton, bloodyButton, mojitoButton, cokeButton, waterButton);
        // Verifica que la lista de iconos y la lista de botones tengan la misma longitud
        if (iconosBebidas.size() == botonesBebidas.size()) {
            for (int i = 0; i < iconosBebidas.size(); i++) {
                // Configura el icono para el botón correspondiente
                botonesBebidas.get(i).setIcon(iconosBebidas.get(i));
            }
        } else {
            // Si las listas no tienen la misma longitud, muestra un mensaje de error

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        padrePanel = new javax.swing.JPanel();
        bebidasPanel = new javax.swing.JPanel();
        beerButton = new javax.swing.JToggleButton();
        wineButton = new javax.swing.JToggleButton();
        spriteButton = new javax.swing.JToggleButton();
        tequilaButton = new javax.swing.JToggleButton();
        margaritaButton = new javax.swing.JToggleButton();
        bloodyButton = new javax.swing.JToggleButton();
        mojitoButton = new javax.swing.JToggleButton();
        cokeButton = new javax.swing.JToggleButton();
        waterButton = new javax.swing.JToggleButton();
        cantidadLabel = new javax.swing.JLabel();
        selecLabel = new javax.swing.JLabel();
        escogerLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        cantidadSpinner = new javax.swing.JSpinner();
        precioLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bebidasPanel.setLayout(new java.awt.GridLayout(3, 9, 5, 5));

        beerButton.setText("Cerveza");
        beerButton.setToolTipText("");
        beerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beerButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(beerButton);

        wineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wineButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(wineButton);

        spriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(spriteButton);

        tequilaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tequilaButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(tequilaButton);

        margaritaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                margaritaButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(margaritaButton);

        bloodyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodyButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(bloodyButton);

        mojitoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mojitoButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(mojitoButton);

        cokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(cokeButton);

        waterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterButtonActionPerformed(evt);
            }
        });
        bebidasPanel.add(waterButton);

        cantidadLabel.setText("Cantidad");

        selecLabel.setText("Bedida seleccionada");

        addButton.setText("Añadir");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout padrePanelLayout = new javax.swing.GroupLayout(padrePanel);
        padrePanel.setLayout(padrePanelLayout);
        padrePanelLayout.setHorizontalGroup(
            padrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(padrePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bebidasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(padrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(padrePanelLayout.createSequentialGroup()
                        .addGroup(padrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecLabel)
                            .addGroup(padrePanelLayout.createSequentialGroup()
                                .addComponent(cantidadLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(padrePanelLayout.createSequentialGroup()
                                .addComponent(escogerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        padrePanelLayout.setVerticalGroup(
            padrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(padrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(padrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bebidasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(padrePanelLayout.createSequentialGroup()
                        .addComponent(selecLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(padrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(padrePanelLayout.createSequentialGroup()
                                .addComponent(escogerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(padrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cantidadLabel)
                                    .addComponent(cantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton))
                            .addComponent(precioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(padrePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(padrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void beerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beerButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_beerButtonActionPerformed

    private void wineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wineButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_wineButtonActionPerformed

    private void spriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_spriteButtonActionPerformed

    private void tequilaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tequilaButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_tequilaButtonActionPerformed

    private void margaritaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_margaritaButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_margaritaButtonActionPerformed

    private void bloodyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodyButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_bloodyButtonActionPerformed

    private void mojitoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mojitoButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_mojitoButtonActionPerformed

    private void cokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_cokeButtonActionPerformed

    private void waterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterButtonActionPerformed
        verificadorBebidas(evt);
    }//GEN-LAST:event_waterButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (bebidaSeleccionada != null && (int) cantidadSpinner.getValue() >= 1) {
            int cantidad = (int) cantidadSpinner.getValue();
            String nombreBebida = bebidaSeleccionada.getNombre();
            double precioBebida = bebidaSeleccionada.getPrecio();
            double precioTotal = precioBebida * cantidad;
            escogerLabel.setText("");
            precioLabel.setText("");
            cantidadSpinner.setValue(0);
            // Llamar al método en el JFrame para agregar los datos a la tabla
            TPVFrame framePrincipal = (TPVFrame) SwingUtilities.getWindowAncestor(this);
            framePrincipal.agregarBebida(bebidaSeleccionada, cantidad, precioTotal);

            // Cerrar el JDialog después de agregar los datos
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una bebida y una cantidad válida.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        escogerLabel.setText("");
        precioLabel.setText("");
        cantidadSpinner.setValue(0);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TPV_Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPV_Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPV_Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPV_Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TPV_Bebidas dialog = new TPV_Bebidas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bebidasPanel;
    private javax.swing.JToggleButton beerButton;
    private javax.swing.JToggleButton bloodyButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JSpinner cantidadSpinner;
    private javax.swing.JToggleButton cokeButton;
    private javax.swing.JLabel escogerLabel;
    private javax.swing.JToggleButton margaritaButton;
    private javax.swing.JToggleButton mojitoButton;
    private javax.swing.JPanel padrePanel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JLabel selecLabel;
    private javax.swing.JToggleButton spriteButton;
    private javax.swing.JToggleButton tequilaButton;
    private javax.swing.JToggleButton waterButton;
    private javax.swing.JToggleButton wineButton;
    // End of variables declaration//GEN-END:variables

    Productos getBebidaSeleccionada() {
        return bebidaSeleccionada;
    }

    Productos setBebidaSeleccionada(Productos bebidaSelecionada) {
        return bebidaSeleccionada;
    }

    int getCantidad() {
        return cantidad;
    }

    public void verificadorBebidas(ActionEvent evt) {
        JToggleButton button = (JToggleButton) evt.getSource();
        if (button == beerButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(0); // Esto es solo un ejemplo, ajusta según tu lógica
        } else if (button == wineButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(1); // Ajusta según tu lógica
        } else if (button == spriteButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(2); // Ajusta según tu lógica
        } else if (button == tequilaButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(3); // Ajusta según tu lógica
        } else if (button == margaritaButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(4); // Ajusta según tu lógica
        } else if (button == this.bloodyButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(5); // Ajusta según tu lógica
        } else if (button == this.mojitoButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(6); // Ajusta según tu lógica
        } else if (button == this.cokeButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(7); // Ajusta según tu lógica
        } else if (button == this.waterButton) {
            bebidaSeleccionada = Productos.BEBIDAS.get(8); // Ajusta según tu lógica
        }
        escogerLabel.setText(bebidaSeleccionada.nombreProducto);
        precioLabel.setText(bebidaSeleccionada.precio + " euros");
        deselectedAllButtons();
        if (bebidaSeleccionada != null) {
            cancelButton.setText("Cancelar");
        } else {
            cancelButton.setText("Volver");
        }
    }

    private void deselectedAllButtons() {
        this.beerButton.setSelected(false);
        this.wineButton.setSelected(false);
        this.spriteButton.setSelected(false);
        this.tequilaButton.setSelected(false);
        this.bloodyButton.setSelected(false);
        this.mojitoButton.setSelected(false);
        this.cokeButton.setSelected(false);
        this.waterButton.setSelected(false);
    }
}
