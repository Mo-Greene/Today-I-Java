package sub10;

public class Main {
    public static void main(String[] args) {
        // for 문
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);

        // for each 문
        // String day 는 int sum = 0; 같은거 아닐까
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        for (String day : days){
            System.out.println(day);
        }

        // while 문
        int i = 0;                      // i 는 0
        int j = 0;                      // sum 도 0
        while (i < 10){                 // i 는 10 아래로 돌면서
            j += (i + 1);               // j 에 i + 1 한 값을 더해라
            i++;                        // 그리고 i 에 1을 추가하며 돌려라
        }
        System.out.println(j);
    }
}