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

        // Có 2 loại hàm khởi tạo.
        // 1. Ko có tham số, sẽ lấy giá trị mặc định. VD: Dog()
        // 2. Hàm khởi tạo có tham số
        // - Mặc định: nếu không khởi tạo hàm khởi tạo, java sẽ auto tạo hàm khởi tạo ko tham số

        Dog dog1 = new Dog();
        dog1.name = "Chihuahua";
        dog1.eat();
        dog1.bark();

        Dog dog2 = new Dog("Rex", "begie");
        dog2.bark();

        // VD2: QUẢN LÝ NHÂN VIÊN
        // Developer, Tester, ProjectManager
        // Thông tin chung: employeeID, name, basic salary, level: fresher, junior, middle
        // Đặc trưng riêng của các title:
        // Deverloper: salary: fresher -> 6tr, junior -> 11tr + phụ cấp, middle: 11tr + phụ cấp + hiệu suất công việc
        // Tester: salary: fresher -> 6tr, junior -> 10tr + phụ cấp, middle: 10tr + phụ cấp + KPI
        // PM: salary = 15tr + phụ cấp + thưởng dự án
        //

        Developer dev1 = new Developer("NV01", "Nguyen Van A", 11000000, "Gui xe", "Junior", "A");
        dev1.showInfor();
        System.out.println("Salary: " + dev1.calculateSalary());

        Tester tester1 = new Tester("NV02", "Yen Nhi", 10000000, "Gui xe", "Junior", "5");
        tester1.showInfor();
        System.out.println("Salary: " + tester1.calculateSalary());

        ProjectManager projectManager1 = new ProjectManager("NV03", "Tran Van C", 15000000, "Nha o", 3, "Yes");
        projectManager1.showInfor();

        // Tinh chat 2: Tinh dong goi
        // public, private, protected

        // Tinh chat 3: tinh truu tuong
        // classs cha chi dung de class con ke thua chu khong the tao doi tuong
    }
}