package com.company;

public class Prueba {

    private String name;
    public String getName() {
        return name;
    }

    public Prueba ( String name){
        this.name = name;
    }

    public boolean sameName (Prueba prueba){
        if (name.equals(prueba.name)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "name='" + name + '\'' +
                '}';
    }
}
