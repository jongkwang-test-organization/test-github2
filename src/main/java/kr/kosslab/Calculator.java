package kr.kosslab;

/**
 * Created by JongKwang on 10/11/2016.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Start Calculator");

        Calculator c = new Calculator();
        c.sum(1,2);
        c.sum(2,3);
        c.sum(3,4);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}