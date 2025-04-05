package chuong05;

import javax.swing.*;

/**
 * Chương 05: Lập trình giao diện đồ họa
 * Ví dụ 01: Cách tạo khung
 */
public class ViDu02
{
    JFrame f;
    ViDu02(){
        f=new JFrame();//creating instance of JFrame
        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);
        f.add(b);//adding button in JFrame
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }

    public static void main(String[] args) {
        new ViDu02();
    }
}
