package org.Lektion_30_10_2023;

import java.util.ArrayList;
import java.util.List;

public class Phone {

    public String brand;
    public String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        if (model == null){
            this.model = "Unknown";
        }else{
            this.model = model;
        }
    }

    public Phone(String brand){
        this.brand = brand;
        this.model = "Unknown";
    }

    public void charge(){
        System.out.println(model+" is Charging");
    }

    public void call(){
        System.out.println(model+" is Calling...");
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("Apple","Iphone 11 pro");
        Phone phone2 = new Phone("Apple","Iphone 13");
        Phone phone3 = new Phone("Nokia","3310");

        List<Phone> myPhones = new ArrayList<>();
        myPhones.add(phone1);
        myPhones.add(phone2);
        myPhones.add(phone3);

        for (int i = 0; i < myPhones.size(); i++) {
            myPhones.get(i).call();
            myPhones.get(i).charge();
        }



    }


}
