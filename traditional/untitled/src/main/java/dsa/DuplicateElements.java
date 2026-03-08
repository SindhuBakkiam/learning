package main.java.dsa;

public class DuplicateElements {


    public int removeDuplicates(int[] nums) {
        int index=0;
        if (nums.length == 1) {
            return 1;
        }
        int[] result = new int[nums.length];
        int left = nums[0];
        int x=0;
        result[x]=nums[0];

        for (int i=1;i<nums.length;i++){
            if(nums[i]!= left){
                ++x;
                nums[x]=nums[i];
            }
            left=nums[i];

        }

        return ++x;
    }


    public static void main(String[] args){
        DuplicateElements duplicateElements = new DuplicateElements();
        int[] nums = {1,1,2};
        int[] expectedNums = {1,2};

        int k= duplicateElements.removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println(k);
    }
}
