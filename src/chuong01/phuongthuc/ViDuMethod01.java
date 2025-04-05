package chuong01.phuongthuc;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Method
 */
public class ViDuMethod01
{
    /*
    Vì phương thức display() không có từ static, nên nó là phương thức của
    đối tượng, nên cần phải tạo ra một đối tượng của lớp ViDuMethod01 thì mới gọi
    được phương thức display()
     */
    void display()
    {
        System.out.println("Phương thức này là của lớp ViDuMethod01");
    }

    public static void main(String[] args)
    {
        /*
        Phương thức display() không thể gọi trực tiếp trong hàm main mà không
        thông qua một đối tượng, vì:
        - Do hàm main là một phương thức static
        - Một phương thức static không thể gọi trực tiếp một phương thức không
        là static
         */

        // Tạo đối tượng tên là obj của lớp ViDuMethod01 và lưu vào biến obj
        ViDuMethod01 obj = new ViDuMethod01();

        // Gọi phương thức display() thông qua đối tượng obj
        // Dùng đối tượng obj để gọi phương thức display()
        obj.display();

        System.exit(0);
    }
}
