package tests;

import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.CsvReader;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class LoginTest extends BaseTest {

    @Test(description = "Test Login Success")
    public void testLoginSuccess() throws InterruptedException {
        // Khoi tao doi tuong LoginPage
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login("Admin", "admin123");

        // kiem tra expected - actual result
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dashboard"));
    }
    @Test(description = "Test Login Fail")
    public void testLoginFail() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login("Admin1", "admin1234");
        // kiem tra expected - actual result
        String currentUrl = driver.getCurrentUrl();
        Assert.assertFalse(currentUrl.contains("dashboard"));
    }

    // Tao data provider
    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() throws IOException {
        String filePath = "src/test/resources/loginData.csv";

        List<String[]> data = CsvReader.readCsv(filePath);

        return CsvReader.toDataProviderArray(data);
    }

    @Test(description = "Test login data provider", dataProvider = "loginData")
    public void testDataLogin(String username, String password, String expectedResult) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login(username, password);

        if(expectedResult.equalsIgnoreCase("success")) {
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("dashboard"));
        } else {
            Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"));
        }
    }
}
