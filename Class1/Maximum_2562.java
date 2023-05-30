package Class1;

import java.util.Scanner;

public class Maximum_2562 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        int max = 0;
        int count = 0;

        for(int i = 0; i < 9; i++){
            numbers[i] = sc.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
        sc.close();
    }
}

