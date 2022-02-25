package com.company;

public class Marca {

    private Prueba prueba;

    public Prueba getPrueba() {
        return prueba;
    }

    private Atleta deportista;

    public Atleta getDeportista() {
        return deportista;
    }

    private int resultado;

    public int getResultado() {
        return resultado;
    }

    public Marca (Prueba prueba, Atleta deportista, int resultado){
        this.prueba = prueba;
        this.deportista = deportista;
        this.resultado = resultado;
    }

}
