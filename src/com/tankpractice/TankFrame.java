package com.tankpractice;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {


    public TankFrame() throws HeadlessException {
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
        g.fillRect(200,200,50,50);
    }
}
