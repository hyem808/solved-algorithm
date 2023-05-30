package Class2;

import java.util.*;

/**
 * 이항계수를 구하는 문제
 *
 * 점화식을 이용하여 해결하였습니다.
 *
 *
 * 참고 : https://rh-tn.tistory.com/32
 *
 * TODO : 재귀로 구현해보기!
 */
public class BinomialCoefficient_11050 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(factorial(n)/(factorial(k)*factorial(n-k)));
    }

    public static int factorial (int num){
        int factorial = 1;
        for(int i = 0; i < num; i++){
            factorial *= num - i;
        }
        return factorial;
    }
}
