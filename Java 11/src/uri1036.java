import java.util.Scanner;
import java.util.Locale;

public class uri1036 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
 
        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f", x2);
            System.out.println();

        }
        sc.close();
    }
}

