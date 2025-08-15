package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a temperatura em graus Farenheit");
        double fahrenheit = scan.nextDouble();

        double celsius = 5 * (fahrenheit - 32) / 9;

        System.out.println("A temperatura em graus Celsius e: " + celsius);
        scan.close();
    }
}
