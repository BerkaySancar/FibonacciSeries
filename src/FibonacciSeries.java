import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Series lenght: ");
        int lenght = input.nextInt();
        int n1 = 0, n2 = 1, sum;
        System.out.print(n1);
        System.out.print(" " + n2);
        for (int i = 2; i <= lenght; i++){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(" " + sum);
        }
    }
}
