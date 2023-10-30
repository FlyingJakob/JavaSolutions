package org.Lektion_30_10_2023;

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




    public void call(){
        System.out.println(model+" is Calling...");
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone("Apple","Iphone 11 pro");

        Phone mySecondPhone = new Phone("Apple");

        myPhone.call();
        mySecondPhone.call();

    }


}
