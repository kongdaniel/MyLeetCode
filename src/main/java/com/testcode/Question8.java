package com.testcode;

public class Question8 {

    public static void main(String[] args) {
        int[] nums1 = {7,1,5,3,6,4};
        int m = 2;

        Question8 question = new Question8();
        int k = question.maxProfit(nums1);
        System.out.println(k);
//        for (int i=0;i<nums1.length;i++){
//            System.out.printf("%d,",nums1[i]);
//        }
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxFlag [][]=new int[n][2];
        //maxFlag[i][1]表示第i天是持有股票，maxFlag[i][0]表示第i天是未持有股票
        //maxFlag
        maxFlag[0][0]=0;
        maxFlag[0][1]=0-prices[0];
        //1.假如今天闭市后持有股票，则有两种情况，昨天有股票，与昨天没股票。
        //有股票继续持有的收益高，或着没股票持有的收益高
        //2.假如今天闭市后没有股票，则有两种情况，昨天没股票，昨天有股票。
        // 有股票卖出的收益高，还是没股票继续没股票的收益高
        for (int i = 1; i < n; i++) {

                maxFlag[i][1]=Math.max(maxFlag[i-1][1],maxFlag[i-1][0]-prices[i]);
                maxFlag[i][0]=Math.max(maxFlag[i-1][0],maxFlag[i-1][1]+prices[i]);

        }


        return Math.max(maxFlag[prices.length-1][0],maxFlag[prices.length-1][1]);

    }


}
