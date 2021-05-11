import java.util.Scanner; 
import java.util.Locale;

public class uri1038 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

        int codigo, quantidade;
        double preco;

        codigo = leitor.nextInt();
        quantidade = leitor.nextInt();

        if (codigo == 1){
            preco = quantidade * 4;
            System.out.printf("Total: R$ %.2f", preco);
        }
        else if (codigo == 2){
            preco = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f", preco);
        }
        else if (codigo == 3){
            preco = quantidade * 5.0;
            System.out.printf("Total: R$ %.2f", preco);
        }
        else if (codigo == 4){
            preco = quantidade * 2.0;
            System.out.printf("Total: R$ %.2f", preco);
        }
        else if (codigo == 5){
            preco = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f", preco);
        }

        System.out.println();
        leitor.close();
    }
}
