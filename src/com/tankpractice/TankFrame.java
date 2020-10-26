package com.tankpractice;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.Graphics;

public class TankFrame extends Frame {

    int x = 200, y = 200;

    public TankFrame() {
        setSize(800,600);
        setResizable(false);//can't be resized
        setTitle("tank war");

       setVisible(true);
        //添加window监听器来判断怎么关windows=>点击关闭
        //点击关闭发出事件-> 处理事件-> system close
        addWindowListener(new WindowAdapter() {//windowAdapter是匿名类，实现了windowListener的接口,它的子类
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    //重写frame的方法
    @Override
    public void paint(Graphics g){
        System.out.println("paint");
        g.fillRect(x,y,50,50);
        x += 10;//go right
        y += 10;//go down

    }
}
