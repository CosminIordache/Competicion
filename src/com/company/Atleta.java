package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Atleta {

    private String name;
    public String getName() {
        return name;
    }

    private Enum gender;
    public enum gender {
        MEN,
        WOMAN,
    }

    private LocalDate birthday;
    public LocalDate getBirthday() {
        return birthday;
    }

    private LocalDate startCarrer;
    public LocalDate getStartcarrer() {
        return startCarrer;
    }

    private LocalDate finishCarrer;
    public LocalDate getFinishRun() {
        return finishCarrer;
    }

    public Atleta (String name, gender gender, LocalDate birthday) {
       this(name, gender, birthday, null, null);
    }

    public Atleta (String name, gender gender, LocalDate birthday, LocalDate startCarrer){
        this(name, gender, birthday, startCarrer, null);
    }

    public Atleta (String name, gender gender, LocalDate birthday, LocalDate startCarrer, LocalDate finishCarrer){
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.startCarrer = startCarrer;
        this.finishCarrer = finishCarrer;

    }

    public int age (){
        return (int) (ChronoUnit.YEARS.between(birthday, LocalDate.now()));
    }

    public boolean debut( LocalDate fecha ){
        if (finishCarrer != null) {
            return false;
        }

        if (birthday.isAfter(fecha)){
            return false;
        }

        startCarrer = fecha;
        return true;
    }

    public boolean retire(LocalDate fecha){
        if(startCarrer == null){
            return false;
        }


        if (finishCarrer != null){
            return false;
        }

        if(fecha.isBefore(startCarrer)){
            return false;
        }

        finishCarrer = fecha;
        return true;
    }

    public boolean isActive (LocalDate fecha){
        if(finishCarrer != null){
            return false;
        }

        if(startCarrer == null){
            return false;
        }

        return true;
    }

    public int daysActive (){
        if(startCarrer == null && finishCarrer != null) {
            System.out.println("No a empezado su carrera o ya a acabado su carrera. Gracias");
        }
        return (int) ChronoUnit.DAYS.between(startCarrer, finishCarrer);
    }




    @Override
    public String toString() {
        return " Athlete name= " + name +
                ", Birthday=" + birthday +
                ", startCarrer=" + startCarrer +
                ", finishCarrer=" + finishCarrer;
    }
}
