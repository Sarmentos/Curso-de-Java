package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTRE COM DADOS DA ALTURA : ");
        double altura = scan.nextDouble();

        System.out.println("Entre com os dados do seu sexo (H/M): ");
        var sexo = scan.next();

        System.out.println("Entre com seu peso em (KG): ");
        var pesoAtual = scan.nextDouble();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("H")) {
          pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido!");
            scan.close();
            return;
        }

        System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);

        if (pesoAtual > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else if (pesoAtual < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal!");
        }

        scan.close();
    }
}
