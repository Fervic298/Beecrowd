import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int codigo1 = sc.nextInt();
        int numeroPecas1 = sc.nextInt();
        double valorPeça1 = sc.nextDouble();
        
        int codigo2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorPeça2 = sc.nextDouble();
        
        double valorTotal = (valorPeça1 * numeroPecas1) + (valorPeça2 * numeroPecas2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }
 
}
