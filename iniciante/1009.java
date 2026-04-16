import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        
        String nome = sc.next();
        
   
        double salarioFixo = sc.nextDouble();
        
        
        double totalDeVendas = sc.nextDouble();
    
        double comissao = totalDeVendas * 0.15;
        
        double totalReceber = comissao + salarioFixo;
        
        System.out.printf("TOTAL = R$ %.2f\n", totalReceber);
    }
 
}
