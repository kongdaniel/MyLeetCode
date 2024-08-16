package com.testcode;

//26. 删除有序数组中的重复项
public class Question3 {
    public static void main(String[] args) {
        int [] nums1= {1,1,2};
        int m = 5;

        Question3 question3=new Question3();
        int k= question3.removeDuplicates(nums1);
        System.out.println(k);
    }
    public int removeDuplicates(int[] nums) {
        int p1=0;
        int p2=0;
        int length=nums.length;
        while (p2<length){
            if (nums[p2]==nums[p1]){
                p2++;
            }else{
                nums[++p1]=nums[p2];
            }

        }
        return p1+1;


    }
}
