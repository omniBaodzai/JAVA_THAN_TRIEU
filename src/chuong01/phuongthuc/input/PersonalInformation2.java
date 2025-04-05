package chuong01.phuongthuc.input;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 Chương trình này sẽ yêu cầu người dùng nhập tên, tuổi, chiều cao và tình
 trạng hôn nhân, sau đó hiển thị lại thông tin. Đồng thời, sẽ xử lý vấn đề với
 ký tự xuống dòng còn sót lại khi nhập số.
 */
public class PersonalInformation2 {

    // Phương thức nhập tên
    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        return scanner.nextLine(); // Đọc chuỗi văn bản
    }

    // Phương thức nhập tuổi
    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        return scanner.nextInt(); // Đọc số nguyên
    }

    // Phương thức nhập chiều cao
    public static double inputHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của bạn (m): ");
        return scanner.nextDouble(); // Đọc số thực
    }

    // Phương thức nhập tình trạng hôn nhân (boolean)
    public static boolean inputMaritalStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn đã kết hôn chưa (true/false)? ");
        return scanner.nextBoolean(); // Đọc giá trị boolean
    }

    // Phương thức hiển thị thông tin cá nhân
    public static void displayInformation(String name, int age, double height, boolean isMarried) {
        System.out.println("\nThông tin cá nhân:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Đã kết hôn: " + (isMarried ? "Có" : "Chưa"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tuổi
        int age = inputAge();

        // Xóa ký tự xuống dòng còn sót lại trong bộ nhớ đệm
        scanner.nextLine();  // Đọc và loại bỏ ký tự xuống dòng

        // Nhập tên
        String name = inputName();

        // Nhập chiều cao
        double height = inputHeight();

        // Nhập tình trạng hôn nhân
        boolean isMarried = inputMaritalStatus();

        // Hiển thị thông tin đã nhập
        displayInformation(name, age, height, isMarried);
    }
}

