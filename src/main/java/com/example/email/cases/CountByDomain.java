package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase cuenta los correos según su dominio
 * @author: Manuel Mauricio Gómez Gallo - mmaurogg
 * @version: 14/07/2022
 */
public class CountByDomain {

    private static List<Email> emails = EmailList.emails();

    /**
     * Método que retorna la cantidad de correos segun su dominio
     * */
    public static String countByDomain(){
        Long counHotmail = getEmailHotmail().stream().count();
        Long counGmail = getEmailGmail().stream().count();
        Long counOutlook = getEmailOutlook().stream().count();

        return "Number of Hotmail is: " + counHotmail
                + "\nNumber of Gmail is: " + counGmail
                + "\nNumber of Outlook is: " + counOutlook;
    }

    /**
     * Método que devuelve lista de correo con dominio Hotmail
     * */
    private static List<Email> getEmailHotmail () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@hotmail"))
                .collect(Collectors.toList());
    }

    /**
     * Método que devuelve lista de correo con dominio Outlook
     * */
    private static List<Email> getEmailOutlook () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@outlook"))
                //.map(email -> new Email(email.getName(), email.getEmail(), email.getSend()))
                .collect(Collectors.toList());
    }

    /**
     * Método que devuelve lista de correo con dominio Gmail
     * */
    private static List<Email> getEmailGmail () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@gmail"))
                //.map(email -> new Email(email.getName(), email.getEmail(), email.getSend()))
                .collect(Collectors.toList());
    }
}
