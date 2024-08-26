package com.testcode;
//121 买卖股票
public class Question7 {

    public static void main(String[] args) {
        int[] nums1 = {7,1,5,3,6,4};
        int m = 2;

        Question7 question7 = new Question7();
        int k=question7.maxProfit(nums1);
        System.out.println(k);
        for (int i = 0; i < nums1.length; i++) {
            System.out.printf("%d,", nums1[i]);
        }
    }

    public int maxProfit(int[] prices) {
        int n=prices.length;

        int minprice=prices[0];
        int totalprice=0;
        //int[i][j]
        for(int i=0;i<n;i++){
        //第i天卖出股票
            if (i==0){
            }else {
                minprice=prices[i]<minprice?prices[i]:minprice;
                if(prices[i]-minprice>totalprice){
                    totalprice=prices[i]-minprice;
                }
            }
        }
        return totalprice;

    }


}
