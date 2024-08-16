package com.testcode;

//80. 删除有序数组中的重复项 II
public class Question4 {

    public static void main(String[] args) {
        int [] nums1= {0,0,1,1,1,1,2,3,3};
        int m = 5;

        Question4 question4=new Question4();
        int k= question4.removeDuplicates(nums1);
        System.out.println(k);
        for (int i=0;i<nums1.length;i++){
            System.out.printf("%d,",nums1[i]);
        }
    }
    public int removeDuplicates(int[] nums) {

        //设定两个指针
        int p1=0;
        int length=nums.length;
        int multiFlag=0;//重复次数
        for(int p2=0;p2<length;p2++){
            //当两个指针指向相同值 则最多连续赋值两次，即把p1指向的地方当前与下一个位置赋值为p2所指的地方
            if (nums[p1]==nums[p2]){
                if(multiFlag<2){
                    nums[p1+multiFlag]=nums[p2];
                    multiFlag++;
                }
            }else{
                //当指针所指的地方值不一样，则说明需要重新挪动p1 最多挪动两格
                p1=p1+multiFlag;
                nums[p1]=nums[p2];
                multiFlag=1;
                //此时重复一次
            }

        }
        //p1+(multiFlag-1)  最近赋值的位置
        return p1+(multiFlag-1)+1;

    }
}
