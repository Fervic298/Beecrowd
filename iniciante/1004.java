import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        
        int prod = valor1 * valor2;
        
        System.out.println("PROD = " + prod);
    }
 
}
