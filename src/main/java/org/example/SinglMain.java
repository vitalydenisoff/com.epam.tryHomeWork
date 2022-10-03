package org.example;

public class SinglMain {
    public static void main(String[] args) {
        Singl singl = Singl.getInstance();
        Singl singl1 = Singl.getInstance();
        Singl singl2 = Singl.getInstance();
        Singl singl3 = Singl.getInstance();
        System.out.println(singl2==singl1);
        System.out.println(singl2==singl3);
    }
}
