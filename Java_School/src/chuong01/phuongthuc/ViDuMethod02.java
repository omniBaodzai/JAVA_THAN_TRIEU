package chuong01.phuongthuc;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Method
 */
public class ViDuMethod02
{
    /*
    Khi có từ khóa static thì phương thức display() trở thành phương thức static
    Nó có thể được gọi trực tiếp trong hàm main mà không cần tạo đối tượng
    của lớp đó
     */
    static void display()
    {
        System.out.println("Phương thức này là của lớp ViDuMethod02");
    }

    public static void main(String[] args)
    {
        /*
        Phương thức display() có thể gọi trực tiếp trong hàm main mà không
        cần tạo một đối tượng, vì:
        - Do hàm main là một phương thức static
        - Một phương thức static có thể gọi trực tiếp một phương thức static
         */

        // Gọi trực tiếp phương thức display()
        display();

        System.exit(0);
    }
}
