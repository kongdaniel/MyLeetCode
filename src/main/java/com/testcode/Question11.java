package com.testcode;

public class Question11 {

    public static void main(String[] args) {
        int[] nums1 = {3,0,6,1,5};
        int m = 2;

        Question11 question = new Question11();
        int k = question.hIndex(nums1);
        System.out.println(k);
//        for (int i=0;i<nums1.length;i++){
//            System.out.printf("%d,",nums1[i]);
//        }
    }

    public int hIndex(int[] citations) {
        int n = citations.length;
        int map[]=new int[n+1];
        for (int i = 0; i <n ; i++) {
            int index = Math.min(citations[i],n);
            map[index]+=1;

        }
        for (int i = n; i >= 0; i--) {
            if (i<n){
                map[i]+=map[i+1];
            }
            if(map[i]>=i){
                return i;
            }
        }
        return 0;
    }
}
