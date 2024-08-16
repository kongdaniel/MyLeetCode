package com.testcode;

import java.util.Arrays;


// 第88 题 合并两个有序数组
public class question1 {

    public static void main(String[] args) {
        int [] nums1= {1,2,3,0,0,0};
        int [] nums2= {2,5,6};
        int m = 3,  n = 3;
        question1 question1=new question1();
        question1.merge(nums1,3,nums2,n);
        System.out.printf(Arrays.toString(nums1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int n1_index=0;
        int n2_index=0;
        int n3_index=0;
        int [] temp=new int[m+n];
        //处理特殊情况
       if (n==0){
            return;
        }
        while (n3_index<m+n){
            if (n2_index>=n){
                temp[n3_index]=nums1[n1_index++];
            }else if (n1_index>=m){
                temp[n3_index]=nums2[n2_index++];
            }else{
                temp[n3_index]=nums1[n1_index]<nums2[n2_index]?nums1[n1_index++]:nums2[n2_index++];

            }


            n3_index++;
        }

        //        System.out.printf("输出结果："+temp.toString());
        for (int i=0;i<m+n;i++){
            nums1[i]=temp[i];
        }
        return;
    }
}
