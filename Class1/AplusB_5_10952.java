package Class1;

import java.util.*;
public class AplusB_5_10952 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0){
                break;
            } else {
                System.out.println(a + b);
            }
        }
        sc.close();
    }
}
