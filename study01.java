public class study01    {

    public static void main(String[]args) {


                int month = 7;

                if (month >= 3 && month <= 5) {
                    System.out.println(month + "월은 봄입니다.");
                } else if (month >= 6 && month <= 8) {
                    System.out.println(month + "월은 여름입니다."); // 마침표 추가
                } else if (month >= 9 && month <= 11) {
                    System.out.println(month + "월은 가을입니다."); // month + 추가
                } else if (month == 12 || month == 1 || month == 2) {
                    System.out.println(month + "월은 겨울입니다."); // month + 추가, 띄어쓰기 수정
                } else {
                    System.out.println("잘못된 월입니다."); // 띄어쓰기 수정
                }
            }
        }