import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner sc = new Scanner(System.in);
         
         int horas = sc.nextInt();
         int velocidade = sc.nextInt();
         
         double velocidadeMedia = velocidade * horas;
         
         double resultado = velocidadeMedia / 12;
         
         System.out.printf("%.3f\n", resultado);

    }
 
}
