package Class1;

import java.util.Scanner;

public class AplusB_3_10950 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
    }
}
