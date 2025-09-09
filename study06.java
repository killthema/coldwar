public class study06 {
    public static void main(String[]args){
        int menuNumber = 2;

        switch (menuNumber){
            case 1:
                System.out.println("아메리카노 3000원");
                break;
            case 2:
            case 3:
                if (menuNumber == 2) {
                    System.out.println("카페라떼 4000원");
                } else {
                    System.out.println("카푸치노 4000원");
                }
                break;
            case 4:
                System.out.println("에스프레소 2500원");
                break;
            default:
                System.out.println("메뉴에 없습니다");
        }
    }
}