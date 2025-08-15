package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o vlaor em metros: ");
        double metros = scan.nextDouble();
        
        double centimetro = metros * 100;

        System.out.println(metros + " metros é igual a " + centimetro + " centros" );
        scan.close();
    }
}
