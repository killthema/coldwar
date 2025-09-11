import java.util.Scanner;

public class IntegerTtpes {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를  입력하세요");

        double num1 = scanner.nextDouble();


        System.out.println("두 번째 숫자를 입력하세요");
        double num2 = scanner.nextDouble();

        System.out.println("연산자를 (+,-,*,/를 입력하세요");

        String operator = scanner.next();

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;  // 이게 빠졌네요!

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 != 0) {
                    result = num1 / num2;

                } else {
                    System.out.println("오류 발생 0으로 나누는건 불가능하다");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("오류 제대로 된 연산자를 입력해 주셨으면 합니다.");
                validOperation = false;
                break;

                }
                if(validOperation) {
                    System.out.println("결과" + result);
                }
                scanner.close();
        }


    }

