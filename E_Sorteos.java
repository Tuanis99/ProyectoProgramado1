/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1final;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author luisg
 */
public class E_Sorteos {
    public String nombreSorteo;
    public int codigo;
    public String tipoSorteo;
    public int emisiones;
    public Date fechaSorteo;
    public int numeroGanador;
    Hh_Tiquetes tiquetes;

    public String getNombreSorteo() {
        return nombreSorteo;
    }

    public void setNombreSorteo(String nombreSorteo) {
        this.nombreSorteo = nombreSorteo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoSorteo() {
        return tipoSorteo;
    }

    public void setTipoSorteo(String tipoSorteo) {
        this.tipoSorteo = tipoSorteo;
    }

    public int getEmisiones() {
        return emisiones;
    }

    public void setEmisiones(int emisiones) {
        this.emisiones = emisiones;
    }

    public Date getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(Date fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public int getNumeroGanador() {
        return numeroGanador;
    }

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }
    
    

    public E_Sorteos(String nombreSorteo, int codigo, String tipoSorteo, int emisiones, Date fechaSorteo, int numeroGanador) {
        this.nombreSorteo = nombreSorteo;
        this.codigo = codigo;
        this.tipoSorteo = tipoSorteo;
        this.emisiones = emisiones;
        this.fechaSorteo = fechaSorteo;
        this.numeroGanador = numeroGanador;
    }

    public E_Sorteos() {
    }
    
        public void insertarSorteos(){
        try{
            //Obtiene los datos
            String tempNombre = Ff_ingresoSorteo.NombreSorteotxt.getText();
            int tempCodigo = Integer.parseInt(Ff_ingresoSorteo.CodigoSorteotxt.getText());
            String tempTipoSorteo = (String) Ff_ingresoSorteo.cbxTipoSorteoISO.getSelectedItem();
            int tempEmisiones = Integer.parseInt(Ff_ingresoSorteo.Emisionestxt.getText());
            Date tempFechaSorteo = Ff_ingresoSorteo.SorteoDate.getDate();
            //Asigana los datos
            this.nombreSorteo = tempNombre;
            this.codigo = tempCodigo;
            this.tipoSorteo = tempTipoSorteo;
            this.emisiones = tempEmisiones;
            this.fechaSorteo = tempFechaSorteo;
        }
        catch(NumberFormatException e){
            //Mensaje de error
            JOptionPane.showMessageDialog(null, "Algo ocurrió, revise lo ingresado", "Error",JOptionPane.PLAIN_MESSAGE);
        }
        
        this.tiquetes = new Hh_Tiquetes();
    }   
    
}
