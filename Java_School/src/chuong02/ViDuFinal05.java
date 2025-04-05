package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa final với constructor
 */
class Student
{
    final int studentID;  // Hằng số nhưng chưa khởi tạo

    // Khởi tạo giá trị trong constructor
    Student(int id)
    {
        this.studentID = id;
    }

    void show()
    {
        System.out.println("Student ID: " + studentID);
    }
}

public class ViDuFinal05
{
    public static void main(String[] args)
    {
        Student s1 = new Student(101);
        s1.show();

        // s1.studentID = 200; // Lỗi: Cannot assign a value to final variable 'studentID'
    }
}