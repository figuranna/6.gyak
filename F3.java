/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f3;
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author admin
 */

/*
Készítsen programot, amely kiszámítja egy szám négyzetgyökét (Math.sqrt()). Írjon ki
hibaüzenetet, ha a gyökvonás eredménytelen (pl. negatív számot adtunk meg) alkalmazza
a Double.isNaN() metódust. Használja a try, catch és finally kulcsszavakat.
*/

public class F3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Nincsen alaklmazva a Double.isNaN() metódus.
        
        Double szam;
        Scanner bill = new Scanner(System.in);
        out.println("Kérem adjon meg egy számot: ");
        szam = bill.nextDouble();
        try{
            if(szam<0) throw new HibásÉrték();
            out.printf("Négyzetgyöke: "+ Math.sqrt(szam)+ "\n\n");
        }
        catch (HibásÉrték error){
            out.println("Nem lehetséges a gyökvonás.");
        }
        finally{
        out.println("\n\nVÉGE");
        }
    } 
}
class HibásÉrték extends Exception{}