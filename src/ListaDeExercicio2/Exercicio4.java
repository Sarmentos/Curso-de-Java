package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Entre com a primeira nota parcial: ");
        var primeiraNotaParcial = scan.nextInt();

        System.out.println("Entre com a seugunda nota parcial: ");
        var segundaNotaParcial = scan.nextInt();

        var mediaParcial = (primeiraNotaParcial + segundaNotaParcial) / 2;
        var aprovado = mediaParcial >= 7;
        
        if (aprovado) {
            System.out.println("Aprovado");
        }else if (!aprovado) {
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado com destinção");
        }

        scan.close();
    }
}
