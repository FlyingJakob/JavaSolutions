package org.Lektion_07_11_2023;

public interface Resizable {

    public default void resize(double factor){
        System.out.println("This class is resizable");
    }

}
