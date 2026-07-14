package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    public static WebDriver createDriver(String browser, String deviceName) {
        // TH khong truyen browser/device, setup gia tri mac dinh
        if (browser == null || browser.isEmpty()) {
            browser = "chrome";
        }

        // dung switch case
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();

                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");

                return new FirefoxDriver(firefoxOptions);
            case "edge":
                WebDriverManager.edgedriver().setup();

                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");

                return new EdgeDriver(edgeOptions);
            default:
                WebDriverManager.chromedriver().setup();

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                if (deviceName != null && !deviceName.isEmpty()) {
                    //chrome yeu cau co 1 map chua key deviceName de bat dau gia lap device
                    Map<String, String> mobileEmulation = new HashMap<>();
                    mobileEmulation.put("deviceName", deviceName.trim());
                    chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                } else {
                    chromeOptions.addArguments("--start-maximized");
                }
                return new ChromeDriver(chromeOptions);
        }
    };
}
