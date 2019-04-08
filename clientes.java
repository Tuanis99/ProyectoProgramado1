package progra1final;
import java.util.Date;
import javax.swing.JOptionPane;
import static progra1final.pedidosTiquetes.correoElectronicotxt;
import static progra1final.pedidosTiquetes.dateTxt;
import static progra1final.pedidosTiquetes.direccionTxt;
import static progra1final.pedidosTiquetes.edadActualtxt;
import static progra1final.pedidosTiquetes.fechaEnvio;
import static progra1final.pedidosTiquetes.nombreCompletotxt;
import static progra1final.pedidosTiquetes.numeroCedulatxt;
import static progra1final.pedidosTiquetes.numeroTelefonicotxt;
import static progra1final.pedidosTiquetes.tipo;
public class clientes {
    public String nombre;
    public int edad;
    public String tipoSorteo;
    public int cedula;
    public Date fechaNacimiento;
    public String direccion;
    public int numeroTel;
    public String correoElectronico;
    public String fechaTiquete;
   //public int numeroSolicitado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoSorteo() {
        return tipoSorteo;
    }

    public void setTipoSorteo(String tipoSorteo) {
        this.tipoSorteo = tipoSorteo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaTiquete() {
        return fechaTiquete;
    }

    public void setFechaTiquete(String fechaTiquete) {
        this.fechaTiquete = fechaTiquete;
    }

//    public int getNumeroSolicitado() {
//        return numeroSolicitado;
//    }
//
//    public void setNumeroSolicitado(int numeroSolicitado) {
//        this.numeroSolicitado = numeroSolicitado;
//    }
    
    
    public clientes(String nombre, int edad, String tipoSorteo, int cedula, Date fechaNacimiento, String direccion, int numeroTel, String correoElectronico, String fechaTiquete) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoSorteo = tipoSorteo;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.numeroTel = numeroTel;
        this.correoElectronico = correoElectronico;
        this.fechaTiquete = fechaTiquete;
    }

    public clientes() {
    }
   
    public void ingresarPedido(){
        //necesarios para tabla de atender 
        this.nombre = nombreCompletotxt.getText();
        this.edad = Integer.parseInt(edadActualtxt.getText());
        this.tipoSorteo = tipo.getSelectedItem().toString();
        
        //demás datos
        this.cedula = Integer.parseInt(numeroCedulatxt.getText());
        this.fechaNacimiento = dateTxt.getDate();
        this.direccion = direccionTxt.getText();
        this.numeroTel = Integer.parseInt(numeroTelefonicotxt.getText());
        this.correoElectronico = correoElectronicotxt.getText();
        this.fechaTiquete = fechaEnvio.getDate().toString();
        //this.numeroSolicitado = Integer.parseInt(numeroTiquete.getText());
        
 
        clientes Clientes = new clientes(nombre, edad, tipoSorteo, cedula, fechaNacimiento, direccion,numeroTel,correoElectronico,fechaTiquete);
       
        //condicion para entrar a cola normal 
        if(edad < 65){
            A_InicioPrograma.pedidos.encolar(Clientes);
            JOptionPane.showMessageDialog(null,"Se ha realizado el pedido exitosamente", "Éxito", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            A_InicioPrograma.pedidospreferencial.encolar(Clientes);
            JOptionPane.showMessageDialog(null,"Se ha realizado el pedido exitosamente", "Éxito", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
