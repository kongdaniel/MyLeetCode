package com.testcode;


//27. 移除元素
public class Question2 {

    public static void main(String[] args) {
        int [] nums1= {3,3};
        int m = 5;

        Question2 question2=new Question2();
        int k= question2.removeElement(nums1,m);
        System.out.printf(""+k);
    }
    public int removeElement(int[] nums, int val) {
        int start=0;
        int end=nums.length-1;

        //处理都为0 的情况
        if (start==end){
            if (nums[start]==val){
                return start;
            }else {
                return start+1;
            }
        }

        while(start<end){
            while (start<end&&nums[start]!=val){
                start++;
            }
            while (end>=0&&nums[end]==val){
                end--;
            }
            if(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
            }

        }


        return  start;

    }
}
