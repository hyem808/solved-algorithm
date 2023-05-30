package Class1;

import java.util.*;

public class SumNum_11720 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        /*
        String[] numbers = new String[num];
        numbers = sc.next().split("");
        for(int i = 0; i < num; i++){
            sum += Integer.valueOf(numbers[i]);
        }*/

        // 아스키 코드를 사용한 코드
        // 런타임을 줄이는 데 도움이 될까 해서 구현해봤는데
        // 백준에서는 위 코드가 실행이 더 빠르네요
        String input = sc.next();
        for (int i = 0; i < num; i++){
            sum += input.charAt(i) - '0'; // 정수값 반환을 위해 아스키코드 0의 값을 빼줌
        }
        System.out.print(sum);
        sc.close();
    }
}
