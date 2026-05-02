import java.util.Scanner;
// Fibonacci serisi : 0 1 1 2 3 5 8 13 21 34 55 89 144 şeklinde ilerler
public class Fibonacci {

    public static int fibonacci(int sayi) {
        if (sayi <= 1) {
            return sayi;
        }
        return fibonacci(sayi - 1) + fibonacci(sayi - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaça kadar sıralansın: ");
        int sayi = sc.nextInt();
        System.out.println("Fibonacci Serisi (Recursive):");
        for (int i = 0; i < sayi; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
