public class LoginPage {
    // define cac locator, element
    private String usernameLocator = "//div[@id = 'username']";
    private String passworLocator = "//div[@id = 'password']";
    private String loginButtonLocator = "//button[@id = 'login-button']";

    // step1: enterUsername
    public void enterUsername(String username) {
        System.out.println("Enter username: " + username);
    }

    // step2: enterPassword
    public void enterPassword(String password) {
        System.out.println("Enter password: " + password);
    }
    // step3: click login button
    public void clickLoginButton() {
        System.out.println("Click login button");
    }

    //Gom 3 step nay ve 1 function
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    // function kiem tra expected - actual
    public boolean verifyLoginSuccess(String username, String password) {
        if (username.equals("admin") && password.equals("123456")) {
            return true;
        }
        return false;
    }
}
