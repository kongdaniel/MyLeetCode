package com.testcode;

public class Question9 {

    public static void main(String[] args) {
        int[] nums1 = {3,2,1,0,4};
        int m = 2;

        Question9 question = new Question9();
        boolean k = question.canJump(nums1);
        System.out.println(k);
//        for (int i=0;i<nums1.length;i++){
//            System.out.printf("%d,",nums1[i]);
//        }
    }

    public boolean canJump(int[] nums) {

        int n = nums.length;
        int canJump = n-1;
        if (n == 1) return true;
        for (int i=n-2; i>=0; i--) {
            if(nums[i]+i >=canJump) {
                canJump = i;
            }
        }
        if (canJump==0){
            return true;
        }
        return false;


        //dfs方法 时间耗费太高。 不推荐
        //return dfs(nums,0);

    }

    public boolean dfs(int[] nums,int start) {
        int len = nums.length;
        int interval=nums[start];
        int maxIndex = start+interval;
        if (maxIndex>= len-1) {
            return true;
        }
        //如果数组的值为0 ，且未达到终点，则返回false;
        if (interval==0){
            return false;
        }
        //可以剪枝 使得不重复走已经走过的错路

        for (int i = 1; i <= interval; i++) {
            int nextIndex = start+i;
            if (dfs(nums,nextIndex)) {
                return true;
            }
        }
        return false;
    }

}
