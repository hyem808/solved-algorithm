package Class1;

import java.util.Scanner;

public class StarPrint_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                sb.append("*");
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }
        sc.close();
    }
}
