package com.qiuzhao.genshuixue;

/**
 * @User xiangyl
 * @Data 2020/8/7
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 so = new Solution2();
        String s = so.reverseParentheses("(u(love)i)");
        System.out.println(s);
    }

    public String reverseParentheses(String s){
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        int len = chars.length;
        boolean flag=true;
        for (int i = 0; i < len; i++) {
            if (chars[i]!='(' && chars[i]!=')' && flag){
                str.append(chars[len-1-i]);
            }
            if (chars[i]!='(' && chars[i]!=')' && !flag){
                str.append(chars[i]);
            }
            if (chars[i]=='(' && chars[i]==')'){
                flag=!flag;
            }
        }
        return str.toString();
    }
}
