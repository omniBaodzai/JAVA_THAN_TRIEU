package chuong01.phuongthuc;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Method
 */
class Animal {
    public void makeSound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}
public class ViDuMethod03 {
    public static void main(String[] args) {
        Animal myObj = new Animal();

        // Gọi phương thức makeSound của lớp Animal trong method main
        myObj.makeSound();
    }
}