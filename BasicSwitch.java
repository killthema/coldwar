package jo;

public class BasicSwitch {
    public static void main(String[] args) {

        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("평일입니다");
                break;
            case 6:
            case 7:
                System.out.println("주말입니다");
                break;
            default:
                System.out.println("잘못된 요일입니다");
        }




    }
}
