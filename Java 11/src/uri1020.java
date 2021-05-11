/**
 * uri1020
 */
import java.util.Scanner;
public class uri1020 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        int a = n / 365;
        n = n - a * 365;

        int m = n / 30;
        n = n - m * 30;

        int d = n;

        System.out.println(a + " ano(s)");
        System.out.println(m + " mes(es)");
        System.out.println(d + " dia(s)");

        leitor.close();
    }
    
}