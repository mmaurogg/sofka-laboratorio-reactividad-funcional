package com.example.chat;

import org.jboss.logging.Logger;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckMessage {

    /*
    * Crear un chat, un input donde lo que se ingrese sea almacenado en una lista, para posteriormente
    * cambiar en la lista las malas palabras, para compararlas con la lista del chat y
    * si se encuentra una reemplazarla por: ****, esto respetando los principios de la
    * programación reactiva.
    * */

    private static final Logger log = Logger.getLogger("");
    private static List<String> restrictWords = List.of("marica", "puta", "pirobo", "gonorrea", "malparido", "carechimba");

    public static void activeChat() {
        log.info("Bienvendio al chat, escriba su mensaje:");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        List<String> listMessage = Arrays.stream(message.toLowerCase().split(" "))
                .collect(Collectors.toList());

        filterMessage(listMessage);

    }
    private static void filterMessage(List<String> message) {

        Flux.fromIterable(message)
                .map(item -> restrictWords.contains(item)? "****" : item)
                .reduce((acum , text)-> acum + " " + text)
                .subscribe(text -> log.info(text));
    }

}
