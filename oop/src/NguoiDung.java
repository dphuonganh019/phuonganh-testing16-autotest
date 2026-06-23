public class NguoiDung {
    // define các biến chứa thông tin người dùng
    // thuộc tính của đối tượng - attribute, property
    String maNguoiDung;
    String hoTen;
    String diaChi;
    String gioiTinh;
    String ngaySinh;

    // Phương thức, hành động (method) - function

    public void showInfor() {
        System.out.println("Mã Người Dùng: " + maNguoiDung);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Ngày sinh: " + ngaySinh);
    }
}
