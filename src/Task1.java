import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int input = scan.nextInt();
        if (input > 7) {
            System.out.println("Привет");
        }
    }
}
