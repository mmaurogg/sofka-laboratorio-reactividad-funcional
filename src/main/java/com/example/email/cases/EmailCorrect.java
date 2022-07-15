package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Esta clase para comprobar que correos cumplen con las condiciones cuales no
 * @author: Manuel Mauricio Gómez Gallo - mmaurogg
 * @version: 14/07/2022
 */
public class EmailCorrect {

    private static List<Email> emails = EmailList.emails();

    /**
     * Método que indica cuales de los correos ingresados es correcto o no
     * @return Hasmap con el correo y una condicion booleana que indica si esta correcto con un true o de lo contrario false
     * */
    public static Map<String, Boolean> verifyEmail ( ) {

        Map<String, Boolean> list = new HashMap<String, Boolean>();

        emails.stream()
                .map(elemtn -> list.put(elemtn.getEmail(), verifyConditions(elemtn.getEmail())))
                .collect(Collectors.toList());

        return list;
    }

    /**
     * Método que verifica si todas las condiciones pedidas de los correos
     * @param @string con el correo a nalizar
     * @return true si cumple con las condiciones, false si no cumple
     * */
    private static Boolean verifyConditions (String correo){
        return (verifySymbol(correo)) ? verifyDomain(correo) : false;
    }

    /**
     * Método que verifica que los correos posean un @
     * @param @string con el correo a nalizar
     * @return true si cumple con las condiciones, false si no cumple
     * */
    private static Boolean verifySymbol ( String correo ){
        return correo.contains("@");
    }

    /**
     * Método que verifica que los correos posean un dominio válido (Hotmail, Gmail o Outlook)
     * @param @string con el correo a nalizar
     * @return true si cumple con las condiciones, false si no cumple
     * */
    private static Boolean verifyDomain ( String correo ){
        if(  correo.contains("hotmail")
                || correo.contains("gmail")
                || correo.contains("outlook")){
            return true;
        }
        return false;
    }

}
