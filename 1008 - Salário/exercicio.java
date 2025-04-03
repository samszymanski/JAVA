import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int funcionario, hrsTrabalhadas;
    double valorHora, salario;
    
    funcionario = sc.nextInt();
    hrsTrabalhadas = sc.nextInt();
    valorHora = sc.nextDouble();
    
    salario = hrsTrabalhadas * valorHora;
    
    System.out.println("NUMBER = " + funcionario);
    System.out.printf("SALARY = U$ %.2f\n", salario);
    
    		
    		
    sc.close();
    }
 
}