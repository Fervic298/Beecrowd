import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double posx1 = sc.nextDouble();
        double posy1 = sc.nextDouble();
        double posx2 = sc.nextDouble();
        double posy2 = sc.nextDouble();
        
        double distancia = Math.sqrt
        (Math.pow(posx2 - posx1, 2) + Math.pow(posy2 - posy1, 2));
        
        System.out.printf("%.4f\n", distancia);
    }
 
}
