package chuong05;
import javax.swing.*;
public class MyGUI {
    public static void main(String[] args) {
        // Tạo cửa sổ chính
        JFrame frame = new JFrame("Chương trình Java GUI");

        // Kích thước cửa sổ (rộng, cao)
        frame.setSize(400, 300);

        // Thoát khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo JLabel với văn bản muốn hiển thị
        JLabel label = new JLabel("Xin chào! Đây là giao diện Java", SwingConstants.CENTER);

        // Căn giữa văn bản theo chiều ngang và chiều dọc
        label.setHorizontalAlignment(SwingConstants.CENTER);  // Căn giữa theo chiều ngang
        label.setVerticalAlignment(SwingConstants.CENTER);    // Căn giữa theo chiều dọc

        // Thêm nhãn vào cửa sổ
        frame.add(label);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}


