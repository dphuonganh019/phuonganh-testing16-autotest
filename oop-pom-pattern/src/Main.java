//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // tao ca test case cho page login

        //BaseTest - class cha
        // - set up moi truong gia lap chay test case
        // - clear moi truong ve ban dau
        // LoginTest - class con
        // Define cac testcase

        // Page Object Model
        // LoginPage
        // thuoc tinh:
        // usernameLocator
        // passwordLocator
        // loginButtonLocator
        // Phuong thuc:
        // step1: enterUsername
        // step2: enterPassword
        // step3: clickLoginButton
        // ham kiem tra expected - actual

        // class de set up cac browser test
        // class cha: BrowserDriver
        // class con: ChromeDriver, SafariDriver
        LoginTest test1 = new LoginTest();
        test1.runTest();
        test1.runTestFail();
    }
}