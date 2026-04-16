import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        double numero3 = sc.nextDouble();
        
        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 5;
        
        double media = (numero1 * peso1 + numero2 * peso2 + numero3 * peso3) / (peso1 + peso2 + peso3);
        
        System.out.printf("MEDIA = %.1f\n", media);
 
    }
 
}
