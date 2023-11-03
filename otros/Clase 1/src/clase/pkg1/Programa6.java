package clase.pkg1;

import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double h,m,hp;
        System.out.println("INGRESE HORA: ");
        h= teclado.nextInt();
        System.out.println("Ingrese minutos: ");
        m= teclado.nextInt();
        
        if(m >0) h=h+1;
        hp= h*2.5;
        System.out.println("pago: "+hp);
    }
    
}
