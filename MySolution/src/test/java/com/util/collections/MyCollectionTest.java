package com.util.collections;

import java.util.*;

/**
 * @User 小菜鸡
 * @Data 2020/5/10
 */
public class MyCollectionTest {

    public static void main(String[] args) {
        //即使传入了参数也不会在创建对象的时候初始化容量，而是在第一次调用put方法的时候才会初始化容量
        HashMap<Object, Object> hashMap = new HashMap<>(32);
        //即使传入了参数也不会在创建对象的时候初始化容量，而是在第一次抵用add方法的时候才会初始化容量
        //ArrayList<Integer> list = new ArrayList<>(5);
//        Collections.sort();
//        Arrays
//        ArrayList<Person> list = new ArrayList<>();
//        list.add(new Person("zhangsan", 20));//4
//        list.add(new Person("lisi", 21));//2
//        list.add(new Person("misi", 21));//3
//        list.add(new Person("lasi", 21));//1
//        list.add(new Person("Zhangsan", 21));
//        list.sort(Comparator.comparing(Person::getName).reversed());
//        System.out.println(list);
        String[] strings = {"zhangsan","lisi"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }

    }
}

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
