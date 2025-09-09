public class study03 {
    public static void main(String[] args) {
        int hours = 4;
        boolean weekend = true;
        boolean member = false;
        int price = 1000 * hours;

        // 3시간 경과 10% 할인
        if(hours >= 3) {
            price = (int) (price * 0.9);
            System.out.println("3시간 경과시 10% 할인");
        }

        // 주말 방문시 20% 할인
        if(weekend) {
            price = (int) (price * 0.8);
            System.out.println("주말 방문시 20% 할인");
        }

        // 멤버 할인 (독립적)
        if(member) {
            price = price - 500;
            System.out.println("멤버면 추가로 500원 할인");
        }

        System.out.println("최종 요금: " + price + "원");
    }
}