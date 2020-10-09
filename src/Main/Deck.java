package Main;
import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card{

    public void shufle(ArrayList<String> Cards) {
        Collections.shuffle(Cards);
        System.out.println("**********Metodo shuffle*******" +
                "\n" +     "Se mezclo el deck");
    }
    public void head(ArrayList<String> Cards){
        System.out.println("**********Metodo head*******\n" +Cards.get(1));
        Cards.remove(1);
        System.out.println("Quedan " + Cards.size());
    }
    public void pick(ArrayList<String> Cards){
        Collections.shuffle(Cards);
        System.out.println("**********Metodo pick*******\n" + Cards.get(5));
        Cards.remove(5);
        System.out.println("Quedan " + Cards.size());
    }
    public void hand(ArrayList<String> Cards){
        System.out.println("**********Metodo shuffle*******");
        for (int i=0; i<5; i++) {
            System.out.println(Cards.get(i));
            Cards.remove(i);
        }
        System.out.println("Quedan " + Cards.size());
    }
}
