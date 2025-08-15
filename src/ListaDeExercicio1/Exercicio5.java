package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a AREA de um quadrado: ");
        double area = scan.nextDouble();
        
        double dobroArea = area * 2;
        System.out.println("O dobro da área é: " + dobroArea);
        scan.close();
    }
}
