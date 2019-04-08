/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1final;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author luisg
 */
public class Correo {
    public void enviarCorreo (String correo,String fecha){
    final String username = "holaprofeporfapasenos@gmail.com";
    final String password = "cartaguitocampeon";

        Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props,
                new javax.mail.Authenticator(){
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
	            }
                });
        
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("no-reply@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(correo));
            message.setSubject("Pedido de tiquetes");
            message.setText("Estimado Usuario,"
                    + "\n\n Su compra se ha realizado con exito. Sus tiquetes estaran listos para:" + fecha);
            Transport.send(message);
            System.out.println("Done");
        }
        
        catch (MessagingException e){
            throw new RuntimeException(e);
	}
}
}
