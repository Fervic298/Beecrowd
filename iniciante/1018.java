import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner sc = new Scanner(System.in);
         
        int valorEntrada = sc.nextInt();
        int valorEntradaSalvo = valorEntrada;
        
        int n100, n50, n20, n10, n5, n2, n1;
        
        n100 = valorEntrada / 100;
        
        valorEntrada = valorEntrada % 100;
        
        n50 = valorEntrada / 50;
        
        valorEntrada = valorEntrada % 50;
        
        n20 = valorEntrada / 20;
        
        valorEntrada = valorEntrada % 20;
        
        n10 = valorEntrada / 10;
        
        valorEntrada = valorEntrada % 10;
        
        n5 = valorEntrada / 5;
        
        valorEntrada = valorEntrada % 5;
        
        n2 = valorEntrada / 2;
        
        valorEntrada = valorEntrada % 2;
        
        n1 = valorEntrada / 1;
        
        valorEntrada = valorEntrada % 1;
        
        System.out.println(valorEntradaSalvo);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
        

        

    }
 
}
