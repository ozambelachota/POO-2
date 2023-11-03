package clase.pkg1;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cantidad,decimal;
        int parteEntera,parteDecimal,b100,b50,b20,b10,m5,m2,m1,m05,m02,m01;
        System.out.println("INGRESE CANTIDAD: ");
        cantidad = teclado.nextDouble();
      
        
        parteEntera = (int)(cantidad);
        decimal = cantidad - parteEntera;
        System.out.println(""+decimal);
        b100=parteEntera/100;
        parteEntera=parteEntera%100;
        b50=parteEntera/50;
        parteEntera=parteEntera%50;
        b20=parteEntera/20;
        parteEntera=parteEntera%20;
        b10=parteEntera/10;
        parteEntera=parteEntera%10;
        m5=parteEntera/5;
        parteEntera=parteEntera%5;
        m2=parteEntera/2;
        parteEntera=parteEntera%2;
        m1=parteEntera;
        
        parteDecimal= (int)(decimal*1000 +0.5);
        m05 = parteDecimal/500;
        parteDecimal=parteDecimal%500;
        m02 = parteDecimal/200;
        parteDecimal=parteDecimal%200;
        m01 = parteDecimal/100;
        
        System.out.println("b100: "+ b100);
        System.out.println("b50: "+ b50);
        System.out.println("b20: "+ b20);
        System.out.println("b10: "+ b10);
        System.out.println("m5: "+ m5);
        System.out.println("m2: "+ m2);
        System.out.println("m1: "+ m1);
        System.out.println("m05: "+ m05);
        System.out.println("m02: "+ m02);
        System.out.println("m01: "+ m01);
        
                
    }
    
}
