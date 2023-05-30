package Class1;

import java.util.Scanner;
public class AplusB_4_10951 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a + b);

            } catch (Exception e) {
                break;
            }
        }
        sc.close();
    }
}

// 문제가 조금 이상한데, 예외처리를 해주니 정답으로 해주네요.