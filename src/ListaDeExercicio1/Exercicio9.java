package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a primeira peça: ");
        int peça1 = scan.nextInt();
        
        System.out.println("Entre com a segunda peça: ");
        int peça2 = scan.nextInt();
        
        System.out.println("Entre com a terceira peça: ");
        int peça3 = scan.nextInt();
        
        int dobro = (peça1 * 2) / peça2;
        int triplo = (peça1 * 3) / peça3;
        int elevadoCubo = peça3 * peça3 * peça3;

        System.out.println(" O dobro da primeira peça é: " + dobro);
        System.out.println(" O triplo da primeira peça é: " + triplo);
        System.out.println(" A terceira peça elevada ao cubo é: " + elevadoCubo);
        scan.close();
    }
}
