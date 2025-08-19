package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        char[] vogal = { 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' };
        char[] consoante = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L',
                'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z', 'b', 'c', 'd', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z', };

        System.out.println("Entre com uma letra: ");
        char letra = scan.next().charAt(0);

        boolean ehVogal = false;
        boolean ehConsoante = false;

        for (char v : vogal) {
            if (letra == v) {
                ehVogal = true;
                break;
            }
        }

        for (char c : consoante) {
            if (letra == c) {
                ehConsoante = true;
                break;
            }
        }

        if (ehVogal) {
            System.out.println("É uma vogal.");
        } else if (ehConsoante) {
            System.out.println("É uma consoante.");
        } else {
            System.out.println("Não é uma letra válida.");
        }

        scan.close();
    }
}

