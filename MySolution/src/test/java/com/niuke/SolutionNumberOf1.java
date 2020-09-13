package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/5/23
 */
public class SolutionNumberOf1 {

    public static int numberOf1(int n){
        if (n==0)return n;
        StringBuilder stringBuilder = new StringBuilder();
        //将一个数转化为二进制
        while (n!=0){
            //取余2表示得到二进制末尾的哪个数
            stringBuilder.append(n%2);
            //右移一位表示除以2
            n=n>>1;
        }
        StringBuilder reverse = stringBuilder.reverse();
        String s=reverse.toString();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if ('1'==s.charAt(i))count++;
        }
        return count;
    }

    public static int numberOf2(int n){
        int count=0;
        while (n!=0){
            count++;
            //会将最右边的哪个1去掉，每执行一次，去掉最右边的那个1
            n=n&(n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println(numberOf1(16));
        System.out.println(-5&-6);
    }
}
