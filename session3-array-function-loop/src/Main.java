//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// I. Mảng - Array
        // Mảng số nguyên
        //cách 1 tạo 1 mảng số nguyên và gán giá trị sẵn
//        int[] arrNum = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(arrNum[0]);
//        // In tất cả phần tử của mảng
//        for (int i = 0; i < arrNum.length; i++) {
//            System.out.println(arrNum[i]);
//        }
        //2. nhập từng phần tử của mảng
        // phần 1: khai báo số lượng phần tử của mảng
        // phần 2: nhập từng phần tử của mảng
//        int n;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Mời bạn nhập số lượng phần tử của mảng");
//        n = scan.nextInt();
//        int[] arrNum1 = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Phần tử thứ " + (i + 1));
//            arrNum1[i] = scan.nextInt();
//        }
//        System.out.println("Các giá trị trong arrNum1 là: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(arrNum1[i]);
//        }
//        // Bài 1 tính tổng các số có trong mảng
//        int sum = 0;
//        for (int i = 0; i < n;i++) {
//            sum += arrNum1[i]; // tương đương sum = sum + arrNum1[i]
//        }
//        System.out.println("Tổng các số trong mảng là: " + sum);
//
//        // bài 2: tìm phần tử min, max trong mảng
//        int max = arrNum1[0];
//        int min = arrNum1[0];
//        for (int i = 1; i < n;i++) {
//            if (arrNum1[i] > max) {
//                max = arrNum1[i];
//            }
//            if (arrNum1[i] < min) {
//                min = arrNum1[i];
//            }
//        }
//        System.out.println("Max của mảng vừa nhập là: " + max);
//        System.out.println("Min của mảng vừa nhập là: " + min);

        // Bài 3: Nhập số cần tìm, In ra vị trí của số cần tìm, nếu không tìm thấy thì in ra -1
        // VD [1, 2, 3, 4, 5], target = 3, output: 2
        // VD [1, 2, 3, 4, 5], target = 6, output: -1
//        int[] arrNum2 = {1, 2, 3, 4, 5};
//        int target1 = 6;
//        int viTri = -1;
//        for (int i = 0; i < arrNum2.length; i++) {
//            if (arrNum2[i] == target1) {
//                viTri = i;
//                break;
//        }
//        }
//            System.out.println("Vị trí của số cần tìm là: " + viTri);
        // Bài tìm số lớn thứ 2
        int[] arrNum = {1, 2, 3, 4, 5};
        int n;
        int maximum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > maximum) {
                secondMax = maximum;
                maximum = arrNum[i];
            } else if (arrNum[i] > secondMax && arrNum[i] < maximum) {
                secondMax = arrNum[i];
            }
        }
        System.out.println("Số lớn thứ hai là: " + secondMax);

        // Bài xóa hết tất cả nguyên âm trong chuỗi
        String str = "Cybersoft";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // lấy kí tự thứ i trong mảng kí tự
            char lowerC = Character.toLowerCase(c);
            // cách 1
//            if (lowerC != 'a' && lowerC != 'e' && lowerC != 'i' && lowerC != 'o' && lowerC != 'u') {
//                result += c;
//            }
            // cách 2:
//            if ("ueoai".contains(String.valueOf(lowerC)) == false) {
//                result += c;
//            }
            // cách 3
            if ("ueoai".indexOf(Character.toString(lowerC)) == -1) {
                result += c;
            }
        }
        System.out.println(result);
    }
}