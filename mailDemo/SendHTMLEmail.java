 import java.util.*;
 import javax.mail.*;
 import javax.activation.*;
 import javax.mail.internet.*;
 class SendHTMLEmail  //DeveloperIndian
 {
 public static void main(String []args)
 {
	String to ="developerIndian@gmail.com";
	String from="BigdataDeveloper@yahoo.com";
	String host="localhost";
	Properties properties=System.getProperties();
	properties.setProperty("mail.smpt.host",host);
	Session session=Session.getDefaultInstance(properties);
		try{
		MimeMessage message =new MimeMessage(session);
		message.setrecipient(Message.RecipientType.To,new InternetAddress(to));
		message.setSubject("This is the subject");
		message.setContent("<h1>this is actual message</h1>");
		Transport.send(message);
		System.out.println("sent message successfully.....");
		}
	catch(MessageException ex)
		{
		}
 
 }
 }
