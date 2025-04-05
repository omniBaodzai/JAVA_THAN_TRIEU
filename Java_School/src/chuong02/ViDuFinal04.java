package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ final 04: Từ khóa final với tham chiếu
 *
 */


public class ViDuFinal04
{

    public static void main(String[] args)
    {
        class Person
        {
            String name = "John";
        }
        /*
        - Khi khai báo một biến với từ khóa final, không thể thay đổi giá trị
        của biến tham chiếu sau khi đã gán giá trị cho nó.
        - Tức là không thể thay đổi đối tượng mà biến p trỏ đến.
        - Vẫn có thể thay đổi các trường (fields) của đối tượng mà p trỏ tới,
        miễn là chúng không bị khai báo là final.
         */
        final Person p = new Person();
        /*
        - Khi đã khai báo p là final, thì không thể thay đổi đối tượng mà p
        tham chiếu (không thể gán p cho một đối tượng mới).
         */
        //  p = new Person();   Lỗi: Không thể thay đổi tham chiếu của p vì p là final

        /*
        - Có thể thay đổi giá trị của các thuộc tính của đối tượng mà p
        tham chiếu, chẳng hạn như p.name = "David";
         */
        p.name = "David"; // Hợp lý: Thay đổi nội dung đối tượng

        System.out.println(p.name);
    }
}
