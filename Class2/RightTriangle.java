package Class2;

import java.util.*;

public class RightTriangle {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = true;

        while(isValid) {
            ArrayList<Integer> list = new ArrayList<Integer>();

            for(int i = 0; i < 3; i ++) {
                list.add(sc.nextInt());
            }

            if(list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0) {
                isValid = false;
            } else {
                int max = Collections.max(list);
                int index = list.indexOf(max);
                list.remove(index);
                double cal = Math.pow(list.get(0),2.0) + Math.pow(list.get(1),2.0);
                double maxCal = Math.pow(max, 2.0);
                if(maxCal == cal) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
