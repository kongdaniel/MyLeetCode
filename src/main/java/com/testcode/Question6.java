package com.testcode;

//189 轮转数组
public class Question6 {

    public static void main(String[] args) {
        int [] nums1= {1,2,3,4,5,6,7};
        int m = 2;

        Question6 question6=new Question6();
        question6.rotategcd(nums1,m);
//        System.out.println(k);
        for (int i=0;i<nums1.length;i++){
            System.out.printf("%d,",nums1[i]);
        }
    }
    public void rotate(int[] nums, int k) {
    //最简单，增加一个相等大小的新数组接收
    //新增一个大小为k的数组接收临时的数组 优化可以反转少的那一部分
    //反转数组 先反转整个，再反转小的。    

        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int i,int j){
        if (j>i){
            //在这种情况下
            while (i<j){
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = temp;
            }

        }else{
            System.out.printf("请输入j>k\n");
        }

    }

    public void rotategcd(int[] nums, int k){
       //设n为数组长度，k为位移区间
        //将第0个元素放到 x1=(0+k)%n  ，将x1 放到 x2=(x1+k)%n ,以此类推，放多次，直到Xn==0;
        //此时以0为起始位置的交换完毕，
        //接下来计算一共要有几个起始位置，方法一，在放置元素时，记录元素的个数，当放置满n时，结束置换
        //lcm 最小公倍数   gcd 最大公约数
        //n*k=lcm(n,k)*gcd(n,k)
        //设元素放置a圈后，第一次经过原来的位置,记b为经过的元素，a*n=k*b，则a*n为 n,k 的最小公倍数，所以b=lcm(n,k)/k
        //每次轮回经过b个元素，则共需要经过 n/(lcm(n,k)/k)个元素
        //得出 n/(lcm(n,k)/k)= n*k/lcm(n,k)=gcd(n,k).
        //
        int n=nums.length;
        k=k%n;
        System.out.printf("n=%d,k=%d\n", n,k);
        int count=gcd(n,k);
        System.out.printf("count=%d\n", count);
        for (int i = 0; i < count ; i++) {
            int curent=i;
            int prev=nums[i];
            do {
                int next=(curent+k)%n;
                int temp=nums[next];
                nums[next]=prev;
                prev=temp;
                curent=next;
                int kk=99;

            }while (i!=curent);
        }

    }
    public int gcd(int a,int b){
        int min = a < b ? a : b;//判断并取出两个数中小的数
        for (int i = min; i >= 1; i--) { //循环,从最小值开始,依次递减,直到i=1
            if (a%i==0&&b%i==0){    //当i能同时被A和B余尽时,返回i
                return i;
            }
        }
        return 0;
    }
}
