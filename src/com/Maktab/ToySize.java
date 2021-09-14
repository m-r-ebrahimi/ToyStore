package com.Maktab;

public enum ToySize {
    SMALL(1), MEDIUM(2), LARGE(3);

    private int i;

    ToySize(int i) {
        this.i = i;
    }
    public int getNumber(){
        return i;
    }

}
