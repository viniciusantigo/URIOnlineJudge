import java.util.Scanner;
import java.util.Locale; 

public class uri1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;
        raio = sc.nextDouble();
        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("AREA=%.4f%n", area);

        sc.close();
    }
}