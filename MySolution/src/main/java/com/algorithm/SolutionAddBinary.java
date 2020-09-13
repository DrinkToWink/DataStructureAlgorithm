package com.algorithm;

/**
 * @author: 一个小菜逼
 * @Date: 2020/4/22
 */
public class SolutionAddBinary {

    public static String addBinary(String a,String b){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = a.length()-1,j=b.length()-1; i >=0 || j>=0; j--,i--) {
            int sum=Integer.parseInt(String.valueOf(a.charAt(i)))+
                    Integer.parseInt(String.valueOf(b.charAt(j)));
            if (sum%2!=0){
                return stringBuilder.append(sum).reverse().toString();
            }else {
                a.toCharArray()[i]='0';
                b.toCharArray()[j]='0';
            }
        }
        //reverse方法可以将StringBuilder类型的字符串进行翻转，例如"abc"->"cba"
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String a="11";
        String b= "1";
        System.out.println(addBinary(a, b));
    }
}
