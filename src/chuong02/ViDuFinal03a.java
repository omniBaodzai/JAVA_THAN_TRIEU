package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa final với class
 * Lớp final không bị kế thừa
 */
final class Animall {
    void sound() {
        System.out.println("Animalls make sound");
    }
}

// Lỗi: Không thể kế thừa từ lớp final
// class Dog extends Animall {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

public class ViDuFinal03a {
    public static void main(String[] args) {
        Animall a = new Animall();
        a.sound();
    }
}

