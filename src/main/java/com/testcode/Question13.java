package com.testcode;

public class Question13 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};

        Question13 question = new Question13();
         int [] result = question.productExceptSelf(nums1);
        for (int i=0;i<result.length;i++){
            System.out.printf("%d,",result[i]);
        }
    }

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int productArr [] =new int[n];
        int reverseProductArr []=new int[n];
        productArr[0] = nums[0];
        for (int i = 1; i < n ; i++) {
            productArr[i] = productArr[i-1] * nums[i];
        }
        reverseProductArr[n-1] = nums[n-1];
        for (int i=n-2; i >= 0; i--) {
            reverseProductArr[i] = reverseProductArr[i+1] * nums[i];
        }
        int [] result = new int[n];
        result[0]=reverseProductArr[1];
        result[n-1]=productArr[n-2];
        for (int i = 1; i <= n-2; i++) {
            result[i] = productArr[i-1]*reverseProductArr[i+1];
        }
        return result;
    }
}
