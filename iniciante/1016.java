import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int velocidade = sc.nextInt();
        
        int resultado = velocidade * 2;
        
        System.out.println(resultado + " minutos");
        
    }
 
}
