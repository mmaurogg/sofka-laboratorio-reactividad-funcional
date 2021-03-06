package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase devuelve los correos que no estén repetidos
 * @author: Manuel Mauricio Gómez Gallo - mmaurogg
 * @version: 14/07/2022
 */
public class EmailRepeat {

    /**
     * Método para obtener los correos quitando los repetidos
     * @return lista de correos en formato string
     * */
    public static List<String> getNoRepeatEmail () {

        List<Email> emails = EmailList.emails();

        return emails.stream()
                .map(email -> email.getEmail())
                .distinct()
                .collect(Collectors.toList());
    }

}
