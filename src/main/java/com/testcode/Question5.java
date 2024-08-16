package com.testcode;

import java.util.HashMap;
//169. 多数元素
public class Question5 {

    public static void main(String[] args) {
        int [] nums1= {3,2,3};
        int m = 5;

        Question5 question5=new Question5();
        int k= question5.majorityElement(nums1);
        System.out.println(k);
        for (int i=0;i<nums1.length;i++){
            System.out.printf("%d,",nums1[i]);
        }
    }

    public int majorityElement(int[] nums) {
        int n=nums.length;
        if (n==1) {
            return nums[0];
        }

        HashMap<Integer,Integer> count=new HashMap<Integer, Integer>();

        for (int i=0;i<n;i++){
            int key=nums[i];
            if (!count.containsKey(key)){
                count.put(key,1);
            }else {
                int value=count.get(nums[i])+1;
              count.replace(key,value);
            }
        }

        int maxkey=0,maxvalue=0;

        for (Integer i : count.keySet()) {
            if (count.get(i)>maxvalue){
                maxvalue=count.get(i);
                maxkey=i;
            }
        }

        return maxkey;
    }

    public int majorityElement2(int nums []){


        return 0;
    }
}
