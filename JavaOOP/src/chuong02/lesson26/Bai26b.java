package chuong02.lesson26;

/**
 * Chương 02: Nhập môn lập trình Java
 * Bài 2.6: Tìm hiểu lớp String
 * Ví dụ: Nối chuỗi
 */
public class Bai26b {
    public static void main(String[] args) {
        String firstName = "Bảo";
        String lastName = "Huỳnh";
        String middleName = "Lê";

        // Toán tử +
        var fullName1 = lastName + " " + middleName + " " + firstName;

        // Phước thức concat()
        var fullName2 = lastName.concat(" ")
                .concat(middleName)
                .concat(" ")
                .concat(firstName);

        // String template
        // var fullName3 = STR."\{lastName} \{middleName} \{firstName}";
        var fullName3 = String.format("%s %s %s", lastName, middleName, firstName);

        System.out.println(fullName1);
        System.out.println(fullName2);
        System.out.println(fullName3);
    }
}
