package Class2;

import java.util.*;

/**
 * 최대공약수와 최소공배수를 구하는 문제
 *
 * 유클리드 호제법을 이용하여 풀었습니다.
 * 유클리드 호제법 : 자연수 A와 B에 대해서 A를 B로 나눈 나머지를 r이라고 한다면
 *                 A, B의 최대공학수와 B, r의 최대공약수는 같다.
 *        ## 최소공배수 : (A*B) / 최대공약수
 *        ## 최대공약수 : B/r
 *
 * 참고 : https://programmer-chocho.tistory.com/9
 */

public class MaxComMinCom_2609 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int minCom = maxCom(num1, num2);
        System.out.println(minCom);
        System.out.println((num1 * num2)/minCom);
    }

    public static int maxCom(int num1, int num2){
        if (num1 % num2 == 0) {
            return num2;
        }
        return maxCom(num2, num1%num2);
    }
}