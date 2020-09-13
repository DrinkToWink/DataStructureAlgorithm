package com.second.other;

import java.util.ArrayList;

/**
 * @User 小菜鸡
 * @Data 2020/5/8
 */
public class SolutionConvert {

    public static String convert(String s,int numRows){
        if (numRows<2)return s;
        //存放所有的字符串
        ArrayList<StringBuilder> list = new ArrayList<>();
        //存放要输出的字符串
        StringBuilder stringBuilder = new StringBuilder();
        int flag=-1;
        int cur=0;
        //给每一行放入一个字符串
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        //将字符串变成字符数组，并进行遍历
        for (char c : s.toCharArray()) {
            list.get(cur).append(c);
            //如果当前行为首行，那么下一个字符就放入下一行
            //如果当前行为尾行，那么下一个字符就放入上一行
            if (cur==0||cur==numRows-1) flag=-flag;
            cur+=flag;
        }
        for (StringBuilder builder : list) {
            stringBuilder.append(builder);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s="LEETCODEISHIRING";
        int numRow=4;
        System.out.println(convert(s,numRow));
    }
}
