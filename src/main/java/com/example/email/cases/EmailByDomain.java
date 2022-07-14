package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;
import java.util.stream.Collectors;

public class EmailByDomain {

    /*
    * Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
    * */

    private static List<Email> emails = EmailList.emails();

    public static List<Email> getEmailHotmail () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@hotmail"))
                .collect(Collectors.toList());
    }

    public static List<Email> getEmailOutlook () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@outlook"))
                //.map(email -> new Email(email.getName(), email.getEmail(), email.getSend()))
                .collect(Collectors.toList());
    }

    public static List<Email> getEmailGmail () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@gmail"))
                //.map(email -> new Email(email.getName(), email.getEmail(), email.getSend()))
                .collect(Collectors.toList());
    }

}
