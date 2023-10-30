package org.Lektion_24_10_2023.Klasser;

public class Bil {
    public String color;
    private int year;
    public String name;

    public Bil(String color,int year,String name){
        this.color = color;
        this.year = year;
        this.name = name;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void startEngine(){
        System.out.println(name+" : Wroom");
    }


    @Override
    public String toString() {
        return name+" : "+year;
    }
}
