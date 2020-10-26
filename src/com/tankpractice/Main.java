package com.tankpractice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args){
        Frame f = new Frame();
        f.setSize(800,600);
        f.setResizable(false);//can't be resized
        f.setTitle("tank war");

        f.setVisible(true);
        //添加window监听器来判断怎么关windows=>点击关闭
        //点击关闭发出事件-> 处理事件-> system close
        f.addWindowListener(new WindowAdapter() {//windowAdapter是匿名类，实现了windowListener的接口,它的子类
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }
}
