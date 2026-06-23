import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void inPhanTuMang(int[] arrNum) {
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(arrNum[i]);
        }
    }

    static int tongCacPhanTuMang(int[] arrNum) {
        int sum = 0;
        for (int i = 0; i < arrNum.length;i++) {
            sum += arrNum[i]; // tương đương sum = sum + arrNum1[i]
        }
        return sum;
    }

    static int[] maxMinArray(int[] arrNum1) {
        int max = arrNum1[0];
        int min = arrNum1[0];
        int[] tupleMaxMin = new int[2];
        for (int i = 1; i < arrNum1.length;i++) {
            if (arrNum1[i] > max) {
                max = arrNum1[i];
            }
            if (arrNum1[i] < min) {
                min = arrNum1[i];
            }
        }
        tupleMaxMin[0] = max;
        tupleMaxMin[1] = min;
        return tupleMaxMin;
    }
    static int findSecondMax(int[] arrNum1) {
        int maximum = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arrNum1.length; i++) {
            if (arrNum1[i] > maximum) {
                secondMax = maximum;
                maximum = arrNum1[i];
            } else if (arrNum1[i] > secondMax && arrNum1[i] < maximum) {
                secondMax = arrNum1[i];
            }
        }
        return secondMax;
    }

    static int timViTriPhanTu(int[] arrNum1) {
        int target1 = 6;
        int viTri = -1;
        for (int i = 0; i < arrNum1.length; i++) {
            if (arrNum1[i] == target1) {
                viTri = i;
                break;
            }
        }
        return viTri;
    }

    static String removeNguyenAm(String str) {
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
        return result;
    }
    // Tính tổng các chữ số của 1 số
    static int sumChuSo(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
    // Đếm số chữ số của 1 số
    // VD: 123456 => 6
    static int demChuSo(long num) {
        int count = 0;
        long soChuSo = num;
        while (soChuSo > 0) {
            soChuSo = soChuSo/10;
            count++;
        }
        return count;
    }

    // Đảo số
    static int daoNguocSo(int number) {
        int soDaoNguoc = 0;
        int result = number;
        while (result > 0) {
            int chuSoCuoi = result % 10;
            soDaoNguoc = soDaoNguoc * 10 + chuSoCuoi;
            result = result / 10;
        }
        return soDaoNguoc;
    }

    // In hình chữ nhật
    static void inHinhChuNhat(int dai, int rong) {
        for (int i = 0; i < rong; i++) {
            for (int j = 0; j < dai; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // In tam giác vuông
    static void inTamGiacVuong(int doDai) {
        for (int i = 0; i <= doDai; i++){
            for(int j = 0; j <= doDai; j++) {
                if (j <= i) {
                    System.out.print("*  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //in tam giác vuông
        inTamGiacVuong(5);
// I. Mảng - Array
        // Mảng số nguyên
        //cách 1 tạo 1 mảng số nguyên và gán giá trị sẵn
        int[] arrNum = {1, 2, 3, 4, 5, 6, 7};
        inPhanTuMang(arrNum);
        //2. nhập từng phần tử của mảng
        // phần 1: khai báo số lượng phần tử của mảng
        // phần 2: nhập từng phần tử của mảng
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng phần tử của mảng");
        n = scan.nextInt();
        int[] arrNum1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + (i + 1));
            arrNum1[i] = scan.nextInt();
        }
        System.out.println("Các giá trị trong arrNum1 là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrNum1[i]);
        }
//        // Bài 1 tính tổng các số có trong mảng
        int sum = tongCacPhanTuMang(arrNum1);
        System.out.println("Tổng phần tử trong mảng là: " + sum);
       // bài 2: tìm phần tử min, max trong mảng
        int max = maxMinArray(arrNum1)[0];
        int min = maxMinArray(arrNum1)[1];
        System.out.println("Max của mảng vừa nhập là: " + max);
        System.out.println("Min của mảng vừa nhập là: " + min);

        // Bài 3: Nhập số cần tìm, In ra vị trí của số cần tìm, nếu không tìm thấy thì in ra -1
        // VD [1, 2, 3, 4, 5], target = 3, output: 2
        // VD [1, 2, 3, 4, 5], target = 6, output: -1
        int viTri = timViTriPhanTu(arrNum1);
        System.out.println("Vị trí của số cần tìm là: " + viTri);
        // Bài tìm số lớn thứ 2
        int secondMax = findSecondMax(arrNum1);
        System.out.println("Số lớn thứ hai là: " + secondMax);

        // Bài xóa hết tất cả nguyên âm trong chuỗi
        String str = "Cybersoft";
        String result = removeNguyenAm(str);
        System.out.println(result);

        //Bài tính các tổng chữ số
        int number = 1030;
        int tong = sumChuSo(number);
        System.out.println("Tổng các chữ số: " + tong);
        int soDaoNguoc = daoNguocSo(number);
        System.out.println("Số đảo ngược của số đã cho là: " + soDaoNguoc);

        long num = 12345678L;
        int SoChuSo = demChuSo(num);
        System.out.println("Số chữ số là: " + SoChuSo);

        //in hình chữ nhật
        int dai = 10;
        int rong =5;
//        inHinhChuNhat(dai, rong);


    }
}