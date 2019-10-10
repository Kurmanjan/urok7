package com.company;

public class Box<I extends Number, S extends Number> {
    I numberl;
    S number2;

    public Box(I numberl, S number) {
        this.numberl = numberl;
        this.number2 = number;
    }

    public I getNumberl() {
        return numberl;
    }

    public void setNumberl(I numberl) {
        this.numberl = numberl;
    }

    public S getNumber2() {
        return number2;
    }



    public void setNumber2(S number2) {
        this.number2 = number2;
    }
}


