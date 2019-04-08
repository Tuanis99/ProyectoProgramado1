package progra1final;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import static progra1final.atencionPedidos.TablaPreferencial;
import static progra1final.atencionPedidos.tablaPedidos;
public class atencionAPedidos{
    clientes atiende;
    Correo enviar = new Correo();
    public void atenderPedidosPreferenciales(){
        if (A_InicioPrograma.pedidospreferencial != null){
            if (A_InicioPrograma.informacionpreferencial != null){
                atiende = (clientes) A_InicioPrograma.pedidospreferencial.frente();
                A_InicioPrograma.informacionpreferencial.encolar(atiende);
                A_InicioPrograma.pedidospreferencial.desencolar();
                String nombre = atiende.getNombre();
                int edad = atiende.getEdad();
                String tipo = atiende.getTipoSorteo();
                String estado = "Pendiente";
                String correo = atiende.getCorreoElectronico();
                String fecha = atiende.getFechaTiquete();
            
            DefaultTableModel model = (DefaultTableModel)TablaPreferencial.getModel();
            model.addRow(new Object[]{nombre, edad, tipo, estado});
            enviar.enviarCorreo(correo, fecha);
            }
        }
    }
    
    public void atenderPedidos(){
        if (A_InicioPrograma.pedidos != null){
            if (A_InicioPrograma.informacionpedido != null){
                atiende = (clientes) A_InicioPrograma.pedidos.frente();
                A_InicioPrograma.informacionpedido.encolar(atiende);
                A_InicioPrograma.pedidos.desencolar();
                String nombre = atiende.getNombre();
                int edad = atiende.getEdad();
                String tipo = atiende.getTipoSorteo();
                String estado = "Pendiente";
                String correo = atiende.getCorreoElectronico();
                String fecha = atiende.getFechaTiquete();
            
            DefaultTableModel model = (DefaultTableModel)tablaPedidos.getModel();
            model.addRow(new Object[]{nombre, edad, tipo, estado});
            enviar.enviarCorreo(correo, fecha);
            }
        }
    }
      
    public void liberarPedidoPreferencial(){
        A_InicioPrograma.informacionpreferencial.desencolar();
        ((DefaultTableModel)TablaPreferencial.getModel()).removeRow(0);       
    }
    
    public void liberarPedidos(){

        A_InicioPrograma.informacionpedido.desencolar();
        ((DefaultTableModel)tablaPedidos.getModel()).removeRow(0);       
    }
}