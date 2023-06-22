package com.tests;

import utils.EmailHelper;

import java.io.File;

public class TestEmail {
    public static void main(String[] args)
    {
        EmailHelper gmailsend = new EmailHelper();
        String from = "naziyakhan20231@gmail.com";
        String to = "";
        String subject = "EXTENT REPORT ";
        String text = "  ";
        File file = new File("C:\\Users\\Exam user\\IdeaProjects\\careliveautomation\\extent-reports\\extent-report.html");


        boolean b = gmailsend.sendEmailWithAttachment(to,from,subject,text,file);
        //boolean b = gmailsend.sendmail(to,from,subject,text);
        if(b)
        {
            System.out.println("Email is sent successfully");
        }
        else {
            System.out.println("Error in sending mail");
        }
    }
}

