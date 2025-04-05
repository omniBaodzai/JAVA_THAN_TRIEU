package chuong02.constructor;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Constructor
 */
class Person2 {
    String name;
    int age;

    // Constructor có tham số
    public Person2(String name, int age) {
        this.name = name; // Gán giá trị name từ tham số vào thuộc tính name
        this.age = age; // Gán giá trị age từ tham số vào thuộc tính age
    }
}

public class ConstructorExample02 {
    public static void main(String[] args) {
        // Tạo đối tượng và khởi tạo giá trị ban đầu
        Person2 person = new Person2("Huỳnh Lê Bảo", 18);

        System.out.println("Họ tên: " + person.name);
        System.out.println("Tuổi: " + person.age);
    }
}

