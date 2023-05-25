package com.park.fftw;

public class NativeBridge {

    static {
        System.loadLibrary("fftw");
    }

    public native void test();

}
