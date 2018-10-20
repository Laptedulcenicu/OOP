package com.nicu.Lab2.task2;

public class Main {

public static void main(String[] args) {
       Queue q1 = new Queue(300);
        q1.push(5);
        q1.push(8);
        q1.push(56);
        q1.push(549);
        q1.push(855);
        q1.push(57);
        q1.pop();
        q1.pop();
        q1.showEl();
}
}