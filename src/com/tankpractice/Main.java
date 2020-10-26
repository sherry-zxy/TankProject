package com.tankpractice;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();
        while(true){
            //50毫秒调用窗口重画 ->调用paint的方法，方法里面x+=10 就会不断往右移动
            Thread.sleep(50);
            tf.repaint();
        }
    }
}
