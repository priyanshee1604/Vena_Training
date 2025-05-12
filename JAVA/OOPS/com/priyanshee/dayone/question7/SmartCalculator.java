package com.priyanshee.dayone.question7;

public class SmartCalculator extends BasicCalculator {
    public int subtract(int a, int b) {
        return (a - b);
    }

//   🚨ERROR:
//    public int add(int a, int b) {
//        return a * 2 + b * 2;
//    }
//    java: add(int,int) in com.priyanshee.dayone.question7.SmartCalculator
//    cannot override add(int,int) in com.priyanshee.dayone.question7.BasicCalculator
//    overridden method is final
//      not allowed as method is final in base class thus cannot override it.
}
