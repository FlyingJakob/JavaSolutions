package org.Lektion_10_11_2023.CardDeck;

import java.util.ArrayList;
import java.util.List;

public class CardDeck{

    List<Card> cards = new ArrayList<>();

    public CardDeck(){

        for (int suite = 0; suite < 4; suite++) {
            for (int value = 0; value < 13; value++) {
                Card card = new Card(suite,value);
                cards.add(card);
            }
        }



        System.out.println("Done");

    }

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
    }


}
