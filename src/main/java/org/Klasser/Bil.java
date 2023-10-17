package org.Klasser;

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
