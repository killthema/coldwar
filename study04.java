public class study04 {
    public static void main(String[] args) {
        int exp = 350;
        int level;

        if (exp < 100) {
            level = 1;
        } else if (exp < 300) {
            level = 2;
        } else if (exp < 500) {
            level = 3;
        } else if (exp < 1000) {
            level = 4;
        } else {
            level = 5;
        }

        switch (level) {
            case 1:
                System.out.println("1레벨 초보자");
                break;
            case 2:
                System.out.println("2레벨 숙련자");
                break;
            case 3:
                System.out.println("3레벨 전문가");
                break;  // 추가
            case 4:
                System.out.println("4레벨 마스터");
                break;  // 추가
            case 5:
                System.out.println("5레벨 전설");
                break;  // 추가 (선택사항)
        }
            // 나머지 case들 추가
        }
    }
