package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/5/24
 */
public class SolutionBinaryAfter {

    public static boolean verifySquenceOfBST(int[] sequence){
        if (sequence==null||sequence.length==0)return false;
        return isBinaryAfter(sequence,0,sequence.length-1);
    }

    public static boolean isBinaryAfter(int[] sequence,int left,int right){
        //递归的结束条件
        if (left>=right)return true;
        int j=-1;
        //找出第一个比right大的数，也就是右节点
        for (int i = 0; i < right; i++) {
            if (sequence[i]>sequence[right]){
                j=i;
                break;
            }
        }
        //如果可以从右子树中找到一个比跟节点小的数，那么该搜索二叉树显然是不成立的
        if (j!=-1){
            for (int i = j+1; i < right; i++) {
                if (sequence[i]<sequence[right])return false;
            }
        }

        return isBinaryAfter(sequence,0,j-1) &&
                isBinaryAfter(sequence,j,right-1);
    }

    public static void main(String[] args) {
        int[] ints = new int[4];
        ints[0]=7;
        ints[1]=4;
        ints[2]=6;
        ints[3]=5;
        //ints[4]=5;
        System.out.println(verifySquenceOfBST(ints));
    }

}
