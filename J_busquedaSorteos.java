/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1final;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.util.Date;
/**
 *
 * @author Orlando
 */
public class J_busquedaSorteos extends javax.swing.JFrame {

    /**
     * Creates new form busquedaSorteos
     */
    public J_busquedaSorteos() {
        initComponents();
        pTipo.removeAllItems();
        pTipo.addItem("");
        pTipo.addItem("Loteria");
        pTipo.addItem("Lotto");
        pTipo.addItem("Bingo");
        pTipo.addItem("Tiempos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pNombre = new javax.swing.JTextField();
        pTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        pFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pMenor = new javax.swing.JTextField();
        pMayor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Búsqueda de sorteos");

        jLabel2.setText("Nombre del Sorteo");

        jLabel3.setText("Tipo de Sorteo");

        pTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Fecha del Sorteo");

        jLabel5.setText("Rangos de Precio");

        jLabel6.setText("-");

        Busqueda.setText("REALIZAR BUSQUEDA");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Busqueda)
                                .addGap(130, 130, 130))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Busqueda)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(pMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
        jTable1.setDefaultRenderer(Object.class, new Jj_Render());
        jTable1.setRowHeight(30);
        //Se crean las botones
        JButton btn1 = new JButton("Detalles");
        btn1.setName("Detalles");
        JButton btn2 = new JButton("Pedido");
        btn2.setName("Pedido");
        
        DefaultTableModel modelo =  new DefaultTableModel
        (){//Para que las celdas no sean editables
         @Override
           public boolean isCellEditable(int row,int column){
               return false;
        }
        };
        //Encabezados
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
        modelo.addColumn("Ver detalles");
        modelo.addColumn("Realizar pedido");
                               
        this.jTable1.setModel(modelo);
        //Para agregar datos en la fila
        Object O[]=null;
        //Numero de fila
        int contador =0;
        //Si no se ingresan datos
        if (pNombre.getText().isEmpty() && pTipo.getSelectedItem().toString().isEmpty() &&  pFecha.getDate()==null &&  pMenor.getText().isEmpty() && pMayor.getText().isEmpty()){
            System.out.println("Entra");
            JOptionPane.showMessageDialog(null, "Por favor ingresar datos", "Informacion",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            // Nombre
            if (!" ".equals(pNombre.getText()) && pTipo.getSelectedItem().toString().isEmpty() && pFecha.getDate()== null && pMenor.getText().isEmpty() && pMayor.getText().isEmpty()){
                System.out.println("Entra");
                A_InicioPrograma.JPSDATA.goToStart();
                System.out.println("Principio dela lista");
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                System.out.println("Current siguiente");
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    System.out.println("Entra al wail");
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre.getText())){
                        System.out.println("Encuentra el nombre");
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
                    
            //Busqueda por Tipo de sorteo
            else if (!" ".equals(pTipo.getSelectedItem().toString()) && pNombre.getText().isEmpty() && pFecha.getDate()==null && pMenor.getText().isEmpty() && pMayor.getText().isEmpty()){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().tipoSorteo.equals(pTipo.getSelectedItem().toString())){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Busqueda por fecha del sorteo
            else if (pFecha.getDate()!=null && pNombre.getText().isEmpty() && pTipo.getSelectedItem().toString().isEmpty() && pMenor.getText().isEmpty() && pMayor.getText().isEmpty()){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.equals(pFecha.getDate())){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
//            //Busqueda por rango de precios
//            else if (pTipo.getSelectedItem().toString().isEmpty() && pNombre.getText().isEmpty() && pFecha.getDate()==null && !" ".equals(pMenor.getText()) && !" ".equals(pMayor.getText())){
//                A_InicioPrograma.JPSDATA.goToStart();
//                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
//                //Recorre la JPSDATA
//                while (A_InicioPrograma.JPSDATA.current != null){
//                    //Busca el tiquete
//                    if (A_InicioPrograma.JPSDATA.current.getElement().tipoSorteo.equals(pTipo)){
//                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
//                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
//                        
//                        modelo.addRow(O);
//                        modelo.setValueAt(DatoNombre, contador, 0);
//                        modelo.setValueAt(DatoFecha, contador, 1);
//                        modelo.setValueAt(btn1, contador, 2);
//                        modelo.setValueAt(btn2, contador, 3);
//                        
//                        contador = contador + 1;
//                    }
//                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
//                }
//            }
            //Busqueda por Tipo de sorteo y nombre
            else if (!" ".equals(pTipo.getSelectedItem().toString()) && !" ".equals(pNombre.getText()) && pFecha.getDate()==null && pMenor.getText().isEmpty() && pMayor.getText().isEmpty()){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().tipoSorteo.equals(pTipo.getSelectedItem().toString()) && A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre.getText())){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Fecha y Nombre
            else if (!" ".equals(pNombre.getText()) && pTipo.getSelectedItem().toString().isEmpty() && pFecha.getDate()!=null && pMenor.getText().isEmpty() && pMayor.getText().isEmpty()){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre.getText()) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha.getDate())){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Nombre y Rango
            else if (!"".equals(pNombre.getText()) && pTipo.getSelectedItem().toString().isEmpty() && pFecha.getDate() == null && !"".equals(pMenor.getText()) && !"".equals(pMayor.getText())){
                                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Tipo y Fecha
            else if (pNombre.getText().isEmpty() && !" ".equals(pTipo.getSelectedItem().toString()) && pFecha.getDate()!=null && pMenor.getText().isEmpty() && pMayor.getText().isEmpty()){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            // Tipo y Rango
            else if (pNombre.getText().isEmpty() && !" ".equals(pTipo.getSelectedItem().toString()) && pFecha.getDate()==null && !" ".equals(pMenor.getText()) && !" ".equals(pMayor.getText())){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Fecha y Rango
            else if (pNombre.getText().isEmpty() && pTipo.getSelectedItem().toString().isEmpty() && pFecha.getDate()!=null && !" ".equals(pMenor.getText()) && !" ".equals(pMayor.getText())){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Tipo, Fecha y Nombre
            else if (!" ".equals(pNombre.getText()) && !" ".equals(pTipo.getSelectedItem().toString()) && pFecha.getDate()!=null && pMenor.getText().isEmpty() && pMayor.getText().isEmpty()){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Nombre, Tipo y Precio
            else if (!" ".equals(pNombre.getText()) && !" ".equals(pTipo.getSelectedItem().toString()) && pFecha.getDate()==null && !" ".equals(pMenor.getText()) && !" ".equals(pMayor.getText())){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Tipo, Fecha y Rango
            else if (pNombre.getText().isEmpty() && !" ".equals(pTipo.getSelectedItem().toString()) && pFecha.getDate()!=null && !" ".equals(pMenor.getText()) && !" ".equals(pMayor.getText())){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre.getText()) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha.getDate().toString())){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Nombre, Tipo y Precio
            else if (!" ".equals(pNombre.getText()) && !" ".equals(pTipo.getSelectedItem().toString()) && pFecha.getDate()==null && !" ".equals(pMenor.getText()) && !" ".equals(pMayor.getText())){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            //Tipo, Fecha y Rango
            else if (pNombre.getText().isEmpty() && !" ".equals(pTipo.getSelectedItem().toString()) && pFecha.getDate()!=null && !" ".equals(pMenor.getText()) && !" ".equals(pMayor.getText())){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            // Nombre Fecha Rango
            else if (!" ".equals(pNombre.getText()) && pTipo.getSelectedItem().toString().isEmpty() && pFecha.getDate()!=null && !" ".equals(pMenor.getText()) && !" ".equals(pMayor.getText())){
                A_InicioPrograma.JPSDATA.goToStart();
                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
                //Recorre la JPSDATA
                while (A_InicioPrograma.JPSDATA.current != null){
                    //Busca el tiquete
                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha)){
                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
                        
                        modelo.addRow(O);
                        modelo.setValueAt(DatoNombre, contador, 0);
                        modelo.setValueAt(DatoFecha, contador, 1);
                        modelo.setValueAt(btn1, contador, 2);
                        modelo.setValueAt(btn2, contador, 3);
                        
                        contador = contador + 1;
                    }
                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
                }
            }
            // Todos los Filtros
//            else if (!" ".equals(pNombre.getText())){
//                    if(!" ".equals(pTipo.getSelectedItem().toString())){
//                        if (!" ".equals(pFecha.getDate().toString())) {
//                                if(!" ".equals(pMenor.getText())) {
//                                        if(!" ".equals(pMayor.getText())){
//                A_InicioPrograma.JPSDATA.goToStart();
//                A_InicioPrograma.JPSDATA.current = A_InicioPrograma.JPSDATA.current.getNext();
//                //Recorre la JPSDATA
//                while (A_InicioPrograma.JPSDATA.current != null){
//                    //Busca el tiquete
//                    if (A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo.equals(pNombre.getText()) && A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo.toString().equals(pFecha.getDate().toString()) && A_InicioPrograma.JPSDATA.current.getElement().tipoSorteo.toString().equals(pTipo.getSelectedItem().toString())){
//                        String DatoNombre = A_InicioPrograma.JPSDATA.current.getElement().nombreSorteo;
//                        Date DatoFecha = A_InicioPrograma.JPSDATA.current.getElement().fechaSorteo;
//                        
//                        modelo.addRow(O);
//                        modelo.setValueAt(DatoNombre, contador, 0);
//                        modelo.setValueAt(DatoFecha, contador, 1);
//                        modelo.setValueAt(btn1, contador, 2);
//                        modelo.setValueAt(btn2, contador, 3);
//                        
//                        contador = contador + 1;
//                    }
//                    A_InicioPrograma.JPSDATA.current=A_InicioPrograma.JPSDATA.current.getNext();
//                }
//            }
//                                }
//                        }
//                    }
//            }
        }
    }//GEN-LAST:event_BusquedaActionPerformed

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
            java.util.logging.Logger.getLogger(J_busquedaSorteos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(J_busquedaSorteos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(J_busquedaSorteos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(J_busquedaSorteos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new J_busquedaSorteos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Busqueda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public static com.toedter.calendar.JDateChooser pFecha;
    private javax.swing.JTextField pMayor;
    private javax.swing.JTextField pMenor;
    public static javax.swing.JTextField pNombre;
    public static javax.swing.JComboBox<String> pTipo;
    // End of variables declaration//GEN-END:variables
}
