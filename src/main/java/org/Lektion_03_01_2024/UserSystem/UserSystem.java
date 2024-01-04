package org.Lektion_03_01_2024.UserSystem;

import org.Lektion_03_01_2024.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserSystem {

    public List<User> userList;

    public UserSystem(){
        this.userList = LoadUsers();
    }

    public static void main(String[] args) {
        UserSystem userSystem = new UserSystem();

    }


    public User login(String username,String password){
        User user = getUser(username);

        if (user==null){
            return null;
        }

        if (user.getPassword().equals(password)){
            return user;
        }else{
            return null;
        }
    }

    public User register(String username,String password,boolean isAdmin){

        if (getUser(username)!=null){
            return null;
        }

        User user = null;

        if (isAdmin){
            user = new AdminUser(username,password);
        }else{
            user = new MemberUser(username,password);
        }

        userList.add(user);
        SaveUsers();
        return user;
    }

    private User getUser(String username){
        for (User user: userList) {
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }



    public List<User> LoadUsers(){
        List<User> list = new ArrayList<>();

        try {
            File myObj = new File("users.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] parts = data.split(";");

                User user = null;

                if (Boolean.parseBoolean(parts[2])){
                    user = new AdminUser(parts[0],parts[1]);
                }else{
                    user = new MemberUser(parts[0],parts[1]);
                }

                list.add(user);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return list;
    }

    public void SaveUsers(){
        try {
            FileWriter myWriter = new FileWriter("users.txt");
            for (User user: userList) {

                boolean isAdmin = user instanceof AdminUser;

                myWriter.write(user.getUsername()+";"+ user.getPassword()+";"+isAdmin+"\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }




}
