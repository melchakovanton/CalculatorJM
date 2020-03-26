import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение используя римские или арабсике целые числа от 1 до 10 пробел перед  +, -, *, / и после знака. Например, 2 + 4 или II + IX");
        String num1, operator, num2;

        num1 = scan.next();
        operator = scan.next();
        num2 = scan.next();

        ValidateInput.validate(num1, operator, num2);


    }

}