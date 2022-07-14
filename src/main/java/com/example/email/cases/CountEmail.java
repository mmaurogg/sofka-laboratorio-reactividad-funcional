package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;

/*
 * Saber la cantidad de correos que hay, sin usar un ciclo
 * */
public class CountEmail {
    private static List<Email> emails = EmailList.emails();

    public static Long countEmail () {
        return emails.stream()
                .filter(email -> verifyConditions(email.getEmail()))
                .count();
    }

    private static Boolean verifyConditions (String correo){
        return (verifySymbol(correo)) ? verifyDomain(correo) : false;
    }

    private static Boolean verifySymbol ( String correo ){
        return correo.contains("@");
    }

    private static Boolean verifyDomain ( String correo ){
        if(  correo.contains("hotmail")
                || correo.contains("gmail")
                || correo.contains("outlook")){
            return true;
        }
        return false;
    }

}
