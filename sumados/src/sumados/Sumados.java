package sumados;
import java.util.Scanner;
public class Sumados {
     public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float num1,num2,rest;
        System.out.print("Ingresa el primer numero: ");
        num1=leer.nextFloat();
        System.out.print("Ingresa el segundo numero: ");
        num2=leer.nextFloat();
        rest=num1+num2;
        System.out.print("la suma es: "+rest);
    }
    
}
