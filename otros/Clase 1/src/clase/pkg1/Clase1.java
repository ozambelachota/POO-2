package clase.pkg1;

import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2,suma;
        System.out.print("INGRESE PRIMER NUMERO: ");
        num1 = teclado.nextInt();
        System.out.print("INGRESE SEGUNDO NUMERO: ");
        num2 = teclado.nextInt();
        
        suma = num1 + num2 ;
        
        System.out.println("LA SUMA ES : "+ suma);

    }
    
}
