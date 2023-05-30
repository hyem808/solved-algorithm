package Class1;

import java.util.*;

public class MaxMin_10818 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int scale = sc.nextInt();
        int[] numbers = new int[scale];

        for(int i = 0; i < scale; i++){
            numbers[i] = sc.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for(int i = 0; i < scale; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
        sc.close();
    }
}

/**
 * 처음엔 배열을 정렬하여 인덱스 0번과 맨 끝 인덱스를 출력하는 방식을 이용
 * 컴파일 시간이 너무 오래 걸려서 확인해보니 배열을 정렬하는 방식보다
 * 값을 비교해가면서 max와 min 값을 찾는 것이 더 효율적인 방법이었음.
 */
