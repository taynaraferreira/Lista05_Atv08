import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        String numero = teclado.nextLine();
        System.out.println("Quantidade de dígitos: "+numero.length());
        
        teclado.close();
    }
}
