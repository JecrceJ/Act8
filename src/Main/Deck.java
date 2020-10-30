package Main;
import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card{

    public void shufle(ArrayList<String> Cards) {
        Collections.shuffle(Cards);
        System.out.println("**********Metodo shuffle*******" +
                "\n" +     "Se mezclo el deck \n");
    }
    public void head(ArrayList<String> Cards) throws IndexOutOfBoundsException{
        try {
            System.out.println("**********Metodo head*******\n" + Cards.get(1));
            Cards.remove(1);
            System.out.println("Quedan " + Cards.size() + "\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("NO hay mas cartas en el deck");
            System.exit(0);
        }
    }
    public void pick(ArrayList<String> Cards) throws IndexOutOfBoundsException{
        try {
            Collections.shuffle(Cards);
            System.out.println("**********Metodo pick*******\n" + Cards.get(5));
            Cards.remove(5);
            System.out.println("Quedan " + Cards.size() + " \n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("NO hay mas cartas en el deck");
            System.exit(0);
        }
    }
    public void hand(ArrayList<String> Cards) throws IndexOutOfBoundsException{
        try {
            System.out.println("**********Metodo shuffle*******");
            for (int i = 0; i < 5; i++) {
                System.out.println(Cards.get(i));
                Cards.remove(i);
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("***************************************" +
                             "\n******No hay mas cartas en el deck*****" +
                             "\n***************************************");
            System.exit(0);
        }
        System.out.println("Quedan " + Cards.size() +"\n");
    }
}
