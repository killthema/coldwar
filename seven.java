public class seven {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            if(i % 2 != 0){
                continue;  // 홀수면 건너뛰기
            }
            System.out.println(i);
        }
    }
}