import java.util.Scanner;

public class downgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 단을 출력할까요?");
        int dan = scanner.nextInt();

        System.out.println("*** " + dan + "단 ***");
        for(int n = 1; n <= 9; n++) {
            System.out.println(dan + " x " + n + " = " + (dan * n));
        }

        scanner.close();
    }
}