public class study05 {

    public static void main(String[] args) {
        double temperature = 25.0;
        String mode = "C";

// 단계별로 생각해보기:
// 1. 조건: mode가 "C"인가?
// 2. 참일때: 섭씨→화씨 변환 (temperature * 9/5) + 32
// 3. 거짓일때: 화씨→섭씨 변환 (temperature - 32) * 5/9

        double result = mode.equals("C") ? (temperature * 9.0 / 5.0) + 32 : (temperature - 32) * 5.0 / 9.0;

        System.out.println("변환 결과: " + result);
    }
}