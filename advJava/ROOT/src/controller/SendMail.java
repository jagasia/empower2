package controller;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	 public static void send(String to, String sub, 
             String msg, final String user,final String pass)
{ 
//create an instance of Properties Class   
Properties props = new Properties();

/* Specifies the IP address of your default mail server
for e.g if you are using gmail server as an email sever
you will pass smtp.gmail.com as value of mail.smtp host. 
Change accordingly, if your email id is not a gmail id
*/
props.put("mail.smtps.host", "smtps.gmail.com");
props.put("mail.smtps.port", "465");	//587		
props.put("mail.smtps.auth", "true");
props.put("mail.smtps.starttls.enable", "true");
props.put("mail.smtps.socketFactory.class", "javax.net.ssl.SSLSocketFactory");


/* Pass Properties object(props) and Authenticator object   
for authentication to Session instance 
*/

Session session = Session.getInstance(props,new javax.mail.Authenticator()
{
protected PasswordAuthentication getPasswordAuthentication() 
{
return new PasswordAuthentication(user,pass);
}
});

try
{

/* Create an instance of MimeMessage, 
it accept MIME types and headers 
*/

MimeMessage message = new MimeMessage(session);
message.setFrom(new InternetAddress(user));
message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
message.setSubject(sub);
message.setText(msg);

/* Transport class is used to deliver the message to the recipients */

Transport.send(message);


}
catch(Exception e)
{
e.printStackTrace();
}
}  
}