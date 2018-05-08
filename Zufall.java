
package zufallswerte;
import java.util.Random;

public class ZufallsWerte {
    public static void main(String[] args) {
        int [] zufall = new int [100];
        int gerade = 0;
        int ungerade=0;
        int anzahlgerade = 0;
        int anzahlungerade=0;
        int mittelwertgerade = 0;
        int mittelwertungerade=0;
        
        for (int i=0; i<100; i++){
            Random rand = new Random();
            zufall[i] = rand.nextInt(100)+1;
        }
       
        for (int a=0; a<zufall.length; a++){
            if(zufall[a]%2==0) {
            gerade= gerade + zufall[a];
            anzahlgerade +=1;
            }
            else {
            ungerade=ungerade + zufall[a];
            anzahlungerade +=1;
            }
        }
        
         mittelwertgerade=gerade/anzahlgerade;
         mittelwertungerade=ungerade/anzahlungerade;
        
        System.out.println("Summe der geraden Zahlen: " + gerade);
        System.out.println("Summe der ungerade Zahlen: " + ungerade);
        System.out.println("Mittelwert der gerade Zahlen: " + mittelwertgerade);
        System.out.println("Mittelwert der ungeraden Zahlen: " + mittelwertungerade);
        
        
        for (int j=0; j<zufall.length; j++) {
            System.out.print(zufall[j] + " ");
        }
                
        }
    }
