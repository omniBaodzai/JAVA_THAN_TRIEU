package chuong02.constructor;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Constructor
 */
class Person {
    String name;
    int age;

    // Constructor mặc định do Java tự tạo
}

public class ConstructorExample01 {
    public static void main(String[] args) {
        // Tạo đối tượng mà không cần tham số
        Person person = new Person();

        // Các thuộc tính name và age sẽ có giá trị mặc định
        System.out.println("Giá trị của name là: " + person.name); // null
        System.out.println("Giá trị của age là: " + person.age); // 0
    }
}
