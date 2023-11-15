package org.Lektion_15_11_2023;

public class LoginPage {

    Database database;

    public LoginPage(Database database){
        this.database = database;
    }

    public String login(String username,String password){
        if (database.login(username,password)){
            return "Inloggad!";
        }else {
            return "Inloggningen misslyckades";
        }
    }


}
