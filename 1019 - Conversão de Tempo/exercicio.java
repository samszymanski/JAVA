import java.io.IOException;
import java.util.Scanner;

public class Main{
 
    public static void main(String[] args) throws IOException {
   
    Scanner sc = new Scanner(System.in);
    int segundos, horas, minutos;
    
    segundos = sc.nextInt();
   
    horas = segundos / 3600;
    segundos = segundos % 3600;
    
    minutos = segundos / 60;
    segundos = segundos % 60;
    
   
    System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    
    sc.close();
    }
}