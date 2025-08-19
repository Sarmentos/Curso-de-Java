package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTRE COM DADOS DA ALTURA : ");
        double altura = scan.nextDouble();

        System.out.println("ENTE COM OS DADOS DO SEXO (H/M): ");
        var sexoMasculino = scan.next().equalsIgnoreCase("h");

        scan.close();
    }
}
