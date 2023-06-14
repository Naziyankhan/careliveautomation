package utils;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailHelper {

    public void sendmail(){
    Properties props = new Properties();

    // this will set host of server- you can change based on your requirement
		props.put("mail.smtp.host", "smtp.gmail.com");

    // set the port of socket factory
		props.put("mail.smtp.socketFactory.port", "465");

    // set socket factory
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

    // set the authentication to true
		props.put("mail.smtp.auth", "true");

    // set the port of SMTP server
		props.put("mail.smtp.port", "465");

    // This will handle the complete authentication
    Session session = Session.getDefaultInstance(props,

            new javax.mail.Authenticator() {

                protected PasswordAuthentication getPasswordAuthentication() {

                    return new PasswordAuthentication("", "");

                }

            });

		try {

        // Create object of MimeMessage class
        Message message = new MimeMessage(session);

        // Set the from address
        try {
            message.setFrom(new InternetAddress("rinshadh@gmail.com"));
        } catch (MessagingException ex) {
            throw new RuntimeException(ex);
        }

        // Set the recipient address
        message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("rinshadh@gmail.com"));

        // Add the subject link
        try {
            message.setSubject("Testing Subject");
        } catch (MessagingException ex) {
            throw new RuntimeException(ex);
        }

        // Create object to add multimedia type content
        BodyPart messageBodyPart1 = new MimeBodyPart();

        // Set the body of email
        try {
            messageBodyPart1.setText("This is message body");
        } catch (MessagingException ex) {
            throw new RuntimeException(ex);
        }

        // Create another object to add another content
//        MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//
//        // Mention the file which you want to send
//        String filename = "G:\\a.xlsx";
//
//        // Create data source and pass the filename
//        DataSource source = new FileDataSource(filename);
//
//        // set the handler
//        try {
//            messageBodyPart2.setDataHandler(new DataHandler(source));
//        } catch (MessagingException ex) {
//            throw new RuntimeException(ex);
//        }
//
//        // set the file
//        try {
//            messageBodyPart2.setFileName(filename);
//        } catch (MessagingException ex) {
//            throw new RuntimeException(ex);
//        }

        // Create object of MimeMultipart class
        Multipart multipart = new MimeMultipart();

        // add body part 1
//        try {
//            multipart.addBodyPart(messageBodyPart2);
//        } catch (MessagingException ex) {
//            throw new RuntimeException(ex);
//        }

        // add body part 2
        try {
            multipart.addBodyPart(messageBodyPart1);
        } catch (MessagingException ex) {
            throw new RuntimeException(ex);
        }

        // set the content
        try {
            message.setContent(multipart);
        } catch (MessagingException ex) {
            throw new RuntimeException(ex);
        }

        // finally send the email
        Transport.send(message);

        System.out.println("=====Email Sent=====");

    } catch (MessagingException e) {

        throw new RuntimeException(e);

    }

}
}
