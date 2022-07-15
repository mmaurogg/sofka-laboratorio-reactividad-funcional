package com.example.calculator.model;

public class Function {

    private Integer body;
    private String variable;
    private Integer exponent;

    public Function(Integer body, String variable, Integer exponent) {
        this.body = body;
        this.exponent = exponent;
        if(!exponent.equals(0)) {
            this.variable = variable;
        }
    }

    public Function(Integer body) {
        this.body = body;
    }

    public Integer getBody() {
        return body;
    }

    public Integer getExponent() {
        return exponent;
    }

    public String getVariable() {
        return variable;
    }


    @Override
    public String toString() {
        if(variable == null) return "\nfuncion: "+ body + "\nfuncion inversa: " +"(1/"+body+")";
        return "\nfuncion: " + body + variable + "^" + exponent
                +"\nfuncion inversa: " +"("+variable+"/"+body+")^(1/"+exponent+")";
    }
}
