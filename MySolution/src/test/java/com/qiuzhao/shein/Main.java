package com.qiuzhao.shein;

import java.util.Scanner;

/**
 * @User xiangyl
 * @Data 2020/11/25
 */
public class Main {

    /*public int len(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < str2.length()) {
            return 0;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] map = new int[1024];
        for (int i = 0; i < chars2.length; i++) {
            map[chars2[i]]++;
        }
        int left = 0;
        int right = 0;
        int minlen = Integer.MAX_VALUE;
        int match = chars2.length;
        while (right != chars1.length) {
            map[chars1[right]]--;

            if (map[chars1[right]] >= 0) {
                match--;
            }
            if (match == 0) {
                while (map[chars1[left]] >= 0) {
                    map[chars1[left++]]++;
                }
                minlen = Math.min(minlen, right - left + 1);
                match++;
                map[chars1[left++]]++;
            }
            right++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
*/


        public int minLength(String str1, String str2){
            if(str1 == null || str2 ==null || str1.length() < str2.length()){
                return 0;
            }
            char[] chas1 = str1.toCharArray();
            char[] chas2 = str2.toCharArray();
            int[] map = new int[256];
            for (int i=0; i< chas2.length; i++){
                map[chas2[i]]++;
            }
            int left= 0;
            int right = 0;
            int minLen =Integer.MAX_VALUE;
            int match =chas2.length;
            while (right != chas1.length){
                map[chas1[right]]--;
                if(map[chas1[right]] >= 0){
                    match--;
                }
                if(match == 0){
                    while (map[chas1[left]] < 0){
                        map[chas1[left++]]++;
                    }
                    minLen = Math.min(minLen, right - left + 1);
                    match++;
                    map[chas1[left++]]++;
                }
                right++;
            }
            return minLen == Integer.MAX_VALUE ? 0 :minLen;
        }

        public static void main(String[] args){
            Main tmp = new Main();

            /*String str1 = "abcde";
            String str2 = "ac";*/
            Scanner sc = new Scanner(System.in);
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(tmp.minLength(str1, str2));

            String str3 = "12345";
            String str4 = "344";
            System.out.println(tmp.minLength(str3, str4));
        }
    }


