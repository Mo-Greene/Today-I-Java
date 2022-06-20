package sub11;

public class Exam3 {
    public static void main(String[] args) {
        // 1부터 30까지 홀수의 합과 짝수의 합을 구하고 각각 출력하라
        int odd = 0;
        int even = 0;
        for (int i = 0; i <= 30; i++){
            if(i % 2 == 0){
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
