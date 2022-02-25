package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Atleta numero1 = new Atleta("Carlos", Atleta.gender.MEN, LocalDate.of(2000, 6, 12));
        Atleta numero2 = new Atleta("Juan", Atleta.gender.MEN, LocalDate.of(1999, 12,2), LocalDate.of(2020, 5, 24));
        Atleta numero3 = new Atleta("Cosmin", Atleta.gender.MEN, LocalDate.of(2002,7,17), LocalDate.of(2008,9,12), LocalDate.of(2021,8,20));
//        System.out.println(numero3.age());

        //System.out.println(numero2.retire(LocalDate.of(2020, 6, 12)));
        //System.out.println(numero2.isActive(LocalDate.of(2020, 8,12)));
//        System.out.println(numero3.daysActive());
//        System.out.println(numero3);
        numero1.debut(LocalDate.of(2008,8, 24));
        Prueba prueba1 = new Prueba("Salto");
        Marca marca1 = new Marca(prueba1, numero1, 5);
        Marca marca2 = new Marca(prueba1, numero1, 7);
        Campeonato campeonatoDelMundo = new Campeonato(LocalDate.of(2010, 5,12), LocalDate.of(2010,5,15), prueba1 );
        campeonatoDelMundo.inscribeAtleta(numero1);
        campeonatoDelMundo.marcaRealiazda(marca1);
        System.out.println(campeonatoDelMundo);

    }
}
