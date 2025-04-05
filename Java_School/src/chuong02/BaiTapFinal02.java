package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Bài tập final 02: final với biến tham chiếu (Object)
 - Khai báo một lớp Person với thuộc tính name.
 - Tạo một biến final Person person1 = new Person("John");
 - Thử thay đổi thuộc tính và tham chiếu của person1.
 */
class Person
{
    String name;
    // Constructor để khởi tạo giá trị cho name
    Person(String name)
    {
        this.name = name;
    }
}
public class BaiTapFinal02
{


    public static void main(String[] args)
    {
        // Tạo một đối tượng Person với từ khóa final
        final Person person1 = new Person("John");

        // Thử thay đổi thuộc tính name của person1 (hợp lệ)
        person1.name = "Bảo";
        System.out.println("Name after change: " + person1.name);  // In ra: David

        // Thử thay đổi tham chiếu của person1 (không hợp lệ)
        // person1 = new Person("Alice");  // Lỗi: Không thể thay đổi tham chiếu của person1 vì person1 là final
    }
}


