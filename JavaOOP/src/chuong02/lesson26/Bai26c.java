package chuong02.lesson26;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.6: Tìm hiểu lớp String
 * Ví dụ: Các ký tự đặc biệt
 */
public class Bai26c {
    public static void main(String[] args) {
        // Một số ký tự đặc biệt
        // \"
        var someMessage = "Tôi tên là : \"Huỳnh Lê Bảo\"";
        System.out.println(someMessage);

        someMessage = "Bạn Bảo rất 'đẹp trai'";
        System.out.println(someMessage);

        // \n
        var message = "Cho\nbố\ncái\nđịa\nchỉ?";
        System.out.println(message);

        // \t
        // message = STR."Welcome to\{tab}Branium\{tab}Academy";
        message = "Welcome to\tBranium\tAcademy";  // Sửa lại ở đây
        System.out.println(message);

        // \\
        var path = "C:\\Users\\btech\\OneDrive\\Documents\\NetBeansProjects\\JavaSwing";
        System.out.println(path);
    }
}

