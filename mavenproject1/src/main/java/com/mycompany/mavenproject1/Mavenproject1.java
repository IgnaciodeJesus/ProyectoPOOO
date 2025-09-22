package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {
    public static void main(String[] args) {
        System.out.println("Area del Rectangulo");
        double base=0.0, altura=0.0;
        double area=0.0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese base: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese altura: ");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.println("El area es: " + area);
        if (base > altura) {
            System.out.println("El mayor es " + base);
        }
        else {
            if (altura > base) {
                System.out.println("El mayor es: " +altura);
            }
            else {
                System.out.println("Ambos son iguales");
            }
        } 
            
   }
}
