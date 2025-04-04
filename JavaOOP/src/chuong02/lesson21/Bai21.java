package chuong02.lesson21;
/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.1: Chương trình đầu tiên
 */
public class Bai21
{
    /**
     * Đây là phương thức bắt đầu chương trình
     * @param args tham số nhận dữ liệu đầu vào
     */
    // main + Enter
    // psvm + Enter
    public static void main(String[] args)
    {
        // sout + Enter
        // run = Shift + F10/Ctrl + Shift + F10
        // rerun = Ctrl + F5
        // Click chuột phải -> run...
        System.out.println("Hello, World!");

        // Không xuống dòng
        System.out.print("Haha");
        // Hiển thị lỗi: serr (sẽ có màu đỏ)
        System.err.println("Đây là một thông báo lỗi nha");

        // Xuống dòng
        System.out.print("Xin chào Bảo\n");
        System.out.println("Good bye");

        // prinf
        System.out.printf("%s%n", "Huỳnh Lê Bảo");
    }
}