package main.java.dsa;

public class Solution {

    public int removeDuplicates(int[] nums) {
      /*  int length = nums.length;


        for (int i = 0; i < length; i++) {
            int counter = 0;

            for (int j = 0; j < length; j++) {
                if (nums[i] == nums[j] && counter <= 2) {
                    counter++;
                }
                if (nums[i] == nums[j] && counter > 2) {
                    for (int k = j; k < nums.length; k++) {
                        nums[k] = (k < nums.length - 1) ? nums[k + 1] : 0;
                    }
                    length = length - 1;
                    counter=0;
                }
            }

        }
        return length;*/

        int n = nums.length;
        if(n<=2){
            return n;
        }

        int j = 2;
        for(int i=2; i<n; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }

        public static void  main(String[] args){
            Solution solution = new Solution();
         int  k= solution.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});


    }
}
