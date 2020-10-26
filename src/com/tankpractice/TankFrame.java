package com.tankpractice;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.Graphics;

public class TankFrame extends Frame {

    int x = 200, y = 200;
    Dir dir = Dir.DOWN;//initial
    private static final int SPEED = 10; //常量

    public TankFrame() {
        setSize(800,600);
        setResizable(false);//can't be resized
        setTitle("tank war");
        setVisible(true);
        this.addKeyListener(new MyKeyListener());

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
        //System.out.println("paint");
        g.fillRect(x,y,50,50);
        switch (dir){
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }
       // x += 10;//go right
       // y += 10;//go down

    }

    //键盘监听处理类
    class MyKeyListener extends KeyAdapter{
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
            setTankDir();

        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key){
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                default:
                    break;
            }
            setTankDir();
        }
        public void setTankDir(){
            if(bL) dir = Dir.LEFT;
            if(bU) dir = Dir.UP;
            if(bR) dir = Dir.RIGHT;
            if(bD) dir = Dir.DOWN;
        }
    }
}
