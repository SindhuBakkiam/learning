package main.java.dsa;

import java.util.Arrays;

public class FractionsToOne {


    private int findCounts(int[] numerator,int[] denominator) {

       int count=0;
        for (int i = 0; i < numerator.length - 1; i++) {
            int num1 = numerator[i];
            int den1 = denominator[i];
            for (int j = i + 1; j < numerator.length; j++) {
                int num2 = numerator[j];
                int den2 = denominator[j];
                int sumNum=((den2 * num1) + (num2 * den1));
                int sumDen=den1*den2;

                if ((sumNum/sumDen) == 1 && (sumNum%sumDen) ==0) {
                    count++;
                }
            }

        }
        return count;

    }
    public static void main(String[] args){
        FractionsToOne fractionsToOne = new FractionsToOne();
       int[] X = {1, 1, 2}, Y = {3, 2, 3};
       System.out.println(fractionsToOne.findCounts(X,Y));

        int[] X1 = {1, 1, 1}, Y1 = {2, 2, 2};
        System.out.println(fractionsToOne.findCounts(X1,Y1));
        int[] X2 = {1, 2, 3, 1, 2, 12, 8, 4}, Y2= {5, 10, 15, 2, 4, 15, 10, 5};
        System.out.println(fractionsToOne.findCounts(X2,Y2));


    }
}
