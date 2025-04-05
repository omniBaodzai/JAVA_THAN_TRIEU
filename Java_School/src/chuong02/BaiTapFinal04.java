package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Bài tập final 04: final với lớp (Ngăn chặn kế thừa)
 - Tạo lớp Bank với một phương thức getInterestRate().
 - Đánh dấu Bank là final.
 - Thử tạo lớp VietcomBank kế thừa Bank và xem lỗi biên dịch.
 */
// Lớp Bank được khai báo là final
final class Bank
{
    // Phương thức để lấy tỷ lệ lãi suất
    double getInterestRate()
    {
        return 5.0;  // Giả sử tỷ lệ lãi suất là 5%
    }
}

// Lớp VietcomBank cố gắng kế thừa từ Bank - sẽ gây lỗi biên dịch
//class VietcomBank extends Bank {   Lỗi: Không thể kế thừa lớp final
    // ...
//}

public class BaiTapFinal04
{
    public static void main(String[] args)
    {
        //VietcomBank vcb = new VietcomBank();
        //System.out.println(vcb.getInterestRate());  // Lỗi: Không thể kế thừa lớp Bank
    }
}

