package Main;
import java.util.ArrayList;

public class Card extends Main{
    String palo[] = {"treboles", "corazones", "picas", "diamantes"};
    String color[] = {"Rojo", "Negro"};
    String valor[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
    private int i, k, m;

    public ArrayList<String> collection() {
        ArrayList<String> Cards= new ArrayList<String>();;
        for (i = 0; i < 4; i++) {
            if (i==0|i==2) { m=1; }
            if (i==1|i==3) { m=0; }
            for (k = 0; k < 13; k++) {
                    Cards.add((palo[i]) +" " + color[m]+" "+ valor[k]);
            }
        }
        /*    for(Object o : Cards)
            System.out.println(o); */
            return Cards;
    }
}