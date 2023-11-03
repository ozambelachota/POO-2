package clase.pkg1;

import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hor, min, seg,h,m,s,resto,segrest;
        
        System.out.print("INGRESE HORA: ");
        hor = teclado.nextInt();
        System.out.print("INGRESE MINUTOS: ");
        min = teclado.nextInt();
        System.out.print("INGRESE SEGUNDOS: ");
        seg = teclado.nextInt();
        
        h= 23-hor;
        m=59-min;
        s=60-seg;
        
        
        /**segrest = 86400 - (hor*3600 + min*60 + seg);
        h=segrest/3600;
        resto = segrest%3600;
        m=resto/60;
        s=resto%60;**/
        System.out.println("H:"+h+" M:"+m+" S:"+s);
    }
    
}
