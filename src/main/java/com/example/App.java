package com.example;

import com.example.calculator.Calculator;
import com.example.calculator.model.Function;
import com.example.email.cases.*;

import com.example.chat.*;
import org.jboss.logging.Logger;

import java.util.Map;

public class App 
{
    private static final Logger log = Logger.getLogger("");

    public static void main( String[] args )
    {
        // Ejercicio 1
        // punto A
        EmailRepeat.getNoRepeatEmail().forEach(email -> log.info(email));

        // punto B
        log.info("Los correos de Gmail son: "+ EmailByDomain.getEmailGmail());
        log.info("Los correos de Hotmail son: "+EmailByDomain.getEmailHotmail());
        log.info("Los correos de Outlook son: "+EmailByDomain.getEmailOutlook());

        // punto C
        Map<String, Boolean> emailsVerify = EmailCorrect.verifyEmail();
        emailsVerify.forEach((email, isCorrect) -> log.info(email + " " + (isCorrect ? "no es correcto" : "es correcto")));

        // punto D
        log.info("La cantidad de correos correctos son " + CountEmail.countEmail());

        // Punto E
        log.info(CountByDomain.countByDomain());

        // punto F
        log.info("Los correos enviados fueron:");
        SendEmail.emailsSends().forEach(email -> log.info(email.getEmail()));


        //Ejercicio 2
        CheckMessage.activeChat();

        //Ejercicio 3
        Calculator.calculator();
    }
}
