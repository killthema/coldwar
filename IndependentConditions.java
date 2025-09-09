package jo;

public class IndependentConditions {

    public static void main(String[] args) {

        int coffeePrice = 4000;

        int customerAge = 16;

        int disount = 0;


        if(coffeePrice >= 3000){

            disount = disount + 100;

            System.out.println("3000원 이상 구매시 포인트 100점 적립");
        }


        if(customerAge < 18){

            disount = 50;
            System.out.println("18세 미만시 50점 추가 적립");
        }

        int finalAmuount = disount + disount ;

            System.out.println("총 적립 포인트" + disount + "점");



    }
}
