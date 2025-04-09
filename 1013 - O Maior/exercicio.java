import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
  
    Scanner sc = new Scanner(System.in);
    int A, B, C, D, E;
   
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    
    D = (A + B + Math.abs (A - B)) / 2;
    E = (D + C + Math.abs (D - C)) / 2;

    System.out.println(E + " eh o maior");
    
    sc.close();
    }
 
}