package org.Lektion_20_11_2023;

import java.sql.*;

public class Databaser {
    public static void main(String[] args) {
        //createDatabase();
        addStudent("Lisa",11,"B");
        printStudents();
    }

    public static void createDatabase(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            Statement stmt = conn.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INTEGER PRIMARY KEY," +
                    "name TEXT NOT NULL," +
                    "age INTEGER," +
                    "grade TEXT)";
            stmt.execute(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addStudent(String name,int age,String grade){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            String sql = "INSERT INTO students(name, age, grade) VALUES(?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.setString(3,grade);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public static void printStudents(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            Statement stmt = conn.createStatement();
            String sql = "SELECT name, age FROM students";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int age = rs.getInt("age");
                String name = rs.getString("name");
                System.out.println("Age : "+age+" Name : "+name);
            }
            rs.close();
            stmt.close();
            conn.close();




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
