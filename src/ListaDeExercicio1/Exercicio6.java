package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double salarioHora = scan.nextDouble();
        
        System.out.println("Quantas horas você trabalha por mes? ");
        double horasTrabalhadas = scan.nextDouble();
        
        double salarioMensal = salarioHora * horasTrabalhadas;

        System.out.println("Seu salário mensal é: " + salarioMensal);
        scan.close();
    }
}
