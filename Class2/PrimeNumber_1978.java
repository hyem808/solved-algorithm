package Class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber_1978 {
    public PrimeNumber_1978() {
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        List<Integer> notPrimeNums = new ArrayList();
        int[] notPrimeNumsBln = new int[100];
        notPrimeNumsBln[0] = 0;
        notPrimeNumsBln[1] = 1;
        notPrimeNumsBln[2] = 0;

        int p;
        int j;
        for(p = 2; p < 100; ++p) {
            if (notPrimeNumsBln[p] == 0) {
                try {
                    notPrimeNums.add(p);

                    for(j = 2; j < 100; ++j) {
                        notPrimeNumsBln[p * j] = 1;
                    }
                } catch (ArrayIndexOutOfBoundsException var8) {
                }
            }
        }

        System.out.println(notPrimeNums);
        p = sc.nextInt();
        j = 0;
        int[] getNum = new int[p];

        for(int i = 0; i < p; ++i) {
            getNum[i] = sc.nextInt();
            if (notPrimeNums.contains(getNum[i])) {
                ++j;
            }
        }

        System.out.println(j);
    }
}
