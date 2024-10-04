import java.util.Scanner;
public class Bai6_5 {
    static int partition(int arr[], int left, int right) {
        int mid = (left + right) / 2;
        int pivot = arr[mid];

        int temp = arr[mid];
        arr[mid] = arr[right];
        arr[right] = temp;

        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;

    }
    static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);

            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
    }
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang: ");
        int n = keyBoard.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = keyBoard.nextInt();
        }
        quickSort(array, 0, array.length - 1);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        int average = sum / array.length;
        System.out.print("Cac phan tu cua mang sau khi xep la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Tong cac phan tu trong mang la: " + sum);
        System.out.println("Gia tri trung binh cac phan tu trong mang la: " + average);
    }
}
