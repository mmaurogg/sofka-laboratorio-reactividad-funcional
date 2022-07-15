package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase comprueba que correos fueron enviados y cambia su estado
 * @author: Manuel Mauricio Gómez Gallo - mmaurogg
 * @version: 14/07/2022
 */
public class SendEmail {

    private static List<Email> emails = EmailList.emails();

    /**
     * Método que busca os correos enviados y cambia su estado a false
     * @return lista de correos que se les cambió el estado
     * */
    public static List<Email> emailsSends (){

        return emails.stream()
                .filter(correo -> correo.getSend().equals(true))
                .map(correo -> new Email(correo.getName(), correo.getEmail(), false))
                .collect(Collectors.toList());
    }
}

