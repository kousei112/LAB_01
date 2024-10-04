import java.util.Scanner;
public class Bai6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter year: ");
        int year = scanner.nextInt();
        System.out.print("Please enter month: ");
        int month = scanner.nextInt();

        String days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "30";
                break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = "29";
                } else {
                    days = "28";
                }
                break;
            default:
                System.out.println("INVALID");
        }
        System.out.println("The month you enterd has " + days + " days");
        scanner.close();
    }
}
