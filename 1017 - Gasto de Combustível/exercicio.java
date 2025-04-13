import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int t, kmh;
    double gasto;
    
    t = sc.nextInt();
    kmh = sc.nextInt();
      
    gasto = (double) kmh * t / 12;

    
    System.out.printf("%.3f\n", gasto);
 
    sc.close();
    }
 
}