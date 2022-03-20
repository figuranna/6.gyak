/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f4;
import static java.lang.System.out; 
import java.util.Scanner; 
/**
 *
 * @author admin
 */
public class F4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String szoveg;
        int szam = 0;
        
        try{
            Scanner billentyu = new Scanner (System.in);
            out.println("Kérem adjon meg egy számot: ");
            szoveg = billentyu.next();
            szam = Integer.parseInt(szoveg);
            out.println("Szám: " + szam);
        }
        catch(NumberFormatException  error){
            out.println("Helytelen karakter.");
        }
        
    }
    
}
