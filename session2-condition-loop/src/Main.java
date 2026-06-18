import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // BÀI1: Kiểm tra số dương hay là số âm
//        Scanner scan = new Scanner(System.in);
//        //input number từ bàn phím
//        System.out.println("Please input your number");
//        int number = scan.nextInt();
//        // output số âm hoặc số dương
//        if (number >= 0) {
//            System.out.println("Your number is positive");
//        } else {
//            System.out.println("Your number is negative");
//        }

//        // Bài 2: Kiểm tra số chẵn số lẻ
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please input your number");
//        int number = scan.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Số bạn nhập là số chẵn");
//        } else {
//            System.out.println("Số bạn nhập là số lẻ");
//        }

        // Bài 3: Xếp loại điểm học sinh
        // >= 9 -> 10 xuất sắc
        // >= 8 giỏi
        // >= 6.5 => khá
        // >= 5 trung bình
        // < 5 => yếu
        // < 0 và > 10 => lỗi
        // không phải số => lỗi
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhập điểm của học sinh");
//        float number = scan.nextFloat();
//        if ( number < 0 || number > 10) {
//            System.out.println("Điểm đã nhập không phù hợp");
//        } else if ( number >=9) {
//            System.out.println("Xuất sắc");
//        } else if ( number >=8) {
//            System.out.println("Giỏi");
//        } else if ( number >= 6.5) {
//            System.out.println("Khá");
//        } else if ( number >= 5) {
//            System.out.println("Trung Bình");
//        } else {
//            System.out.println("Yếu");
//        }
        // bài 3: kiểm tra đăng nhập
        // đúng username và password -> thành công
        // ngược lại -> thất bại
        // username: admin
        // password: 123456
        // status: active

        // c1: đúng cả 3
        // c2: đúng u sai p
        // c3: đúng p sai u
        // c4: đúng u đúng p sai s
        // c5: sai u sai p
        // c6: empt u
        // c7: empt p
        // c8: emp u empt p
//        String username = "admin";
//        String password = "1234567";
//        boolean isActive = true;
//        if (username.isEmpty() || password.isEmpty()) {
//            System.out.println("Lỗi: Tài khoản hoặc mật khẩu không được để trống");
//        } else if (!isActive) {
//            System.out.println("Status không phải active");
//        } else if (!username.equals("admin") || !password.equals("123456")) {
//            System.out.println("Tài khoản hoặc mật khẩu không đúng");
//        } else {
//            System.out.println("Đăng nhập thành công");
//        }

        // Bài 4: Tính tiền vé theo độ tuổi và loại vé
        // Input
        // Tuổi, loại vé
        // Trẻ em < 12 = free
        // Người cao tuổi >= 60 = 50,000 cho tất cả loại vé
        // Người lớn:
        // Vip: 200k
        // Thường: 150k
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhập tuổi của bạn");
//        int age = Integer.parseInt(scan.nextLine());
//        System.out.println("Nhập loại vé bạn muốn mua");
//        String type = scan.nextLine();
//
//        if ( age < 12) {
//            System.out.println("Vé được miễn phí cho trẻ em");
//        } else if ( age >= 60 && type.equalsIgnoreCase("VIP") || type.equalsIgnoreCase("Thường")) {
//            System.out.println("Vé có giá 50,000");
//        } else if (!type.equalsIgnoreCase("VIP") || !type.equalsIgnoreCase("Thường")) {
//            System.out.println("Vui lòng chỉ chọn một trong hai loại vé: VIP hoặc Thường");
//        } else if ( age < 60 && age > 11) {
//            if (type.equals("VIP")) {
//                System.out.println("Giá vé của bạn là 200,000");
//            } else if (type.equals("Thường")) {
//                System.out.println("Giá vé của bạn là 150,000");
//            }
//        }
//        // Bài 5: Tìm số nguyên lớn nhất trong 3 số
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Vui lòng nhập số đầu tiên:");
//        int a = scan.nextInt();
//        System.out.println("Vui lòng nhập số thứ 2:");
//        int b = scan.nextInt();
//        System.out.println("Vui lòng nhập số thứ 3:");
//        int c = scan.nextInt();
//        if ( a > b && a > c) {
//            System.out.println("Số lớn nhất là: " + a);
//        } else if ( b > a && b > c) {
//            System.out.println("Số lớn nhất là: " + b);
//        } else if ( a==b && a==c) {
//            System.out.println("Ba số bằng nhau");
//        } else {
//            System.out.println("Số lớn nhất là: " + c);
//        }
        //. II. Loop
//        // Bài 1: In các số từ 1-50
//        int n = 50;
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }
//        // Bài 2: In các số chẵn từ 1 - 50
//        int n = 50;
//        for (int i = 1; i <=n; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        // Bài 3: Tính tổng các số từ 1 -> n
//        int n = 50;
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Tổng từ 1 -> n là " +sum);

        // Bài 4: In bảng cửu chương 5
        int n = 10;
        int tich = 0;
        for (int i = 1; i <= n; i++) {
            tich = i * 5;
            System.out.println(5 + "x" + i + "= " + tich);
        }
    }
}