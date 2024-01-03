package org.Lektion_15_11_2023;

public class TextUtillity {

    public boolean isPalindrome(String str){


        String formattedString = str.replaceAll("[^a-zA-Z0-9]", " ");
        formattedString = formattedString.replace(" ","");
        StringBuilder stringBuilder = new StringBuilder(formattedString);
        String reversed = stringBuilder.reverse().toString();

        if (reversed.toLowerCase().equals(formattedString.toLowerCase())){
            return true;
        }else {
            return false;
        }

    }
}
