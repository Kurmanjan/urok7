package com.company;


                import com.company.Box;

public class Main {

    public static void main(String[] args) {

        Box<Double, Integer> box1 = new Box<>(2.5, 2);
        Box<Float, Float> box2 = new Box<>(2.223F, 0.005F);
    }

    public static void addition(Box<? extends Number, ? extends Number> b1,
                                Box<? extends Number, ? extends Number> b2) {
        System.out.println(b1.numberl.doubleValue() + b2.numberl.doubleValue()
         + b2.number2.doubleValue());
    }

    public static void muliplication(Box<? extends  Number, ? extends Number> b1,
                                     Box<? extends Number, ? extends Number> b2) {
        System.out.println(b1.numberl.doubleValue() + b2.number2.doubleValue()
        + b2.number2.doubleValue());
    }

}








