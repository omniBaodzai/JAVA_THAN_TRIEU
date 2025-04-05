package chuong05;

import javax.swing.*;

/**
 * Chương 05: Lập trình giao diện đồ họa
 * Ví dụ 01: Cách tạo khung
 */
public class ViDu01
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 40);

        f.add(b);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
