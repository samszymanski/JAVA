import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
	
		public class Main {
		 
		    public static <A> void main(String[] args) throws IOException {
		    	
		    	Locale.setDefault(Locale.US);
		        Scanner sc = new Scanner(System.in);
		        double A, B, mediaTotal;
		        
		        A = sc.nextDouble();
		        B = sc.nextDouble();
		        
		        mediaTotal = ((A * 3.5 + B * 7.5) / 11);
		        
		        System.out.printf("MEDIA = %.5f\n", mediaTotal);
		        
		        sc.close();
	
	}
}