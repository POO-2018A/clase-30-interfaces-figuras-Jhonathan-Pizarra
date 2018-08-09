package figuras;


import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;


public class GUIImplements extends javax.swing.JFrame {

   
    /**
     * Creates new form GUIImplements
     */
    
    ArrayList<Figuras> listaFiguras = new ArrayList();
    DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
    
    
    public GUIImplements() {
        initComponents();
        //Area triangulo: Bse*altura / 2
        //aREA CUADRADO: LADO*LADO
        //Area circulo: Pi*r*r
        //Area rectangulo: base*altura
        
       
        modeloComboBox.addElement("Cuadrado");
        modeloComboBox.addElement("Circulo");
        modeloComboBox.addElement("Triangulo");
        modeloComboBox.addElement("Rectangulo");
        comboBoxFigura.setModel(modeloComboBox);
        //ponerFondo();
        noPaneles();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFigura = new javax.swing.JLabel();
        comboBoxFigura = new javax.swing.JComboBox<String>();
        panelCuadrado = new javax.swing.JPanel();
        textCuadrado = new javax.swing.JTextField();
        labelLado = new javax.swing.JLabel();
        panelTriangulo = new javax.swing.JPanel();
        labelBaseTriangulo = new javax.swing.JLabel();
        labelAlturaTriangulo = new javax.swing.JLabel();
        textBaseTriangulo = new javax.swing.JTextField();
        textAlturaTriangulo = new javax.swing.JTextField();
        panelCirculo = new javax.swing.JPanel();
        labelRadio = new javax.swing.JLabel();
        textRadio = new javax.swing.JTextField();
        panelRectangulo = new javax.swing.JPanel();
        labelBaseRectangulo = new javax.swing.JLabel();
        labelAlturaRectangulo = new javax.swing.JLabel();
        textBaseRectangulo = new javax.swing.JTextField();
        textAlturaRectangulo = new javax.swing.JTextField();
        labelArea = new javax.swing.JLabel();
        textRespuesta = new javax.swing.JTextField();
        buttonCalcular = new javax.swing.JButton();
        labelPerimetro = new javax.swing.JLabel();
        textRespuesta2 = new javax.swing.JTextField();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFigura.setText("Elije una figura:");
        getContentPane().add(labelFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        comboBoxFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFiguraActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxFigura, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 42, 120, -1));

        panelCuadrado.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel-Cuadrado"));
        panelCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        panelCuadrado.setMinimumSize(new java.awt.Dimension(0, 0));

        labelLado.setText("Lado:");

        javax.swing.GroupLayout panelCuadradoLayout = new javax.swing.GroupLayout(panelCuadrado);
        panelCuadrado.setLayout(panelCuadradoLayout);
        panelCuadradoLayout.setHorizontalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadradoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(labelLado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelCuadradoLayout.setVerticalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 136, -1, 157));

        panelTriangulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel-Triangulo"));
        panelTriangulo.setMinimumSize(new java.awt.Dimension(100, 100));
        panelTriangulo.setPreferredSize(new java.awt.Dimension(134, 157));

        labelBaseTriangulo.setText("Base:");

        labelAlturaTriangulo.setText("Altura:");

        javax.swing.GroupLayout panelTrianguloLayout = new javax.swing.GroupLayout(panelTriangulo);
        panelTriangulo.setLayout(panelTrianguloLayout);
        panelTrianguloLayout.setHorizontalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlturaTriangulo)
                    .addComponent(labelBaseTriangulo))
                .addGap(18, 18, 18)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelTrianguloLayout.setVerticalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBaseTriangulo)
                    .addComponent(textBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlturaTriangulo)
                    .addComponent(textAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(panelTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 136, -1, -1));

        panelCirculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel-Circulo"));
        panelCirculo.setMinimumSize(new java.awt.Dimension(100, 100));
        panelCirculo.setPreferredSize(new java.awt.Dimension(134, 157));

        labelRadio.setText("Radio:");

        javax.swing.GroupLayout panelCirculoLayout = new javax.swing.GroupLayout(panelCirculo);
        panelCirculo.setLayout(panelCirculoLayout);
        panelCirculoLayout.setHorizontalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(textRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCirculoLayout.setVerticalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRadio)
                    .addComponent(textRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 136, -1, -1));

        panelRectangulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel-Rectangulo"));
        panelRectangulo.setMinimumSize(new java.awt.Dimension(100, 100));
        panelRectangulo.setPreferredSize(new java.awt.Dimension(134, 157));

        labelBaseRectangulo.setText("Base:");

        labelAlturaRectangulo.setText("Altura:");

        javax.swing.GroupLayout panelRectanguloLayout = new javax.swing.GroupLayout(panelRectangulo);
        panelRectangulo.setLayout(panelRectanguloLayout);
        panelRectanguloLayout.setHorizontalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addComponent(labelBaseRectangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textBaseRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addComponent(labelAlturaRectangulo)
                        .addGap(18, 18, 18)
                        .addComponent(textAlturaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRectanguloLayout.setVerticalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBaseRectangulo)
                    .addComponent(textBaseRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlturaRectangulo)
                    .addComponent(textAlturaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 136, -1, -1));

        labelArea.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        labelArea.setText("Area:");
        getContentPane().add(labelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));
        getContentPane().add(textRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 353, 100, -1));

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 41, -1, -1));

        labelPerimetro.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        labelPerimetro.setText("Perímetro:");
        getContentPane().add(labelPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));
        getContentPane().add(textRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 353, 100, -1));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        // TODO add your handling code here:
        
        String itemSeleccionado = (String) comboBoxFigura.getSelectedItem();
       
        if(itemSeleccionado.equals("Cuadrado")){
        
            String lado1 = textCuadrado.getText();
            
            double lado1ToDouble = Double.parseDouble(lado1);
           
            
            Figuras f = new Cuadrado(lado1ToDouble); //Para calcilar Area
           
            f.calcularArea();
            f.calcularPerimetro();
            
            textRespuesta.setText(f.calcularArea()+" ");
            textRespuesta2.setText(f.calcularPerimetro()+" ");
            
            
        }else if(itemSeleccionado.equals("Circulo")){
    
            String lado1 = textRadio.getText();
            
            double lado1ToDouble = Double.parseDouble(lado1);
            
            Figuras f = new Circulo(lado1ToDouble); //Para calcilar Area
           
            f.calcularArea();
            f.calcularPerimetro();
            
            textRespuesta.setText(f.calcularArea()+" ");
            textRespuesta2.setText(f.calcularPerimetro()+" ");
     
        }else if(itemSeleccionado.equals("Triangulo")){
    
            String lado1 = textAlturaTriangulo.getText();
            String lado2 = textBaseTriangulo.getText();
            
            double lado1ToDouble = Double.parseDouble(lado1);
            double lado2ToDouble = Double.parseDouble(lado2);
            
            Figuras f = new Triangulo(lado1ToDouble,lado2ToDouble); //Para calcilar Area
            Figuras f2 = new Triangulo(lado1ToDouble,lado2ToDouble,4.0); //Para calcular Perímetro
            
            f.calcularArea();
            f2.calcularPerimetro();
            
            textRespuesta.setText(f.calcularArea()+" ");
            textRespuesta2.setText(f2.calcularPerimetro()+" ");
            
       
     
        }else if(itemSeleccionado.equals("Rectangulo")){
    
            String lado1 = textAlturaRectangulo.getText();
            String lado2 = textBaseRectangulo.getText();
            
            double lado1ToDouble = Double.parseDouble(lado1);
            double lado2ToDouble = Double.parseDouble(lado2);
            
            Figuras f = new Rectangulo(lado1ToDouble,lado2ToDouble); //Para calcilar Area
           
            f.calcularArea();
            f.calcularPerimetro();
            
            textRespuesta.setText(f.calcularArea()+" ");
            textRespuesta2.setText(f.calcularPerimetro()+" ");
     
        }
        
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void comboBoxFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFiguraActionPerformed
        // TODO add your handling code here
        
        String itemSeleccionado = (String) comboBoxFigura.getSelectedItem();
        noPaneles();
       
        if(itemSeleccionado.equals("Cuadrado")){
           
            panelCuadrado();
            
        }else if(itemSeleccionado.equals("Circulo")){
    
             panelCirculo();
         
        }else if(itemSeleccionado.equals("Triangulo")){
    
            panelTriangulo();
         
          
        }else if(itemSeleccionado.equals("Rectangulo")){
    
           panelRectangulo();
        }
      
        buttonCalcular.setEnabled(true);
    }//GEN-LAST:event_comboBoxFiguraActionPerformed

    public void noPaneles(){
    
        //Etiquetas:
        labelAlturaRectangulo.setEnabled(false);
        labelBaseRectangulo.setEnabled(false);
        labelBaseTriangulo.setEnabled(false);
        labelAlturaTriangulo.setEnabled(false);
        labelLado.setEnabled(false);
        labelRadio.setEnabled(false);
                
    
        //Text-Areas:
        textBaseTriangulo.setEnabled(false);
        textAlturaTriangulo.setEnabled(false);
        textBaseRectangulo.setEnabled(false);
        textAlturaRectangulo.setEnabled(false);
        textCuadrado.setEnabled(false);
        textRadio.setEnabled(false);
       
        //Paneles
        panelTriangulo.setEnabled(false);
        panelCirculo.setEnabled(false);
        panelRectangulo.setEnabled(false);
        panelCuadrado.setEnabled(false);
        
        
        //Labels extras
        labelArea.setEnabled(false);
        labelPerimetro.setEnabled(false);
        textRespuesta.setEnabled(false);
        textRespuesta2.setEnabled(false);
        
        //Bton
        buttonCalcular.setEnabled(false);
        
        
    }
    
    private void ponerFondo(){
        
        //Imagen de fondo para las pestañas (4 pestañas en total) por eso tendrá 4 imganees y 4 fondos diferentes en este caso..
        ImageIcon imagenFondo01, fondo01;
       
    
        //Fondo Pestaña Materias:
        imagenFondo01 = new ImageIcon(getClass().getResource("/imagenes/Pingunos.jpg"));
        fondo01 = new ImageIcon(imagenFondo01.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(fondo01);
     
    }
    
    public void panelTriangulo(){
    
        panelTriangulo.setEnabled(true);
        labelAlturaTriangulo.setEnabled(true);
        labelBaseTriangulo.setEnabled(true);
        textAlturaTriangulo.setEnabled(true);
        textBaseTriangulo.setEnabled(true);
    
       labelArea.setEnabled(true);
       labelPerimetro.setEnabled(true);
    }
    
    public void panelCuadrado(){
    
    
        panelCuadrado.setEnabled(true);
        labelLado.setEnabled(true);
        textCuadrado.setEnabled(true);
        labelArea.setEnabled(true);
        labelPerimetro.setEnabled(true);
    
    }
    
    public void panelCirculo(){
    
        panelCirculo.setEnabled(true);
        labelRadio.setEnabled(true);
        textRadio.setEnabled(true);
        labelArea.setEnabled(true);
        labelPerimetro.setEnabled(true);
       
    }
    
    public void panelRectangulo(){
    
        panelRectangulo.setEnabled(true);
        labelBaseRectangulo.setEnabled(true);
        labelAlturaRectangulo.setEnabled(true);
        labelArea.setEnabled(true);
        labelPerimetro.setEnabled(true);
        textBaseRectangulo.setEnabled(true);
        textAlturaRectangulo.setEnabled(true);
    
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
            java.util.logging.Logger.getLogger(GUIImplements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIImplements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIImplements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIImplements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIImplements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JComboBox<String> comboBoxFigura;
    private javax.swing.JLabel labelAlturaRectangulo;
    private javax.swing.JLabel labelAlturaTriangulo;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelBaseRectangulo;
    private javax.swing.JLabel labelBaseTriangulo;
    private javax.swing.JLabel labelFigura;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLado;
    private javax.swing.JLabel labelPerimetro;
    private javax.swing.JLabel labelRadio;
    private javax.swing.JPanel panelCirculo;
    private javax.swing.JPanel panelCuadrado;
    private javax.swing.JPanel panelRectangulo;
    private javax.swing.JPanel panelTriangulo;
    private javax.swing.JTextField textAlturaRectangulo;
    private javax.swing.JTextField textAlturaTriangulo;
    private javax.swing.JTextField textBaseRectangulo;
    private javax.swing.JTextField textBaseTriangulo;
    private javax.swing.JTextField textCuadrado;
    private javax.swing.JTextField textRadio;
    private javax.swing.JTextField textRespuesta;
    private javax.swing.JTextField textRespuesta2;
    // End of variables declaration//GEN-END:variables
}
