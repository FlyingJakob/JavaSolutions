package org.Lektion_10_11_2023;

public class Messenger {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.createMessage("Hejsan",1);
    }

    public void createMessage(String message,int id){
        System.out.println("Message : "+message+" id : "+id);
    }

    public void createMessage(int id,String message){
        System.out.println("Message : "+message+" id : "+id);
    }

}
