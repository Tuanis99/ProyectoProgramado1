package progra1final;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisg
 */
public class Ff_consultarSorteo extends javax.swing.JFrame {

    /**
     * Creates new form Ff_consultaTiquetes
     */
    public Ff_consultarSorteo() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CodigoSorteoConsul = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consulta de Sorteos");

        jLabel2.setText("Ingrese el codigo del Sorteo");

        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CodigoSorteoConsul, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel2)))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(CodigoSorteoConsul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                //Busca si el dato ingresado coincide con el nombre de una libreria existente
        int entrada;
        entrada = Integer.parseInt(Ff_consultarSorteo.CodigoSorteoConsul.getText());
        A_InicioPrograma.JPSDATA.goToStart();
        A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
        boolean encontrado;
        encontrado=false;
                
        while (A_InicioPrograma.JPSDATA.current!=null){
                if (A_InicioPrograma.JPSDATA.current.getElement().codigo == entrada){
                encontrado =true;
                break;
            }
            A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
        }
        if(encontrado==false){  
            JOptionPane.showMessageDialog(null,"La sorteo no existe", "No existe Sorteo",JOptionPane.PLAIN_MESSAGE);
        } 
        else{
            this.dispose();
            //Nueva ventana
            Ff_BusquedaSorteo sorteoencontrado = new Ff_BusquedaSorteo(entrada);
            sorteoencontrado.setTitle("Ventana Sorteo");
            sorteoencontrado.setVisible(true);
            sorteoencontrado.setLocationRelativeTo(null);
            sorteoencontrado.setDefaultCloseOperation(Ff_BusquedaSorteo.HIDE_ON_CLOSE);
           //Valores de la libreria
            Ff_BusquedaSorteo.ResultadoNSorteo.setText(A_InicioPrograma.JPSDATA.current.element.nombreSorteo);
            Ff_BusquedaSorteo.ResultadoTSorteo.setText(A_InicioPrograma.JPSDATA.current.element.tipoSorteo);
            Ff_BusquedaSorteo.ResultadoESorteo.setText(Integer.toString(A_InicioPrograma.JPSDATA.current.element.emisiones));
            Ff_BusquedaSorteo.ResultadoFSorteo.setText(A_InicioPrograma.JPSDATA.current.element.fechaSorteo.toString());
            Ff_BusquedaSorteo.ResultadoCSorteo.setText(Integer.toString(A_InicioPrograma.JPSDATA.current.element.codigo));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ff_consultarSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ff_consultarSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ff_consultarSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ff_consultarSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ff_consultarSorteo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField CodigoSorteoConsul;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}