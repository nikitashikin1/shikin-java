import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя:");
        String input = scan.nextLine();
        if (input.equals("Вячеслав")) {
            System.out.println("Привет, " + input);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}