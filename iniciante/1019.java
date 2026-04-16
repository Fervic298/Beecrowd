import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner sc = new Scanner(System.in);
         
        int totalSeg = sc.nextInt();
        
        int horas = totalSeg / 3600;
        totalSeg = totalSeg % 3600;
        
        int minutos = totalSeg / 60;
        totalSeg = totalSeg % 60;
        
        int segundos = totalSeg;
        
        System.out.println(horas+":"+minutos+":"+segundos);

    }
 
}
