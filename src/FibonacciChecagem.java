import java.util.Scanner;

public class FibonacciChecagem {
    public static boolean pertenceFibonacci(int numero){
        if(numero<0){
            return false;
        }

        int a = 0;
        int b = 1;

        if(numero==0 || numero == b){
            return true;
        }

        while(b<= numero){
            int proximo = a+b;
            a = b;
            b = proximo;

            if (b == numero){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

    do {
        System.out.println("Informe o número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " Pertence a sequência de Fibonacci");
        } else {
            System.out.println(numero + " Não pertence a sequência de Fibonacci");
        }

        System.out.println("Precisa verificar outro número? (s/n)");
        continuar = scanner.next();

    } while(continuar.equalsIgnoreCase("s"));

    scanner.close();
    System.out.println("Fim");
    }
}
