package chuong05;

import javax.swing.*; // Import thư viện Swing

public class MySwingApp {
    public static void main(String[] args) {
        // Tạo cửa sổ chính
        JFrame frame = new JFrame("Ứng dụng Swing đầu tiên");
        frame.setSize(400, 200); // Đặt kích thước cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Đóng cửa sổ khi nhấn X

        // Tạo nút bấm
        JButton button = new JButton("Nhấn vào tôi!");

        // Thêm nút vào cửa sổ
        frame.add(button);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}

