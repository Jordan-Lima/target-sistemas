import java.util.Scanner;

public class TargetEx002 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numberToCheck = scanner.nextInt();

        System.out.println("Sequência Fibonacci até atingir ou ultrapassar " + numberToCheck + ":");

        printFibonacciUntilNumber(numberToCheck);

        if (isFibonacci(numberToCheck)) {
            System.out.println(numberToCheck + " está na sequência de Fibonacci.");
        } else {
            System.out.println(numberToCheck + " não está na sequência de Fibonacci.");
        }
    }

    public static void printFibonacciUntilNumber(int target) {
        int a = 0, b = 1;

        while (a <= target) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println();
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;

        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return a == n;
    }
}