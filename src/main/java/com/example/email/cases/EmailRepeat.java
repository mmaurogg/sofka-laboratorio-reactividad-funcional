package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;
import java.util.stream.Collectors;

public class EmailRepeat {

    /*
    * Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
    * */
    public static List<String> getNoRepeatEmail () {

        List<Email> emails = EmailList.emails();

        return emails.stream()
                .map(email -> email.getEmail())
                .distinct()
                .collect(Collectors.toList());
    }

}
