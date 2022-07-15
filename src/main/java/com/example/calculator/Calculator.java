package com.example.calculator;

import com.example.calculator.model.Function;
import org.jboss.logging.Logger;

import java.util.List;
import java.util.stream.Collectors;

/*
* Crear dos funciones, una para resolver derivadas y otra integrales, pero esta se deben usar si
* quiero hacer la contraria, es decir, si quiero hacer una derivada inversa o una integral inversa.
* */
public class Calculator {

    private static final Logger log = Logger.getLogger("");

    public static void calculator (){

        List<Function> functions = List.of(
                new Function(2,"x",1),
                new Function(5,"x",3)
        );

        log.info(" \nla derivada de las funciones son: "
                + functions.stream()
                //.map(function -> log.info(function))
                .map(function -> derivar(function))
                .collect(Collectors.toList()));

        log.info(" \nla integral de las funciones son: "
                + functions.stream()
                .map(function -> integrar(function))
                .collect(Collectors.toList()));

    }

    public static Function derivar(Function funcion) {

        if (funcion.getVariable().isEmpty()) return new Function(0);

        Integer newBody = funcion.getBody() * funcion.getExponent();
        Integer newExponent = funcion.getExponent() - 1;

        Function newFunction = new Function(newBody, funcion.getVariable(), newExponent);

        return newFunction;

    }

    public static Function integrar(Function funcion) {

        if (funcion.getVariable().isEmpty()) return new Function(funcion.getBody(), "x", 1);

        Integer newBody = funcion.getBody() / funcion.getExponent();
        Integer newExponent = funcion.getExponent() + 1;

        Function newFunction = new Function(newBody, funcion.getVariable(), newExponent);

        return newFunction;

    }


}


