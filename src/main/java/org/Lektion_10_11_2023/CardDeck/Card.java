package org.Lektion_10_11_2023.CardDeck;

public class Card {

    //0 = hjärter
    //1 = ruter
    //2 = spader
    //3 = klöver

    public int suite;
    public int value;

    public Card(int suite, int value) {
        this.suite = suite;
        this.value = value;
    }

    @Override
    public String toString() {
        // suite = 0
        // value = 0

        String suiteString = "";
        String valueString = "";

        switch (suite){
            case 0:
                suiteString = "Hjärter";
                break;
            case 1:
                suiteString = "Ruter";
                break;
            case 2:
                suiteString = "Spader";
                break;
            case 3:
                suiteString = "Klöver";
                break;
        }

        switch (value){
            case 0:
                valueString = "2";
                break;
            case 1:
                valueString = "3";
                break;
            case 2:
                valueString = "4";
                break;
            case 3:
                valueString = "5";
                break;
            case 4:
                valueString = "6";
                break;
            case 5:
                valueString = "7";
                break;
            case 6:
                valueString = "8";
                break;
            case 7:
                valueString = "9";
                break;
            case 8:
                valueString = "10";
                break;
            case 9:
                valueString = "Kn";
                break;
            case 10:
                valueString = "D";
                break;
            case 11:
                valueString = "K";
                break;
            case 12:
                valueString = "E";
                break;

        }
        return suiteString+" "+valueString;
    }
}
