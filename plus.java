import java.util.Scanner;

public class plus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 n을 입력해주세요");
        int n =scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;  // 1 대신 i

        }
        System.out.println("1부터 " + n + "까지의 합: " + sum);

    }
}