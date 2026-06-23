import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cấp độ 1
        // Bài 3: Viết một hàm tính tổng các số chẵn từ 0 đến một số nguyên dương n cho trước.
        // Hàm nhận vào một số nguyên dương n.
        // Trả về tổng của tất cả các số chẵn từ 0 đến n.

        Scanner scan = new Scanner(System.in);
        System.out.println("Vui lòng nhập số nguyên dương n");
        int n = Integer.parseInt(scan.nextLine());
        // Khai báo mảng số từ 0 -> n
        int[] arrNum = new int[n+1]; // Vì đề bài yêu cầu từ 0 nên số phần tử mảng  = n+1
        for (int i = 0; i <= n;i++) {
            arrNum[i] = i;
        }
        System.out.println(Arrays.toString(arrNum));
        int sum = 0;
        for (int i = 0; i < n;i++) {
            if (arrNum[i] % 2 == 0) {
                sum += arrNum[i];
            }
        }
        System.out.println("Tổng tất cả các số chẵn từ 0 đến n là: " + sum);

        // Bài 4: Viết một hàm đếm số từ trong một chuỗi.
        System.out.println("Vui lòng nhập một câu:");
        String input = scan.nextLine();
        // Xóa khoảng trắng đầu cuối và thay thế khoảng trắng dính chùm ở giữa thành đúng 1 space
        String cleanInput = input.trim().replaceAll("\\s+", " ");
        if (cleanInput.isBlank()) {
            System.out.println("Không có từ nào trong câu của bạn!");
        } else {
            int space = 0;
            for (int i = 0;i < cleanInput.length();i++) {
                if (cleanInput.charAt(i) == ' ') {
                    space++;
                }
            }
            int soTu = space + 1;
            System.out.println("Số từ trong câu bạn vừa nhập là: " + soTu);
        }

        // Bài 5: Viết một hàm in ra chữ cái đầu tiên của mỗi từ trong một chuỗi.
        // Hàm nhận vào một chuỗi.
        // Trả về chuỗi chứa các chữ cái đầu của mỗi từ.
        System.out.println("Vui lòng nhập một câu:");
        String string = scan.nextLine();
        String cleanString = string.trim().replaceAll("\\s+", " ");
        String output = "";
        for (int i = 0; i < cleanString.length(); i++) {
            if (i == 0 && cleanString.charAt(i) != ' ') {
                output = output + Character.toUpperCase(cleanString.charAt(i)) + " ";
            } else if (i > 0 && cleanString.charAt(i - 1) == ' ' && cleanString.charAt(i) != ' ') {
                output = output + Character.toUpperCase(cleanString.charAt(i)) + " ";
            }
        }
        output = output.trim();
        System.out.println("Chữ cái đầu tiên của mỗi từ trong câu bạn nhập là: " + output);

        // Cấp 2
        // Bài 1: Viết một chương trình Java tính thuế thu nhập cá nhân dựa trên mức thu nhập hàng năm của
        // một người. Chương trình sẽ yêu cầu người dùng nhập thu nhập hàng năm và sau đó tính thuế dựa
        // trên các mức thuế sau:
        //1.Thu nhập từ 0 đến 5 triệu đồng: 5%
        //2.Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
        //3.Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
        //4.Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
        //5.Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
        //6.Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
        //7.Thu nhập trên 80 triệu đồng: 35%
        //Yêu cầu:
        //1.Nhập thu nhập hàng năm từ người dùng.
        //2.Tính số thuế phải trả theo từng mức thuế suất.
        //3.Xuất số thuế phải trả.

        System.out.println("Vui lòng nhập số thu nhập hàng năm của bạn:");
        double income = Double.parseDouble(scan.nextLine());
        double moc1 = 5000000;
        double moc2 = 10000000;
        double moc3 = 18000000;
        double moc4 = 32000000;
        double moc5 = 52000000;
        double moc6 = 80000000;
        double tax = 0;

        if (income <= moc1) {
            tax = income * 0.05;
        } else if (income <= moc2) {
            tax = moc1 * 0.05 + (income - moc1) * 0.1;
        } else if (income <= moc3) {
            tax = moc1 * 0.05 + (moc2 - moc1) * 0.1 + (income - moc2) * 0.15;
        } else if (income <= moc4) {
            tax = moc1 * 0.05 + (moc2 - moc1) * 0.1 + (moc3 - moc2) * 0.15 + (income - moc3) * 0.2;
        } else if (income <= moc5) {
            tax = moc1 * 0.05 + (moc2 - moc1) * 0.1 + (moc3 - moc2) * 0.15 + (moc4 - moc3) * 0.2 + (income - moc4) * 0.25;
        } else if (income <= moc6) {
            tax = moc1 * 0.05 + (moc2 - moc1) * 0.1 + (moc3 - moc2) * 0.15 + (moc4 - moc3) * 0.2 + (moc5 - moc4) * 0.25 + (income - moc5) * 0.3;
        } else {
            tax = moc1 * 0.05 + (moc2 - moc1) * 0.1 + (moc3 - moc2) * 0.15 + (moc4 - moc3) * 0.2 + (moc5 - moc4) * 0.25 + (moc6 - moc5) * 0.3 + (income - moc6) * 0.35;
        }
        System.out.println("Số thuế bạn phải trả là: " + (long)tax);

        // Bài 2: Kiểm Tra Chuỗi Đối Xứng
        // Mô tả: Viết một hàm kiểm tra xem một chuỗi có phải là chuỗi đối xứng (palindrome) không.
        //Yêu cầu:
        //Hàm nhận vào một chuỗi.
        //Trả về true nếu chuỗi là đối xứng, false nếu không.

        System.out.println("Vui lòng nhập một từ để kiểm tra chuỗi đối xứng");
        String inputStr = scan.nextLine();
        int inputStrLength = inputStr.length();
        boolean isPalindrome = true;
        for (int i =0; i < inputStrLength / 2; i++) {
            if (inputStr.charAt(i) != inputStr.charAt(inputStrLength - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}