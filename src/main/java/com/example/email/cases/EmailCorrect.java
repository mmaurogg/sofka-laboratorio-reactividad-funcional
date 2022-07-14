package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmailCorrect {

    /*
    * Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)
     * */
    private static List<Email> emails = EmailList.emails();

    public static Map<String, Boolean> verifyEmail ( ) {

        Map<String, Boolean> list = new HashMap<String, Boolean>();

        emails.stream()
                .map(elemtn -> list.put(elemtn.getEmail(), elemtn.getSend()))
                .collect(Collectors.toList());

        return list;
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
