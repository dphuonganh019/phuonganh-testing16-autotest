import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Khai báo biến
        // 2. Toán tử
        // 3. Phép toán so sánh
        // 4. Phép toán nối các điều kiện &&, ||
        // 5. condition, loop
        // 6. function
        // 7. Lập trình hướng đối tượng (OOP): kế thừa, đóng gói, trừu tượng
        // Tool AI: ChatGPT, Gemini, Claude,...
        // Web học java cơ bản: Leetcode,..
        // 1. Xuất giá trị ra ngoài terminal
        System.out.println("Hello testing 16");
        // 2. Khai báo biến
        int number1 = 16;
        String str1 = "Testing";
        System.out.println(number1);
        System.out.println(str1);
        System.out.println(str1 + " " + number1);
        // 3. Các phép toán
        int num1 = 10;
        int num2 = 25;
        int num3 = 30;
        int num4 = 66;
        int sum = num1 + num2;
        System.out.println(sum);
        System.out.println(num2 - num1);
        // num++, ++num
        // num--, --num
//        int result = ++num1;
//        System.out.println(result);
        // Chia lấy nguyên: /
        int phepChiaLayNguyen = num2/num1;
        System.out.println(phepChiaLayNguyen);
        // Chia lấy dư: %
        int chiaLayDu = num2 % num1;
        System.out.println("số dư là: " + chiaLayDu);

        // Phép toán nối các điều kiện
        boolean kiemTra3 = (num1 > num2) && (num2 > num3) && (num3 > num4);
        // true && true = true
        // Các trường hợp còn lại false

        boolean kiemTra4 = (num1 > num2) || (num2 > num3) || (num3 > num4);
        // chỉ cần 1 true -> true
        // không có true nào -> false
        // tư duy mô hình 3 khối: input + process + output

        // B1: Tính tổng 3 số nguyên từ bàn phím
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời bạn nhập số thứ 1");
        int so1 = Integer.parseInt(scan.nextLine());
        System.out.println("Mời bạn nhập số thứ 2");
        int so2 = Integer.parseInt(scan.nextLine());
        System.out.println("Mời bạn nhập số thứ 3");
        int so3 = Integer.parseInt(scan.nextLine());

        int tong = so1 + so2 + so3;
        System.out.println("Tổng 3 số bạn nhập là: " + tong);

        int phepTru = so3 - so2 - so1;
        System.out.println("Hiệu của 3 số bạn nhập là: " + phepTru);

        int phepNhan = so1 * so2 * so3;
        System.out.println("Tích của 3 số bạn nhập là: " + phepNhan);

        // Bai2: Nhập tên của bạn và in ra nội dung là "Xin chào <tên>"
        System.out.println("Tên của bạn là gì?");
        String ten = scan.nextLine();
        System.out.println("Xin chào " + ten);
    }
}