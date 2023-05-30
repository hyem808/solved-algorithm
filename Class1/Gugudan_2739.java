package Class1;

import java.util.Scanner;

public class Gugudan_2739 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            sb.append(num + " * " + i + " = " + num*i + "\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
