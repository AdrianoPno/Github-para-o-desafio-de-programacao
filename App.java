import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner entrada = new Scanner(System.in);
        
		System.out.println("Digite o numero de degraus:");
		int numero = entrada.nextInt();
		
        
        for (int i=1; i<= numero; i++) {
            
            for (int j=numero-i; j >= 1; j--)
                System.out.print(" ");
                for (int jw =1; jw <= i; jw++)
                System.out.print("*");
                System.out.println(" ");
        entrada.close();
        }
    }
}
