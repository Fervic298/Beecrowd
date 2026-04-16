import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        
        double pesoA = 3.5;
        double pesoB = 7.5;
        
        double media = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);
        
        System.out.printf("MEDIA = %.5f\n", media);
        
    }
 
}
