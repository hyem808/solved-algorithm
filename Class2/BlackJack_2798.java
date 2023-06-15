package Class2;

import java.util.*;

/**
 * 블랙잭
 */

public class BlackJack_2798 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        ArrayList<Integer> gapList = new ArrayList<Integer>();

        int cardNum = sc.nextInt();
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < cardNum; i++){
            list.add(sc.nextInt());
        }
        for (int i = 0; i < cardNum-2; i++) {
            for (int j = i + 1; j < cardNum; j++) {
                for (int k = j + 1; k < cardNum; k++) {
                    int check = list.get(i) + list.get(j) + list.get(k);
                    if (check <= num) {
                        sumList.add(check);
                        gapList.add(num-sumList.get(count));
                        count++;
                    }
                }
            }
        }
        int min = Collections.min(gapList);
        int gapMin = gapList.indexOf(min);
        System.out.println(sumList.get(gapMin));
    }
}