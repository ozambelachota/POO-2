
package clase.pkg1;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,unidad;
        
        System.out.println("INGRESE UN NUMERO : ");
        numero = teclado.nextInt();
        
        unidad = numero % 10;
        System.out.println("La cifra de la unidad es :"+ unidad);
    }
    
}
