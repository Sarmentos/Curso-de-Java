package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double[] numeros = imprimeNumerosP();
        verificarPositivoNegativo(numeros);
    }

    public static double[] imprimeNumerosP() {
        double[] valor = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("digite um valor " + (i + 1) + ":");
            valor[i] = sc.nextDouble();
        }
        return valor;
    }

    public static boolean verificarPositivoNegativo(double[] valor) {
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > 0) {
                System.out.println("O valor " + valor[i] + " é positivo");
            } else if (valor[i] < 0) {
                System.out.println("O valor " + valor[i] + " é negativo");
            } else {
                System.out.println("O valor " + valor[i] + " é zero");
            }
        }
        return true;
    }
}
