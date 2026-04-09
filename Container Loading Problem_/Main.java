


import java.util.*;

public class Main {
    public static void main(String[] args) {

        int w[] = {4, 8, 1, 5, 12};   // weights
        int capacity = 20;

        Arrays.sort(w);   // 1 4 5 8 12

        int sum = 0;
        int count = 0;

        for(int i = 0; i < w.length; i++) {//4<5
            if(sum + w[i] <= capacity) {//18<=20
                sum = sum + w[i];//18
                count++;//4
            }
        }

        System.out.println("Items loaded = " + count);
        System.out.println("Total weight = " + sum);
    }
}