package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends BasePage{
    private static final By USER_INPUT = By.xpath("(//input[@class = 'oxd-input oxd-input--active'])[2]");
    private static final By USER_ROLE_SELECT = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
    private static final String ROLE_OPTION = "//div[@role='option']//span[text() = '%s']";
    private static final By SEARCH_BUTTON = By.xpath("//button[@type='submit']");
    private static final By dataRows = By.xpath("//div[@class='oxd-table-card']");
    private static final By RECORD_COUNT_TXT = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span");

    public AdminPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open() {
        Allure.step("Open Admin Page", () -> {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        });
    }

    public void enterUsername(String username) throws InterruptedException {
        Allure.step("Enter username: " + username, () -> {
            WebElement userInput = wait.until(ExpectedConditions.visibilityOfElementLocated(USER_INPUT));
            highlight(userInput);

            userInput.sendKeys(username);
            unhighlight(userInput);
            Thread.sleep(1000);
        });

    }

    public void selectUserRole(String role) throws InterruptedException {
        Allure.step("Select user role: " + role, () -> {
            WebElement roleSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(USER_ROLE_SELECT));
            highlight(roleSelect);
            roleSelect.click();
            unhighlight(roleSelect);

            WebElement adminRoleOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(ROLE_OPTION, role))));
            highlight(adminRoleOption);
            adminRoleOption.click();
            unhighlight(adminRoleOption);
            Thread.sleep(1000);
        });
    }

    public void clickSearchBtn() throws InterruptedException {
        Allure.step("Click search button", () -> {
            WebElement searchBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_BUTTON));
            highlight(searchBtn);
            searchBtn.click();
            Thread.sleep(2000);
            unhighlight(searchBtn);
        });
    }

    public void filterByUser(String username, String role) throws InterruptedException {
        enterUsername(username);
        selectUserRole(role);
        clickSearchBtn();
    }

    public boolean checkNumberOfRecords() {
        return Allure.step("Check number of records", () -> {
            WebElement recordCountText = wait.until(ExpectedConditions.visibilityOfElementLocated(RECORD_COUNT_TXT));
            String text = recordCountText.getText();
            int count = Integer.parseInt(text.replaceAll("\\D+",""));
            System.out.println("Number of records: " + count);

            // findElements tra ve cac list element -> List<WebElement>
            int countDataRows = driver.findElements(dataRows).size();

            return count == countDataRows;
        });
    }
}
