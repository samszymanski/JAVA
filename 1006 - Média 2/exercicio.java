import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double A, B, C, mediaTotal;
    
    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();
    
    mediaTotal = ((A * 2 + B * 3 + C * 5) / 10);
    
    System.out.printf("MEDIA = %.1f\n", mediaTotal);
     
    }
 
}