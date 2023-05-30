package Class1;

import java.util.Scanner;

public class OXQuiz_8958 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++){
            int score = 0;
            int result = 0;
            String[] ox = sc.next().split("");
            for(int j = 0; j < ox.length; j++){
                if(ox[j].equals("O")){
                    score += 1;
                    result += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}

