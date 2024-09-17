import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string qualquer: ");
        String digitada = scanner.nextLine();

        String invertida = inverString(digitada);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    private static String inverString(String digitada) {
        String invertida = "";
        for(int i = digitada.length()-1; i >= 0; i--) {
            invertida += digitada.charAt(i);
        }
        return invertida;
    }
}
