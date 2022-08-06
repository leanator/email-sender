package com.springboot.emailsender;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.emailsender.model.Mail;
import com.springboot.emailsender.services.MailService;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.springboot"
})

public class EmailSenderApplication {



        public static void main(String[] args) {

            Mail mail = new Mail();
            mail.setMailFrom("gdesoportegde@gmail.com");
            mail.setMailTo("gdesoportegde@gmail.com");
            mail.setMailSubject("Prueba LMH");
            mail.setMailContent("saraza lasasasa farafazasa");

            ApplicationContext ctx = SpringApplication.run(EmailSenderApplication.class, args);
            MailService mailService = (MailService) ctx.getBean("mailService");
            mailService.sendEmail(mail);

        }

        // SpringApplication.run(EmailSenderApplication.class, args);
    }



