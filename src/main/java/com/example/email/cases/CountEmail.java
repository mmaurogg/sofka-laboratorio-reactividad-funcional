package com.example.email.cases;

import com.example.email.models.Email;
import com.example.utilities.EmailList;

import java.util.List;

/**
 * Esta clase cuenta la cantidad de correos correctos que poseen @ y pertenecen a un domino (Hotmail, Gmail o Outlook)
 * @author: Manuel Mauricio Gómez Gallo - mmaurogg
 * @version: 14/07/2022
 */
public class CountEmail {
    private static List<Email> emails = EmailList.emails();

    /**
     * Método que devuelve la cuenta de los correos
     * */
    public static Long countEmail () {
        return emails.stream()
                .filter(email -> verifyConditions(email.getEmail()))
                .count();
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
