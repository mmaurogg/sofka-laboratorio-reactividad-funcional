package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * si se envió un correo o no a cada uno de los correos, si se le envió cambiar el estado en la lista,
 * esto respetando la inmutabilidad.
 */
public class SendEmail {

    private static List<Email> emails = EmailList.emails();

    public static List<Email> emailsSends (){

        return emails.stream()
                .filter(correo -> correo.getSend().equals(true))
                .map(correo -> new Email(correo.getName(), correo.getEmail(), false))
                .collect(Collectors.toList());
    }
}

