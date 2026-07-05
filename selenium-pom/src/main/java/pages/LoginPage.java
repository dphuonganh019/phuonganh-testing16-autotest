package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    //1. Tìm tên thẻ: input, button, a, p, h1, h2
    //2. tìm theo class name
    //3. tìm theo id, placeholder, name
    //4. tìm theo quan hệ cha-con
    // Ưu tiên cao nhất: tìm theo id -> name -> placeholder -> classname

//    <input data-v-1f99f73c=""
//    class="oxd-input oxd-input--active"
//    name="username" placeholder="Username" autofocus="">

    private static final By USERNAME_INPUT = By.xpath("//input[@name='username']");
    private static final By PASSWORD_INPUT = By.xpath("//input[@name='password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open() {
        String url = "https://opensource-demo.orangehrmlive.com/";
        driver.get(url);
        wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_INPUT));
    }

    public void enterUsername(String username) throws InterruptedException {
        WebElement usernameInput = driver.findElement(USERNAME_INPUT);
        highlight(usernameInput);
        usernameInput.sendKeys(username);
        Thread.sleep(2000);
        unhighlight(usernameInput);
    }

    public void enterPassword(String password) throws InterruptedException {
        WebElement passwordInput = driver.findElement(PASSWORD_INPUT);
        highlight(passwordInput);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        unhighlight(passwordInput);
    }

    public void clickLoginBtn() throws InterruptedException {
        WebElement loginBtn = driver.findElement(LOGIN_BUTTON);
        highlight(loginBtn);
        loginBtn.click();
        Thread.sleep(2000);
        unhighlight(loginBtn);
    }

    public void login(String username, String password) throws InterruptedException {
        open();
        enterUsername(username);
        enterPassword(password);
        clickLoginBtn();
    }
}
