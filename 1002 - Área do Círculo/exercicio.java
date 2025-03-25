import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       	     Locale.setDefault(Locale.US);
		     Scanner sc = new Scanner(System.in);
		     double x, y, Pi;
		     y = (double) 2;
		     Pi = (double) 3.14159;
		     
		     x = sc.nextDouble();
		     
		     double A = (double) Math.pow(x, y);
		     
		     double area = Pi * A;
		     
		     System.out.printf("A=%.4f%n", area);
		     
		     sc.close();
 
    }
 
}