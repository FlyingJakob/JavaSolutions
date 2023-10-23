package org.Lektion_17_10_2023.Klasser;

public class Bil {
    String namn;
    String modell;

    Bil(String namn){
        this.namn = namn;
        modell = " ";
    }

    void startaMotor(){
        System.out.println("Nu startar "+namn);
    }


}
