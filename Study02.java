public class Study02 {

    public static void main(String args[]) {

        double height = 1.75; // 미터 단위
        double weight = 70.0; // kg 단위
        double bmi = weight / (height * height);

// 여기에 코드 작성
        if (bmi < 18.5){
            System.out.println("저체중");

        } else if (bmi < 25) {
            System.out.println("정상체중");

        } else if (bmi < 30) {
            System.out.println("과체중");
        } else{
                System.out.println("비만");
            }
        }




    }

