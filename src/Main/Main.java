package Main;

import java.util.ArrayList;

public class Main {                                                     //Creacion de la clase principal
    public static void main(String[] args) {                            //Metodo principal
        ArrayList<String> Cards;
        Deck deck = new Deck();                                   //Iniciacion de la clase calculos como cc
        Card card = new Card();
        Cards=card.collection();
        deck.shufle(Cards);
        deck.head(Cards);
        deck.pick(Cards);
        deck.hand(Cards);
    }
}