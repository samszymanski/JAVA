import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
   
    Scanner sc = new Scanner(System.in);
    int x, ano, mes, dias, resto;
    
    x = sc.nextInt();
   
    ano = x / 365;
    resto = x % 365;
    mes = resto / 30;
    dias = resto % 30; 
    
   
    System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dias);
    
    sc.close();
    }
}