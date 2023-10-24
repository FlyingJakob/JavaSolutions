package org.Lektion_24_10_2023;

public class Uppgift6 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("detartrated"));
    }

    public static boolean isPalindrome(String text){

        System.out.println(text);

        if (text.length()==0||text.length()==1){
            return true;
        }

        char first = text.charAt(0);
        char last = text.charAt(text.length()-1);

        if (first==last){
            if (isPalindrome(text.substring(1,text.length()-1))){
                return true;
            } else{
                return false;
            }

        }else{
            return false;
        }

    }


}
