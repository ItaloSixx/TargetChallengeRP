import java.util.Scanner;
public class ChecarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int count = contarOcorrenciasA(input);

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece.");
        }

        scanner.close();
    }

    public static int contarOcorrenciasA(String str) {
        int contador = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        return contador;
    }
}
