package com.example.lesson31;

public class Pressure {
    private int sys, dias, puls;

    public Pressure(int sys, int dias, int puls) {
        this.sys = sys;
        this.dias = dias;
        this.puls = puls;
    }

    public int getSys() {
        return sys;
    }

    public int getDias() {
        return dias;
    }

    public int getPuls() {
        return puls;
    }
}
