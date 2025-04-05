package chuong01.bien;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Biến tĩnh static
 */
//class Student
//{
//    // Biến tĩnh (Static Variable)
//    static int studentCount = 0;  // Biến tĩnh lưu số học sinh
//
//    // Phương thức khởi tạo
//    public Student()
//    {
//        studentCount++;  // Mỗi lần tạo đối tượng Student, tăng số học sinh
//    }
//
//    // Phương thức tĩnh để hiển thị số học sinh
//    public static void showStudentCount()
//    {
//        System.out.println("Number of students: " + studentCount);  // In ra số học sinh
//    }
//}
//
//public class ViDuBienTinh01
//{
//    public static void main(String[] args)
//    {
//        // Tạo đối tượng Student
//        Student s1 = new Student();  // Tăng studentCount lên 1
//        Student s2 = new Student();  // Tăng studentCount lên 2
//        Student s3 = new Student();  // Tăng studentCount lên 3
//
//        // Gọi phương thức tĩnh để xem số học sinh
//        Student.showStudentCount();  // In ra "Number of students: 3"
//    }
//}
class Student {
    // Biến tĩnh (Static Variable)
    static int studentCount = 0;

    // Phương thức khởi tạo
    public Student() {
        studentCount++;  // Mỗi lần tạo đối tượng, tăng số học sinh
    }

    // Phương thức tĩnh để hiển thị số học sinh
    public static void showStudentCount() {
        System.out.println("Number of students: " + studentCount);
    }
}

public class ViDuBienTinh01 {
    public static void main(String[] args) {
        // Tạo đối tượng Student
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Hiển thị số học sinh thông qua từng đối tượng
        s1.showStudentCount();  // In ra "Number of students: 3"
        s2.showStudentCount();  // In ra "Number of students: 3"
        s3.showStudentCount();  // In ra "Number of students: 3"

        // Sử dụng tên lớp để gọi phương thức tĩnh
        Student.showStudentCount();  // In ra "Number of students: 3"
    }
}

