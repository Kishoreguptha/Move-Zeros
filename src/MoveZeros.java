import java.util.Scanner;

public class MoveZeros {
    public static void moveZeros(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[n];
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        while (nonZeroIndex < n) {
            arr[nonZeroIndex++] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        moveZeros(n);
}
}