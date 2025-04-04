import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    String nome;
    double salarioFixo, vendas, salario; 
    
    nome = sc.next();
    salarioFixo = sc.nextDouble();
    vendas = sc.nextDouble();
    
    salario = salarioFixo + vendas * 0.15;
    
    System.out.printf("TOTAL = R$ %.2f%n", salario);
    
    		
    sc.close();
    }
 
}