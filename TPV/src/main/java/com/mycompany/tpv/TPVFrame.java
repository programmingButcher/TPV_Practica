package com.mycompany.tpv;

import java.awt.CardLayout;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juand
 */
public class TPVFrame extends javax.swing.JFrame {
//String indoorImagePath = "..\\src\\main\\resources\\images\\cena.png";
//String outdoorImagePath = "..\\src\\main\\resources\\images\\terraza.png";
//
//java.net.URL indoorImageUrl = getClass().getClassLoader().getResource(indoorImagePath);
//java.net.URL outdoorImageUrl = getClass().getClassLoader().getResource(outdoorImagePath);
//
//ImageIcon indoorIcon = new ImageIcon(indoorImageUrl);
//ImageIcon outdoorIcon = new ImageIcon(outdoorImageUrl);

    private CardLayout cardLayout;
    TPV_Bebidas bebidas = new TPV_Bebidas(this, true);
    private javax.swing.JToggleButton mesaSeleccionadaButton;
    private Map<javax.swing.JToggleButton, DefaultTableModel> buttonToTableModelMap;
    javax.swing.JToggleButton agregarBebidaButton;
    java.net.URL cena = getClass().getClassLoader().getResource("images/cena.png");
    java.net.URL terraza = getClass().getClassLoader().getResource("images/terraza.png");
    public TPVFrame() {
        initComponents();
        setupUI(); //inicializa el layaout
        setupIcons();
        setupButtonMap(); // Inicializa buttonToTableModelMap
        setButtonNames();// le da un nombre a los botones de referencia
        bebidas = new TPV_Bebidas(this, true);
    }

    private void setupUI() {
        cardLayout = new CardLayout();
        panelPadre.setLayout(cardLayout);
        panelPadre.add(TablesPanel, "TablesPanel");
        panelPadre.add(datosPanel, "datosPanel");
    }

    private void setupIcons() {
// seteo de iconos para los botones de las mesas interiores y de terraza
        ImageIcon iconCena = new ImageIcon(cena);
        ImageIcon iconTerraza = new ImageIcon(terraza);
        indoorButton.setIcon(iconCena);
        indoorButton1.setIcon(iconCena);
        indoorButton2.setIcon(iconCena);
        outdoorButton.setIcon(iconTerraza);
        outdoorButton1.setIcon(iconTerraza);
        outdoorButton2.setIcon(iconTerraza);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPadre = new javax.swing.JPanel();
        datosPanel = new javax.swing.JPanel();
        tablaComanda = new javax.swing.JScrollPane();
        datosTabla = new javax.swing.JTable();
        añadirButton = new javax.swing.JButton();
        volverButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        mesaElegida = new javax.swing.JLabel();
        TablesPanel = new javax.swing.JPanel();
        indoorButton = new javax.swing.JToggleButton();
        indoorButton1 = new javax.swing.JToggleButton();
        indoorButton2 = new javax.swing.JToggleButton();
        outdoorButton = new javax.swing.JToggleButton();
        outdoorButton1 = new javax.swing.JToggleButton();
        outdoorButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPadre.setLayout(new java.awt.CardLayout());

        datosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaComanda.setViewportView(datosTabla);

        añadirButton.setText("Añadir");
        añadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirButtonActionPerformed(evt);
            }
        });

        volverButton.setText("Volver");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Mesa");

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        mesaElegida.setText("jLabel2");

        javax.swing.GroupLayout datosPanelLayout = new javax.swing.GroupLayout(datosPanel);
        datosPanel.setLayout(datosPanelLayout);
        datosPanelLayout.setHorizontalGroup(
            datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPanelLayout.createSequentialGroup()
                        .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(añadirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(volverButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPanelLayout.createSequentialGroup()
                        .addComponent(mesaElegida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        datosPanelLayout.setVerticalGroup(
            datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPanelLayout.createSequentialGroup()
                        .addComponent(tablaComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(datosPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesaElegida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(añadirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        panelPadre.add(datosPanel, "card2");

        TablesPanel.setLayout(new java.awt.GridLayout(2, 3));

        indoorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        indoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indoorButtonActionPerformed(evt);
            }
        });
        TablesPanel.add(indoorButton);

        indoorButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        indoorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indoorButton1ActionPerformed(evt);
            }
        });
        TablesPanel.add(indoorButton1);

        indoorButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indoorButton2ActionPerformed(evt);
            }
        });
        TablesPanel.add(indoorButton2);

        outdoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outdoorButtonActionPerformed(evt);
            }
        });
        TablesPanel.add(outdoorButton);

        outdoorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outdoorButton1ActionPerformed(evt);
            }
        });
        TablesPanel.add(outdoorButton1);

        outdoorButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outdoorButton2ActionPerformed(evt);
            }
        });
        TablesPanel.add(outdoorButton2);

        panelPadre.add(TablesPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirButtonActionPerformed
        System.out.println(mesaSeleccionadaButton.getText());
        if (mesaSeleccionadaButton != null) {
            bebidas.setVisible(true);
            Productos bebidaSeleccionada = bebidas.getBebidaSeleccionada();
            int cantidad = bebidas.getCantidad();
            double precioTotal = cantidad * bebidaSeleccionada.getPrecio();
            // Agrega la fila a la tabla del modelo correspondiente a la mesa seleccionada
            Object[] fila = {bebidaSeleccionada.nombreProducto, cantidad, bebidaSeleccionada.getPrecio(), precioTotal};
            
        } else {
            // Indica al usuario que debe seleccionar una mesa antes de agregar productos
            // (puedes mostrar un mensaje de error, una ventana emergente, etc.)
            System.out.println("Por favor, seleccione una mesa antes de agregar productos.");
        }
    }//GEN-LAST:event_añadirButtonActionPerformed

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        deselectedAllButtons(); // Deselecciona todos los botones
        cardLayout.previous(panelPadre);
        // Cambiar el foco a otro componente que no sea un botón
        panelPadre.requestFocusInWindow(); // Cambia el foco al panel principal
    }//GEN-LAST:event_volverButtonActionPerformed

    private void indoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indoorButtonActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        handleButtonSelection(button.getName());
    }//GEN-LAST:event_indoorButtonActionPerformed

    private void indoorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indoorButton1ActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        handleButtonSelection(button.getName());
    }//GEN-LAST:event_indoorButton1ActionPerformed

    private void indoorButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indoorButton2ActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        handleButtonSelection(button.getName());
    }//GEN-LAST:event_indoorButton2ActionPerformed

    private void outdoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outdoorButtonActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        handleButtonSelection(button.getName());
    }//GEN-LAST:event_outdoorButtonActionPerformed

    private void outdoorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outdoorButton1ActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        handleButtonSelection(button.getName());
    }//GEN-LAST:event_outdoorButton1ActionPerformed

    private void outdoorButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outdoorButton2ActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        handleButtonSelection(button.getName());
    }//GEN-LAST:event_outdoorButton2ActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // Obtén el modelo de la tabla actual
    DefaultTableModel modeloTabla = (DefaultTableModel) datosTabla.getModel();
    
    // Limpia la tabla eliminando todas las filas
    modeloTabla.setRowCount(0);
    
    // Muestra un mensaje indicando que se canceló satisfactoriamente
    JOptionPane.showMessageDialog(this, "La operación se canceló satisfactoriamente.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
    deselectedAllButtons(); // Deselecciona todos los botones
    cardLayout.previous(panelPadre);
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
            java.util.logging.Logger.getLogger(TPVFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPVFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPVFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPVFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TPVFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TablesPanel;
    private javax.swing.JButton añadirButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel datosPanel;
    private javax.swing.JTable datosTabla;
    private javax.swing.JToggleButton indoorButton;
    private javax.swing.JToggleButton indoorButton1;
    private javax.swing.JToggleButton indoorButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mesaElegida;
    private javax.swing.JToggleButton outdoorButton;
    private javax.swing.JToggleButton outdoorButton1;
    private javax.swing.JToggleButton outdoorButton2;
    private javax.swing.JPanel panelPadre;
    private javax.swing.JScrollPane tablaComanda;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
public void abrirComanda() {
        cardLayout.next(panelPadre);
    }

    private void setupButtonMap() {
        buttonToTableModelMap = new HashMap<>();
        DefaultTableModel indoorTableModel = createTableModel();
        DefaultTableModel indoorTableModel1 = createTableModel();
        DefaultTableModel indoorTableModel2 = createTableModel();
        DefaultTableModel outdoorTableModel = createTableModel();
        DefaultTableModel outdoorTableModel1 = createTableModel();
        DefaultTableModel outdoorTableModel2 = createTableModel();

        // Asocia cada botón de mesa con su modelo de tabla correspondiente en el mapa
        buttonToTableModelMap.put(indoorButton, indoorTableModel);
        buttonToTableModelMap.put(indoorButton1, indoorTableModel1);
        buttonToTableModelMap.put(indoorButton2, indoorTableModel2);
        buttonToTableModelMap.put(outdoorButton, outdoorTableModel);
        buttonToTableModelMap.put(outdoorButton1, outdoorTableModel1);
        buttonToTableModelMap.put(outdoorButton2, outdoorTableModel2);
    }

    private void deselectedAllButtons() {
        indoorButton.setSelected(false);
        indoorButton1.setSelected(false);
        indoorButton2.setSelected(false);
        outdoorButton.setSelected(false);
        outdoorButton1.setSelected(false);
        outdoorButton2.setSelected(false);
        // Cambiar el foco al panel principal para evitar el oscurecimiento de los botones
        panelPadre.requestFocusInWindow();
    }

    public void agregarBebida(Productos bebida, int cantidad, double precioTotal) {
        javax.swing.JToggleButton button = agregarBebidaButton;
        DefaultTableModel modeloTabla = buttonToTableModelMap.get(button);
        // Crea un nuevo objeto Object[] para representar la fila de la tabla
        Object[] fila = {bebida.nombreProducto, cantidad, bebida.getPrecio(), precioTotal};
        // Agrega la fila al modelo de la tabla
        modeloTabla.addRow(fila);
    }

    private void handleButtonSelection(String nombreMesa) {
        System.out.println("Botón: " + nombreMesa);

        // Verifica si el nombre de la mesa no es nulo o vacío
        System.out.println("Botón: " + nombreMesa);

        // Verifica si el nombre de la mesa no es nulo o vacío
        if (nombreMesa != null && !nombreMesa.isEmpty()) {
            // Encuentra el botón correspondiente al nombre de la mesa
            javax.swing.JToggleButton button = null;
            switch (nombreMesa) {
                case "indoorButton":
                    button = indoorButton;
                    break;
                case "indoorButton1":
                    button = indoorButton1;
                    break;
                case "indoorButton2":
                    button = indoorButton2;
                    break;
                case "outdoorButton":
                    button = outdoorButton;
                    break;
                case "outdoorButton1":
                    button = outdoorButton1;
                    break;
                case "outdoorButton2":
                    button = outdoorButton2;
                    break;
                default:
                    break;
            }

            // Verifica si se encontró el botón y actualiza la interfaz gráfica
            if (button != null) {
                DefaultTableModel modeloTabla = buttonToTableModelMap.get(button);
                datosTabla.setModel(modeloTabla);
                cardLayout.show(panelPadre, "datosPanel");

                // Actualiza la etiqueta con el nombre de la mesa seleccionada
                mesaElegida.setText(nombreMesa);
                mesaSeleccionadaButton = button;
                agregarBebidaButton = button;
            } else {
                // En caso de que no se encuentre el botón correspondiente al nombre
                System.out.println("Botón no encontrado para el nombre: " + nombreMesa);
            }
        } else {
            // Limpia el modelo de tabla cuando no se selecciona ninguna mesa
            DefaultTableModel modeloTabla = new DefaultTableModel();
            datosTabla.setModel(modeloTabla);
            cardLayout.show(panelPadre, "TablesPanel");

            // Limpia la etiqueta de la mesa seleccionada
            mesaElegida.setText("");
            mesaSeleccionadaButton = null;
            agregarBebidaButton = null;
        }
    }

    private void setButtonNames() {
        indoorButton.setName("indoorButton");
        indoorButton1.setName("indoorButton1");
        indoorButton2.setName("indoorButton2");
        outdoorButton.setName("outdoorButton");
        outdoorButton1.setName("outdoorButton1");
        outdoorButton2.setName("outdoorButton2");
    }

    private DefaultTableModel createTableModel() {
        ArrayList<String> columnNames = new ArrayList<>();
        columnNames.add("Nombre");
        columnNames.add("Cantidad");
        columnNames.add("Precio");
        columnNames.add("Precio Total");
        DefaultTableModel modeloTabla = new DefaultTableModel();
        for (String columnName : columnNames) {
            modeloTabla.addColumn(columnName);
        }
        return modeloTabla;
    }
}
