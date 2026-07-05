public class LoginTest extends BaseTest{
    private LoginPage loginPage = new LoginPage();
    @Override
    public void runTest() {
        loginPage.login("admin", "123456");
        System.out.println("Check login success");
        boolean check = loginPage.verifyLoginSuccess("admin", "123456");
        if (check) {
            System.out.println("[PASS] Login Success");
        }

    }

    public void runTestFail() {
        loginPage.login("admin", "1234567");
        System.out.println("Check login success");
        boolean check = loginPage.verifyLoginSuccess("admin", "1234567");
        if (!check) {
            System.out.println("[PASS] Login Fail");
        }
    }
}
