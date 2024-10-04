import java.util.Scanner;
public class Bai6_6 {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Nhap kich co cua mang mxn");
        int m = keyBoard.nextInt();
        int n = keyBoard.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];

        int[][] sumOfMatrices = new int[m][n];

        System.out.println("Nhap vao mang a: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = keyBoard.nextInt();
            }
        }

        System.out.println("Nhap vao mang b: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = keyBoard.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumOfMatrices[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Mang sau khi cong lai la: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sumOfMatrices[i][j] + " ");
            }
            System.out.println();
        }
    }
}
