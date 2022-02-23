package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Atleta numero1 = new Atleta("Carlos", Atleta.gender.MEN, LocalDate.of(2000, 6, 12));
        Atleta numero2 = new Atleta("Juan", Atleta.gender.MEN, LocalDate.of(1999, 12,2), LocalDate.of(2020, 5, 24));
        Atleta numero3 = new Atleta("Cosmin", Atleta.gender.MEN, LocalDate.of(2002,7,17), LocalDate.of(2008,9,12), LocalDate.of(2021,8,20));
//        System.out.println(numero3.age());
        //System.out.println(numero1.debut(LocalDate.of(2008,8, 24)));
        //System.out.println(numero2.retire(LocalDate.of(2020, 6, 12)));
        //System.out.println(numero2.isActive(LocalDate.of(2020, 8,12)));
//        System.out.println(numero3.daysActive());
//        System.out.println(numero3);

        Prueba prueba1 = new Prueba("salto");
        Prueba prueba2 = new Prueba("salto");
        System.out.println(prueba1.sameName(prueba2));


    }
}
