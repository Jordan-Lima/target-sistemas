import java.util.Scanner;

public class TargetEx005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra para inverter: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = inverterPalavra(palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);
    }

    public static String inverterPalavra(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (fim > inicio) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}