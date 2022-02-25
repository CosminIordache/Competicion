package com.company;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Campeonato {
    private LocalDate start;
    private LocalDate finish;
    private Prueba prueba;
    private List<Atleta> typeAtlete = new LinkedList<>();
    private List<Marca> typeMarca = new LinkedList<>();

    public Campeonato(LocalDate start, LocalDate finish, Prueba prueba){
        this.start = start;
        this.finish = finish;
        this.prueba = prueba;
    }

    public boolean inscribeAtleta(Atleta atleta){

        if (atleta.isActive(start) && !typeAtlete.contains(atleta)){
            typeAtlete.add(atleta);
            return true;
        }

        return false;
    }

    public boolean marcaRealiazda(Marca marca){

        if (prueba == marca.getPrueba()){
            typeMarca.add(marca);
            return true;
        }


        for (Atleta atleta : typeAtlete){
             if (!atleta.debut(start)){
                 return false;
             }
        }
        if (start == null){
             return false;
        }
        return false;
    }
    public boolean iniciar(){
        if (start == null){return true;};


        if (finish == null){
            return true;
        }

        return false;
    }
    public boolean finalizar(){
        if (finish == null){return true;}
        if (start != null){return true;}
        return false;
    }

    public Marca mejorMarca (){
        Marca mejorMarca = typeMarca.get(0);
        for (Marca marca : typeMarca){
            if (marca.getResultado() < mejorMarca.getResultado()){
                mejorMarca = marca;
            }
        }
        return mejorMarca;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "start=" + start +
                ", finish=" + finish +
                ", prueba=" + prueba +
                ", typeAtlete=" + typeAtlete +
                ", typeMarca=" + typeMarca +
                '}';
    }
}
