package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double media = 0;
        for(int i = 1; i < 5; i++) {
            System.out.println("Digite a nota do aluno " + i + ":");
            double nota = scan.nextDouble();
            media += nota;
        }
        media = media / 4;

        System.out.println("A media das notas e: " + media);
        scan.close();
    }
}
