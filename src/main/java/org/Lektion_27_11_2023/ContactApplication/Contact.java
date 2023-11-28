package org.Lektion_27_11_2023.ContactApplication;

public class Contact {

    public String name;
    public String email;
    public String number;

    public Contact(String name, String email, String number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public void changeNumber(String newNumber){

    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
