import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int soma = 0;
        for(int i = 0; i < 2; i++) {
            System.out.println("Entre com o numero: ");
            int num = scan.nextInt();
            soma += num;
        }
        System.out.println("Soma: " + soma);
    }
}
