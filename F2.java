/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package f2;
import static java.lang.System.out; 
import java.util.Scanner; 
/**
 *
 * @author admin
 */
public class F2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner billentyu = new Scanner (System.in);
        int[] tomb = new int[100];
        int db = 0;
        // Feltöltés
        do{
            out.printf("Kérem a %d. számot: ",db+1);
            try{
            tomb[db] = billentyu.nextInt();
        }
        catch (Exception error){
            out.println("Nem egész számot adott meg.\n\n");
            break;
        }
        db++;
        }while(true);
        // Kiírás
        for(int i=0; i<db ;i++){
            out.println(tomb[i]);
        }
    }
    
}
