package Class2;

import java.util.*;

/**
 * 팰린드롬 수를 구하는 문제
 *
 *
 */

public class PalindromeNum_1259 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        boolean isRun = true;

        while(isRun){
            String[] numbers = sc.next().split("");
            int numLength = numbers.length;
            String isPalind = "yes";

            if(numbers[0].equals("0")){
                break;
            }

            for(int i = 0; i < numLength/2; i++){
                if(numbers[i].equals(numbers[numLength-i-1])){
                } else {
                    isPalind = "no";
                }
            }
            System.out.println(isPalind);
        }
    }
}
