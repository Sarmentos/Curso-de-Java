package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        
        double maiorNumero = 0;
        for(int i = 1; i < 3; i++) {
            System.out.println("Digite um numero " + i + ":");
            double numero = scan.nextDouble();
            maiorNumero += numero;
        }
        maiorNumero = maiorNumero;
        
        scan.close();
    }   
}
