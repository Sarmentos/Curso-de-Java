package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        
        System.out.println("Entre com a temperatura em graus Celsius: ");
        double temperaturaCelsius = scan.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        
        System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);
        scan.close();
    }   
}
