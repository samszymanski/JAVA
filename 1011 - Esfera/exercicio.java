import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double esfera, R;
   
    R = sc.nextDouble();
   
    esfera = (4/3.0) * 3.14159 * (R * R *R );

    System.out.printf("VOLUME = %.3f%n", esfera);
    		
    sc.close();
    }
 
}