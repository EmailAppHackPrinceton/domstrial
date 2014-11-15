package trial;

//File Name SendEmail.java
//Test Comment
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {

  //Go Patriots!!!
  static final String from = "princetonhack";
  static Session session;

  static {
  		//asdf
         // Get system properties
         Properties properties = System.getProperties();

         // Setup mail server
         properties.setProperty("mail.smtp.host", "smtp.gmail.com");
         properties.setProperty("mail.smtp.auth", "true");
         properties.setProperty("mail.smtp.port", "587");
         properties.setProperty("mail.smtp.starttls.enable", "true");

         // Get the default Session object.
         session = Session.getInstance(properties,
                     new javax.mail.Authenticator() {
                         protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                             return new javax.mail.PasswordAuthentication(from, "carnegie");
                         }
                     });
  }

  public static void sendEmail(String to, String emailMessage) {
     try {
        // Create a default MimeMessage object.
        MimeMessage mimeMessage = new MimeMessage(session);
        // Set From: header field of the header.
        mimeMessage.setFrom(new InternetAddress(from));
        // Set To: header field of the header.
        mimeMessage.addRecipient(Message.RecipientType.TO,
                                 new InternetAddress(to));
        // Set Subject: header field
        mimeMessage.setSubject("butts");
        // Now set the actual message
        mimeMessage.setText(emailMessage);

        // Send message
        Transport.send(mimeMessage);

     } catch (MessagingException mex) {
        mex.printStackTrace();
     }
  }

  public static String messageGenerator(String firstName, String lastName) {
      String completeMessage = "";
      String beginning = "Dear " + firstName + " " + lastName + ",\n\n";
      String generalMessage = "butts";

      completeMessage = completeMessage + beginning;
      completeMessage = completeMessage + generalMessage;
      return completeMessage;
  }

  public static void main(String [] args) 
  {
	  	EmailSenderGUI fuck = new EmailSenderGUI();
	  	fuck.createAndShowGUI();
        sendEmail("dominicxcliu@gmail.com","butts");
  }
}