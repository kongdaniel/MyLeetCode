package com.testcode;

public class Question10 {

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        int m = 2;

        Question10 question = new Question10();
        int k = question.jump(nums1);
        System.out.println(k);
//        for (int i=0;i<nums1.length;i++){
//            System.out.printf("%d,",nums1[i]);
//        }
    }

    public int jump(int[] nums) {

        //贪心法的思路，算出每一步最远能跳多远，分别便利出第一步的范围，第二步的范围，第n步的范围
        //时间复杂都为O(N)

        //dp法比较 耗时间，但易于理解
        int n = nums.length;
        int dp[]=new int[n];
        //dp[i][j] ,dp[i][] 代表第1个位置最少的步骤。

        if (n==1){return 0;}
        for (int i = 0; i <n ; i++) {
            dp[i]=n+1;
        }
        dp[0]=0;
        for(int i=0;i<n;i++){
            int end=i+nums[i];
            end=Math.min(end,n-1);
            for(int k=i;k<=end;k++){
                dp[k]=Math.min(dp[k],dp[i]+1);
            }

        }
        return dp[n-1];

    }


}
