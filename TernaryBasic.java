package jo;

public class TernaryBasic {
    public static void main(String[] args) {
        int age = 15;
        int basicFee = 1000;

        // 삼항 연산자를 사용해 최종 요금 계산
        int finalFee = (age < 18) ? basicFee / 2 : basicFee;

        // "요금: 000원" 형태로 출력
        System.out.println("요금: " + finalFee + "원");


    }
}
