package Class2;

import java.util.*;

public class PrimeNumber_1978 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        List<Integer> notPrimeNums = new ArrayList<Integer>();

        // 에라토스테네스의 체 알고리즘
        int[] notPrimeNumsBln = new int[1000];
        notPrimeNumsBln[0] = 0;
        notPrimeNumsBln[1] = 1;
        notPrimeNumsBln[2] = 0;
        for (int p = 2; p < 1000; p++) {
            if (notPrimeNumsBln[p] == 0) {
                try{
                    notPrimeNums.add(p);
                    for (int j = 2; j < 1000; j++) {
                        notPrimeNumsBln[p * j] = 1;
                    }
                } catch(ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
        System.out.println(notPrimeNums);
        int num = sc.nextInt();
        int countPrimeNums = 0;
        int[] getNum = new int[num];
        for(int i = 0; i < num; i++){
            getNum[i] = sc.nextInt();
            if(notPrimeNums.contains(getNum[i]) == true){
                countPrimeNums++;
            }
        }
        System.out.println(countPrimeNums);
    }
}