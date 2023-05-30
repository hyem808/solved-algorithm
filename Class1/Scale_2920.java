package Class1;

import java.util.Scanner;

public class Scale_2920 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int[] scale = new int[8];
        int result = 0;
        for(int i = 0; i < 8; i++) {
            scale[i] = sc.nextInt();
            if(scale[i] == i + 1){
                result += 1;
            } else if(scale[i] == 8 - i) {
                result -= 1;
            } else {
                result = 0;
            }
        }
        if(result == 8){
            System.out.print("ascending");
        } else if(result == -8){
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
        sc.close();
    }
}

