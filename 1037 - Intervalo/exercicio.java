import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();

		if (numero < 0 || numero > 100) {
			System.out.println("Fora de intervalo");
		} else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else if (numero <= 100.0) {
			System.out.println("Intervalo (75,100]");
		}

		sc.close();
	}
}