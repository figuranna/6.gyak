/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f1;
import static java.lang.System.out; 
import java.util.Scanner; 
/**
 *
 * @author admin
 */

/*
Készítsen programot, amelyben egy listát (dinamikos tömböt) feltölt tetszőleges számú
elemmel. Kezelje le, ha lekérdezésnél (lista.get(szam)) a szám nagyobb, mint az elemek
száma. Írjon ki a hibának megfelelő hibaüzenetet. Használja a try, catch és finally
kulcsszavakat.
*/

public class F1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // lista.get(szam) akármi nincsen alkalmazva.
        
        final int MAX = 100;
        int[] elemek = new int[MAX];
        
        Scanner billentyu = new Scanner (System.in);
        try{
          for(int i = 0; i<MAX; i++){
            out.print("Kérem a számot: ");
            elemek[i] = billentyu.nextInt();
            if(elemek[i]>MAX){
                throw new HibásÉrték();
            }
            } 
        }
        catch (HibásÉrték error){
            out.println("Hiba----");
        }
        finally{
            out.println("\n\nVÉGE");
        }
    }
    
}
class HibásÉrték extends Exception{}