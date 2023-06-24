package utils;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailHelper {


        public boolean SendEmail(String to,String from, String subject , String text)
        {
            boolean flag=false;
            Properties props = new Properties();
            props.put("mail.smtp.auth",true);
            props.put("mail.smtp.starttls.enable",true);
            props.put("mail.smtp.host","smtp.gmail.com");
            props.put("mail.smtp.port","587");


            String username = "tomtalking98765@gmail.com";
            String password = "";

            Session session = Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {

                    return new PasswordAuthentication(username, password);

                }
            });

            try{
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject(subject);
                message.setText(text);


                Transport.send(message);
                flag= true;
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            return flag;
        }

        public boolean sendEmailWithAttachment(String to, String from, String subject, String text, File file)
        {
            boolean flag = false;
            Properties props = new Properties();
            props.put("mail.smtp.auth",true);
            props.put("mail.smtp.starttls.enable",true);
            props.put("mail.smtp.host","smtp.gmail.com");
            props.put("mail.smtp.port","587");

            String username = "tomtalking98765@gmail.com";
            String password = "fkauwrxwhizbtyyk";

            Session session = Session.getInstance(props, new Authenticator() {

                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try{
                Message message = new MimeMessage(session);
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setFrom(new InternetAddress(from));
                message.setSubject(subject);

                MimeBodyPart part1 = new MimeBodyPart();
                part1.setText(text);

                MimeBodyPart part2 = new MimeBodyPart();
                part2.attachFile(file);

                MimeMultipart mimeMultipart = new MimeMultipart();
                mimeMultipart.addBodyPart(part1);
                mimeMultipart.addBodyPart(part2);

                message.setContent(mimeMultipart);

                Transport.send(message);
                flag= true;

            }catch (Exception e)
            {
                e.printStackTrace();
            }

            return flag;
        }
    }

