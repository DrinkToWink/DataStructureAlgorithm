package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/7/10
 */
public class SolutionHasPath {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length <= 0 || rows <= 0 || cols <= 0 || str == null || str.length <= 0)
            return false;
        char[][] chars = new char[rows][cols];
        //将一维数组的字符串存储方式变成二维数组
        for (int i = 0; i < rows; i++) {
            for (int i1 = 0; i1 < cols; i1++) {
                chars[i][i1] = matrix[i * cols + i1];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int i1 = 0; i1 < cols; i1++) {
                if (chars[i][i1] == str[0]) {
                    boolean[][] isVisited = new boolean[rows][cols];
                    if (isPath(chars, rows, cols, str, i, i1, isVisited, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isPath(char[][] chars, int rows, int cols, char[] str, int curX, int curY, boolean[][] isVisited, int len) {
        if (curX > rows - 1 || curX < 0 || curY > cols - 1 || curY < 0 || isVisited[curX][curY] || chars[curX][curY] != str[len]) {
            return false;
        }
        if (len==str.length-1)return true;
        isVisited[curX][curY] = true;
        len++;
        if (isPath(chars, rows, cols, str, curX, curY + 1, isVisited, len)
                || isPath(chars, rows, cols, str, curX, curY - 1, isVisited, len)
                || isPath(chars, rows, cols, str, curX + 1, curY, isVisited, len)
                || isPath(chars, rows, cols, str, curX - 1, curY, isVisited, len)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        char[] str = {'b', 'c', 'c', 'e', 'd'};
        //char[] str={'a','b','c','d'};
        //String s="ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS";
        //char[] chars = s.toCharArray();
        //String s1="SGGFIECVAASABCEHJIGQEM";
        //char[] str = s1.toCharArray();
        SolutionHasPath solutionHasPath = new SolutionHasPath();
        System.out.println(solutionHasPath.hasPath(chars, 3, 4, str));
    }
}
