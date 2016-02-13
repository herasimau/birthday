import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
public class Engine extends MyList {

    public static void run(){

        DateFormat dateMonth = new SimpleDateFormat("MM");
        Date month = new Date();
        DateFormat dateDay = new SimpleDateFormat("dd");
        Date day = new Date();
        int currentDay = Integer.parseInt(dateDay.format(day));
        int currentMonth = Integer.parseInt(dateMonth.format(month));

        if(currentDay==Wife.getPersonDay()&& currentMonth == Wife.getPersonMonth()){
            sendMail(Wife.getPersonName(),Wife.getPersonSurname());
        }
        if(currentDay==Brother.getPersonDay()&& currentMonth == Brother.getPersonMonth()){
            sendMail(Brother.getPersonName(),Brother.getPersonSurname());
        }
        if(currentDay==Mom.getPersonDay()&& currentMonth == Mom.getPersonMonth()){
            sendMail(Mom.getPersonName(),Mom.getPersonSurname());
        }
        if(currentDay==Salvatore.getPersonDay()&& currentMonth == Salvatore.getPersonMonth()){
            sendMail(Salvatore.getPersonName(),Salvatore.getPersonSurname());
        }
        if(currentDay==Alfredo.getPersonDay()&& currentMonth == Alfredo.getPersonMonth()){
            sendMail(Alfredo.getPersonName(),Alfredo.getPersonSurname());
        }
        if(currentDay==Ivan.getPersonDay()&& currentMonth == Ivan.getPersonMonth()){
            sendMail(Ivan.getPersonName(),Ivan.getPersonSurname());
        }
        if(currentDay==Cristina.getPersonDay()&& currentMonth == Cristina.getPersonMonth()){
            sendMail(Cristina.getPersonName(),Cristina.getPersonSurname());
        }
        if(currentDay==Luda.getPersonDay()&& currentMonth == Luda.getPersonMonth()){
            sendMail(Luda.getPersonName(),Luda.getPersonSurname());
        }
        if(currentDay==Sasha.getPersonDay()&& currentMonth == Sasha.getPersonMonth()){
            sendMail(Sasha.getPersonName(),Sasha.getPersonSurname());
        }
        if(currentDay==Valentina.getPersonDay()&& currentMonth == Valentina.getPersonMonth()){
            sendMail(Valentina.getPersonName(),Valentina.getPersonSurname());
        }
        if(currentDay==Yudi.getPersonDay()&& currentMonth == Yudi.getPersonMonth()){
            sendMail(Yudi.getPersonName(),Yudi.getPersonSurname());
        }
        if(currentDay==grandMom.getPersonDay()&& currentMonth == grandMom.getPersonMonth()){
            sendMail(grandMom.getPersonName(),grandMom.getPersonSurname());
        }
    }
    public static void sendMail(String name, String surName){

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("account","password");
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("nospam@nospam.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("nospam@nospam.com"));
            message.setSubject("BirthDay reminder!");
            message.setText("Hi friend remember that," +
                    "\n\n Today is "+name+"+" "+surName+"+" birthday"!");

            Transport.send(message);


        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
