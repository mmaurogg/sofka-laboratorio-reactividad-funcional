package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase contiene los métodos que devuelven los correos segun su dominio
 * @author: Manuel Mauricio Gómez Gallo - mmaurogg
 * @version: 14/07/2022
 */
public class EmailByDomain {


    private static List<Email> emails = EmailList.emails();

    /**
     * Método que devuelve los correos con dominio Hotmail
     * @return lista de correo con dominio Hotmail
     * */
    public static List<Email> getEmailHotmail () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@hotmail"))
                .collect(Collectors.toList());
    }

    /**
     * Método que devuelve los correos con dominio Outlook
     * @return lista de correo con dominio Outlook
     * */
    public static List<Email> getEmailOutlook () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@outlook"))
                //.map(email -> new Email(email.getName(), email.getEmail(), email.getSend()))
                .collect(Collectors.toList());
    }

    /**
     * Método que devuelve los correos con dominio Gmail
     * @return lista de correo con dominio Gmail
     * */
    public static List<Email> getEmailGmail () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@gmail"))
                //.map(email -> new Email(email.getName(), email.getEmail(), email.getSend()))
                .collect(Collectors.toList());
    }

}
