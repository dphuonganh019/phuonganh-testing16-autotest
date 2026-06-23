//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tạp đối tượng người dùng
        NguoiDung user1 = new NguoiDung();
        user1.maNguoiDung = "001";
        user1.hoTen = "Nguyễn Văn A";
        user1.ngaySinh = "1990/01/01";
        user1.showInfor();

        NguoiDung user2 = new NguoiDung();
        user2.maNguoiDung = "002";
        user2.hoTen = "Nguyễn Văn B";
        user2.showInfor();


    }
}