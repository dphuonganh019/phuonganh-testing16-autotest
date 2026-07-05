public abstract class Employee {
    // Nhung thuoc tinh doi tuong bat buoc de private
    private String ID;
    private String name;
    private int basicSalary;
    private String phuCap;

    public String getID() {
        return ID.toUpperCase();
    }

    public void setID(String ID) {
        // Kiem tra kieu du lieu
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) throws Exception {
        if (basicSalary < 0) {
            throw new Exception("Basic salary must be greater than 0");
        }
        this.basicSalary = basicSalary;
    }

    public String getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(String phuCap) {
        this.phuCap = phuCap;
    }

    public Employee() {
        basicSalary = 6000000;
    }

    public Employee(String ID, String name, int basicSalary, String phuCap) {
        this.ID = ID;
        this.name = name;
        this.basicSalary = basicSalary;
        this.phuCap = phuCap;
    }

    public void showInfor() {
        System.out.println("=================");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Phu cap: " + phuCap);
    }

    // ham truu tuong
    // bat buoc class con phai define lai ham nay
    // ham nay khong co than ham
    public abstract int calculateSalary();
}
