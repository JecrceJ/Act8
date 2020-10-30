package Main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {                                                      //Creacion de la clase principal
    public static void main(String[] args) {                                    //Metodo principal
        ArrayList<String> Cards;
        int sel;
        Deck deck = new Deck();                                         //Iniciacion de las clases
        Card card = new Card();
        Cards = card.collection();
        deck.shufle(Cards);
        System.out.println("Bienvenido a Poker! \n");
        do {
            sel = showMenu();
            switch (sel) {
                case 1 -> deck.shufle(Cards);
                case 2 -> deck.head(Cards);
                case 3 -> deck.pick(Cards);
                case 4 -> deck.hand(Cards);
            }
        } while (sel != 0);
    }

    public static int showMenu() throws InputMismatchException{
        try {
            Scanner sc = new Scanner(System.in);
            int a;
            System.out.println("Selecciona una opcion:\n" +
                    "1 Mezclar deck\n" +
                    "2 Sacar una carta\n" +
                    "3 Carta al azar\n" +
                    "4 Generar una mano de 5 cartas\n" +
                    "0 Salir");

            a = sc.nextInt();
            if (a>4)
                System.out.println("Ingrese una opcion del menu");
            return a;
        } catch (InputMismatchException e) {
            System.out.println("Es necesario que digite una opcion del menu");
        }
        return 9;
    }
}
