import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int numeroA = sc.nextInt();
        int numeroB = sc.nextInt();
        int numeroC = sc.nextInt();
        
        int maior = numeroA;
        
        if (numeroB > maior){
            maior = numeroB;
        }
        
        if (numeroC > maior){
            maior = numeroC;
        }
        
        System.out.println(maior + " eh o maior");
        
    }
 
}
