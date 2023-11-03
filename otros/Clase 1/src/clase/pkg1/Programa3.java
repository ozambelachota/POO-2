package clase.pkg1;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,u,d,c,m,resto, suma;
        System.out.print("ingrese numero: ");
        numero = teclado.nextInt();
        
        u = numero % 10;
        resto = numero / 10;
        d = resto % 10;
        resto = resto / 10;
        c = resto % 10;
        m = resto / 10;
        
        suma = u + d + c + m;
        System.out.println("la suma de cifra es: "+suma);
    }
    
   
    
}
