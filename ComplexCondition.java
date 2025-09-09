package jo;

public class ComplexCondition {

    public static void main(String[] args) {
        int age = 16;
        boolean hasCard = true;
        int borrowedBooks = 3;

        // 최종 대출 가능 여부를 저장할 변수
        boolean canBorrow = ( (age >= 14 && hasCard) || (age >= 18) ) && (borrowedBooks < 5);

        if (canBorrow) {
            System.out.println("도서 대출이 가능합니다.");
        } else {
            System.out.println("도서 대출이 불가능합니다.");
        }
    }
}