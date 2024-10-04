import java.util.Scanner;
public class Bai6_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("How tall are you?");
        double height = keyboard.nextDouble();

        System.out.println("Mr/Mrs. " + name +", " + age + ". Your height is " + height + ".");
        keyboard.close();
    }
}
