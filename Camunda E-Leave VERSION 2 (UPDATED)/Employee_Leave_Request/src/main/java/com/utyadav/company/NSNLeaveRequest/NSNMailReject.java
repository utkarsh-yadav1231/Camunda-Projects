package com.utyadav.company.NSNLeaveRequest;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;



public class NSNMailReject implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub

		        final String username = "gmail_username_1";
		        final String password = "Passwordonly";

		        Properties prop = new Properties();
				prop.put("mail.smtp.host", "smtp.gmail.com");
		        prop.put("mail.smtp.port", "587");
		        prop.put("mail.smtp.auth", "true");
		        prop.put("mail.smtp.starttls.enable", "true"); //TLS
		        
		        Session session = Session.getInstance(prop,new javax.mail.Authenticator() 
		        {
		                    protected PasswordAuthentication getPasswordAuthentication() 
		                    {
		                        return new PasswordAuthentication(username, password);
		                    }
		        });

		        try {

		            Message message = new MimeMessage(session);
		            message.setFrom(new InternetAddress("gmail_username_1@gmail.com"));
		            message.setRecipients(
		                    Message.RecipientType.TO,
		                    InternetAddress.parse("gmail_username_2@gmail.com")
		            );
		            message.setSubject("Regarding Leave Request approval");
		            message.setText("Hello Sir," 
		            + "\n\n Your Leave request status has changed now. Kindly Check on your Employee Leave Tool regarding approval. Thank You. \n\n Best Regards, HR Dept");

		            Transport.send(message);

		            System.out.println("\n\n\n\n Email SENT SUCCESSFULLY.......\n\n\n GOOD JOB BUDDY !");

		        } catch (MessagingException e) {
		            e.printStackTrace();
		        }
		    }


	}
