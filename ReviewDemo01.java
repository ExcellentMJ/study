import java.util.Scanner;
// v0.3
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         boolean isPrime = true;

         for(int k=2; k<number; k++){ // 반복 횟수 2회 감소
             if(number % k ==0) //입력된 수를 k로 나누었을 때 나머지가 0인 경우. 즉, 약수
                 isPrime = false;
         }
         if(isPrime)// isPrime 변수 값이 true이면
             System.out.println(number + "은(는) 소수!");
         else
             System.out.println(number + "은(는) 소수가 아닙니다");
    }
}