package main.java.dsa;

import java.util.*;

public class ThreeSum {

    private List<List<Integer>> res;
    public List<List<Integer>> threeSum(int[] nums) {
        return new AbstractList<List<Integer>>() {
            @Override
            public List<Integer> get(int index) {
                 init();
                return res.get(index);
            }

            @Override
            public int size() {
                return res.size();
            }
            public void init(){
                Arrays.sort(nums);
                int x = 0;
                int itr = nums.length - 3 + 1;
                Set<List<Integer>> result = new HashSet<>();
                while (x < itr) {
                    int i = x;
                    int j=x+1;
                    int k = nums.length - 1;
                    while (j<k) {
                        int sum = nums[i] + nums[j] + nums[k];
                        if (sum == 0) {
                            List<Integer> res= new ArrayList<>();
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[k]);
                            result.add(res);
                        }
                        if(sum<0){
                            ++j;
                        }else{
                            --k;
                        }

                    }
                    ++x;
                }
              res=new ArrayList<>(result);
            }
        };

    }
    public List<List<Integer>> threeSum2(int[] nums) {
        int target = 0;
        return new AbstractList<List<Integer>>() {
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }

            public int size() {
                init();
                return res.size();
            }

            private void init() {
                if (res != null) return;
                Arrays.sort(nums);
                int l, r;
                int sum;
                Set<List<Integer>> tempRes = new HashSet<>();
                for (int i = 0; i < nums.length - 2; ++i) {
                    l = i + 1;
                    r = nums.length - 1;
                    while (l < r) {
                        sum = nums[i] + nums[l] + nums[r];
                        if (sum == target) {
                            List<Integer> t = new ArrayList<>();
                            t.add(nums[i]);
                            t.add(nums[l]);
                            t.add(nums[r]);
                            tempRes.add(t);
                        }
                        if (sum < target) ++l;
                        else --r;
                    }
                }
                res = new ArrayList<List<Integer>>(tempRes);
            }
        };
    }
    public static void main(String[] args){
        ThreeSum threeSum = new ThreeSum();
        int[]  nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threeSum.threeSum(nums);

    }
}
