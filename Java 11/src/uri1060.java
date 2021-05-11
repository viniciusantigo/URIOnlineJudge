import java.util.Scanner;
import java.util.Locale; 

public class uri1060 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double i, numero, contador;
        contador = 0;

        for (i = 1; i < 7; i ++){
            numero = leitor.nextDouble();
            if (numero >= 0){
                contador += 1;
            }
        }
        System.out.printf("%.0f valores positivos", contador);
        System.out.println();
    }
}
