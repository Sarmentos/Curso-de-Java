package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double[] numeros = imprimirNumeros();
        double maior = imprimirResultado(numeros);
        System.out.println("O maior número é: " + maior);
    }

    public static double[] imprimirNumeros() {
        double[] valores = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            valores[i] = scan.nextDouble();
        }
        return valores;
    }

    public static double imprimirResultado(double[] numeros) {
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
