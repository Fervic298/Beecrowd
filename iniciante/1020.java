import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int valorDias = sc.nextInt();
        
        int valorAno = valorDias / 365;
        valorDias = valorDias % 365;
        
        int valorMeses = valorDias / 30;
        valorDias = valorDias % 30;
        
        
        System.out.println(valorAno + " ano(s)");
        System.out.println(valorMeses + " mes(es)");
        System.out.println(valorDias + " dia(s)");

    }
 
}
