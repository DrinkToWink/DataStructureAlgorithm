package com.niuke;

/**
 * @User 小菜鸡
 * @Data 2020/7/6
 */
public class SolutionMovingCount {

    private int count;

    boolean[][] isVisit;

    public int movingCount(int threshold, int rows, int cols) {
        if (rows <= 0 || cols <= 0 || threshold <= 0) return 0;
        isVisit = new boolean[rows][cols];
        movingCore(0, 0, rows, cols, threshold, isVisit);
        return count;
    }

    public void movingCore(int curX, int curY, int rows, int cols, int threshould, boolean[][] isVisit) {
        if (curX < 0 || curX > rows - 1 || curY < 0 || curY > cols - 1 || isVisit[curX][curY] || sumRowAndCol(curX, curY) > threshould) {
            return;
        }
        isVisit[curX][curY]=true;
        count++;
        movingCore(curX+1,curY,rows,cols,threshould,isVisit);//down
        movingCore(curX,curY+1,rows,cols,threshould,isVisit);//right
        movingCore(curX-1,curY,rows,cols,threshould,isVisit);//up
        movingCore(curX,curY-1,rows,cols,threshould,isVisit);//left
    }

    public int sumRowAndCol(int row, int col) {
        int sum = 0;
        while (row != 0) {
            sum = sum + row % 10;
            row = row / 10;
        }
        while (col != 0) {
            sum = sum + col % 10;
            col = col / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SolutionMovingCount solutionMovingCount = new SolutionMovingCount();
        int count = solutionMovingCount.movingCount(5, 4, 4);
        System.out.println(count);
    }
}
