
package operaciones2;

import java.util.Scanner;

public class Operaciones2 {

    public static void main(String[] args) {
     double num1, num2, res, mul, div;
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        num1=entrada.nextDouble();
        System.out.println("Ingrese el numero 2:");
        num2=entrada.nextDouble();
        res=num1-num2;
        System.out.println("rest="+res);
       
        System.out.println("Ingrese el numero 1:");
        num1=entrada.nextDouble();
        System.out.println("Ingrese el numero 2:");
        num2=entrada.nextDouble();
        mul=num1*num2;
        System.out.println("mul="+mul);
           
        System.out.println("Ingrese el numero 1:");
        num1=entrada.nextDouble();
        System.out.println("Ingrese el numero 2:");
        num2=entrada.nextDouble();
        div=num1/num2;
        System.out.println("div="+div);
        
       
       
        
    }
    
}
