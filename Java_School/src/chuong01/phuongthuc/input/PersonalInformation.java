package chuong01.phuongthuc.input;

import java.util.Scanner;

/**
 * Chương 01: Kỹ thuật lập trình Java
 Xây dựng một chương trình Java cho phép người dùng nhập thông tin cá
 nhân, bao gồm tên, tuổi, chiều cao, và tình trạng hôn nhân (boolean). Sau đó,
 chương trình sẽ hiển thị lại các thông tin đã nhập.
 */
public class PersonalInformation {

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
        System.out.println("\n*** Thông tin cá nhân ***");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Đã kết hôn: " + (isMarried ? "Rồi" : "Chưa"));
    }

    public static void main(String[] args) {
        // Gọi các phương thức để nhập dữ liệu từ người dùng
        String name = inputName();
        int age = inputAge();
        double height = inputHeight();
        boolean isMarried = inputMaritalStatus();

        // Hiển thị thông tin đã nhập
        displayInformation(name, age, height, isMarried);
    }
}

