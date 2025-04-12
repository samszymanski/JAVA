import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int x, dx;
    
    x = sc.nextInt();
    
    dx = 2 * x;
    
    System.out.println(dx + " minutos");
 
    sc.close();
    }
 
}