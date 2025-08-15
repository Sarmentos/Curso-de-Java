package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        for(int i = 0; i < 2; i++) {
            System.out.println("Entre com o numero: ");
            int num = scan.nextInt();
            soma += num;
        }
        System.out.println("Soma: " + soma);

        scan.close();
    }
}
