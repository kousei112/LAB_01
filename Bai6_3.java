import java.util.Scanner;
public class Bai6_3 {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua tam giac: ");
        int height = keyBoard.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        keyBoard.close();
    }
}
