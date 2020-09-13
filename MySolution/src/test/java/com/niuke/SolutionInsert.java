package com.niuke;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @User 小菜鸡
 * @Data 2020/7/12
 */
public class SolutionInsert {

    private int count=0;

    //默认维护小顶堆
    private PriorityQueue<Integer> small = new PriorityQueue<>();

    //构造大顶堆;不明白这样为啥可以构造大顶堆
    private PriorityQueue<Integer> big= new PriorityQueue<Integer>(new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            //o1<o2：返回1；o1=o2：返回0；o1>o2：返回-1
            return o2.compareTo(o1);
        }
    });

    //不管怎样变换都是将大的数据放入小顶堆，小的数据放入大顶堆
    public void Insert(Integer num){
        count++;
        //有奇数个数
        if ((count & 1)==1){
            //该值大于小顶堆中最小的数
            if(!small.isEmpty() && num>small.peek()){
                small.offer(num);
                //弹出小堆顶中的最小数
                num=small.poll();
            }
            //第一个数放入大顶堆
            big.offer(num);
        }else{
            //该值小于大顶堆中最大的数
            if (!big.isEmpty() && num<big.peek()){
                big.offer(num);
                //弹出大顶堆中的最大数，放入小顶堆
                num = big.poll();
            }
            //第二个数放入小顶堆
            small.offer(num);
        }
    }

    public Double GetMedian(){
        double result=0.0;
        if ((count&1)==1){
            result = big.peek();
        }else {
            result =(small.peek()+big.peek())/2.0;
        }
        return result;
    }

    public static void main(String[] args) {
        SolutionInsert solutionInsert = new SolutionInsert();
        for (int i = 0; i < 5; i++) {
            solutionInsert.Insert(i);
            System.out.println(solutionInsert.GetMedian());
        }
    }
}
