/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1final;

import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class Hh_Tiquetes {
    public String nombre;
    public String cliente;
    public String sorteo;
    public int numero;
    public int precio;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getSorteo() {
        return sorteo;
    }

    public void setSorteo(String sorteo) {
        this.sorteo = sorteo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    

    public Hh_Tiquetes(String nombre, String cliente, String sorteo, int numero, int precio) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.sorteo = sorteo;
        this.numero = numero;
        this.precio = precio;
    }

    public Hh_Tiquetes() {
    }
    
   public void insertarTiquete(){
        if(" ".equals(Ii_GenerarTiquete.NombreEmisor.getText()) || " ".equals(Ii_GenerarTiquete.NombreCliente.getText()) || " ".equals(Ii_GenerarTiquete.cbSorteo.getSelectedItem()) || " ".equals(Ii_GenerarTiquete.Numerotxt.getText())){
           JOptionPane.showMessageDialog(null,"Por favor, asegurese de rellenar todos los espacios", "Error",JOptionPane.PLAIN_MESSAGE);
           return;
                }
        try{
            //Obtiene los datos
            String tempNombreEmisor=Ii_GenerarTiquete.NombreEmisor.getText();
            int tempNumero=Integer.parseInt(Ii_GenerarTiquete.Numerotxt.getText());
            String tempSorteo =(String) Ii_GenerarTiquete.cbSorteo.getSelectedItem();
            String tempCliente =Ii_GenerarTiquete.NombreCliente.getText();
            int precioTiquetes = Integer.parseInt(Ii_GenerarTiquete.Preciotxt.getText());
            //Asigna los datos
            this.nombre= tempNombreEmisor;
            this.numero = tempNumero;
            this.sorteo = tempSorteo;
            this.cliente = tempCliente;
            this.precio = precioTiquetes;
            
        }
        catch(NumberFormatException e){
            //Mensaje de error
            JOptionPane.showMessageDialog(null,"Algo ocurrió, revise los datos ingresados", "Error",JOptionPane.PLAIN_MESSAGE);
        }
}
}
