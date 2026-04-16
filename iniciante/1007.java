import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       
       int valorA = sc.nextInt();
       int valorB = sc.nextInt();
       int valorC = sc.nextInt();
       int valorD = sc.nextInt();
       
       int diferença = valorA * valorB - valorC * valorD;
       
       System.out.println("DIFERENCA = " + diferença);
    }
 
}
