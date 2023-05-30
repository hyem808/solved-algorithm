package Class1;

import java.util.Scanner;

public class RepeatString_2675 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            int rept = sc.nextInt();
            String[] string = sc.next().split("");
            for(int j = 0; j < string.length; j++) {
                for (int k = 0; k < rept; k++) {
                    System.out.print(string[j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

