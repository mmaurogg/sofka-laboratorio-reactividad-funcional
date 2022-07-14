package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;
import java.util.stream.Collectors;

public class CountByDomain {

    private static List<Email> emails = EmailList.emails();

    public static String countByDomain(){
        Long counHotmail = getEmailHotmail().stream().count();
        Long counGmail = getEmailGmail().stream().count();
        Long counOutlook = getEmailOutlook().stream().count();

        return "Number of Hotmail is: " + counHotmail
                + "\nNumber of Gmail is: " + counGmail
                + "\nNumber of Outlook is: " + counOutlook;
    }

    private static List<Email> getEmailHotmail () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@hotmail"))
                .collect(Collectors.toList());
    }

    private static List<Email> getEmailOutlook () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@outlook"))
                //.map(email -> new Email(email.getName(), email.getEmail(), email.getSend()))
                .collect(Collectors.toList());
    }

    private static List<Email> getEmailGmail () {

        return emails.stream()
                .filter(email -> email.getEmail().contains("@gmail"))
                //.map(email -> new Email(email.getName(), email.getEmail(), email.getSend()))
                .collect(Collectors.toList());
    }
}
