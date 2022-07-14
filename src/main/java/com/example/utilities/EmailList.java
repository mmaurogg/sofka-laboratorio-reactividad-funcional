package com.example.utilities;

import com.example.email.models.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailList {

    public static List<Email> emails () {
        List<Email> list = new ArrayList<>();
        list.add(new Email("persona4", "correo4@h.com", true));
        list.add(new Email("persona5", "correo5gmail.com", true));

        list.add(new Email("persona1", "correo1@gmail.com", false));
        list.add(new Email("persona2", "correo2@hotmail.com", false));
        list.add(new Email("persona3", "correo3@outlook.com", false));
        list.add(new Email("persona5", "correo5@gmail.com", true));
        list.add(new Email("persona6", "correo6@gmail.com", false));
        list.add(new Email("persona7", "correo7@hotmail.com", false));
        list.add(new Email("persona8", "correo8@outlook.com", false));
        list.add(new Email("persona9", "correo9@gmail.com", true));
        list.add(new Email("persona10", "correo10@gmail.com", false));
        list.add(new Email("persona11", "correo11@hotmail.com", false));
        list.add(new Email("persona12", "correo12@outlook.com", false));
        list.add(new Email("persona13", "correo13@gmail.com", true));
        list.add(new Email("persona14", "correo14@gmail.com", false));
        list.add(new Email("persona15", "correo15@hotmail.com", false));
        list.add(new Email("persona16", "correo16@outlook.com", false));
        list.add(new Email("persona17", "correo17@gmail.com", true));
        list.add(new Email("persona18", "correo18@gmail.com", false));
        list.add(new Email("persona19", "correo19@hotmail.com", false));
        list.add(new Email("persona20", "correo20@outlook.com", false));
        list.add(new Email("persona21", "correo21@gmail.com", true));
        list.add(new Email("persona22", "correo22@gmail.com", false));
        list.add(new Email("persona23", "correo23@hotmail.com", false));
        list.add(new Email("persona24", "correo24@outlook.com", false));
        list.add(new Email("persona25", "correo25@gmail.com", true));
        list.add(new Email("persona26", "correo26@gmail.com", false));
        list.add(new Email("persona27", "correo27@hotmail.com", false));
        list.add(new Email("persona28", "correo28@outlook.com", false));
        list.add(new Email("persona29", "correo29@gmail.com", true));
        list.add(new Email("persona30", "correo30@gmail.com", true));
        list.add(new Email("persona31", "correo31@gmail.com", true));
        list.add(new Email("persona32", "correo32@gmail.com", true));
        list.add(new Email("persona33", "correo33@gmail.com", true));

        return list;
    }
}
