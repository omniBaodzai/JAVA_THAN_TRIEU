package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa private
 */
class Person1
{
    // Tạo biến name có phạm vi truy cập là private
    private String name;

    // Phương thức setter để thay đổi giá trị của biến name
    public void setName(String name)
    {
        this.name = name;
    }

    // Phương thức getter để lấy giá trị của name
    public String getName()
    {
        return this.name;
    }
}

public class ViDuPrivate
{
    public static void main(String[] args)
    {
        // Tạo đối tượng của lớp Person1
        Person1 obj = new Person1();

        // Truy cập và thay đổi giá trị của biến name thông qua phương thức setter
        obj.setName("John");

        // Lấy giá trị của biến name thông qua phương thức getter
        System.out.println("Tên bạn là: " + obj.getName());

        /*
         * Dòng bên dưới sẽ bị lỗi vì name là private
         * Không thể truy cập trực tiếp từ bên ngoài lớp Person1
         * System.out.println("Tên bạn là: " + obj.name);
         */
    }
}
