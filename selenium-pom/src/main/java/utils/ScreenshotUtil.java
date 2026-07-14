package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;

public class ScreenshotUtil {
    // Thuoc tinh de tao ra folder luu evidence cho cac testcase
    private static final ThreadLocal<String> testFolder = new ThreadLocal<>();

    // thuoc tinh de luu cac step trong tung test case
    private static final ThreadLocal<Integer> stepCount = new ThreadLocal<>();

    public static void setTestFolder(String folderPath) {
        testFolder.set(folderPath);

        // reset step count ve 0 moi lan tao folder test moi
        stepCount.set(0);
    }

    public static void clear() {
        testFolder.remove();
        stepCount.remove();
    }

    public static void takeScreenshot(WebDriver driver, String stepName) {
        try {
            String testFolderName = testFolder.get();

            String screenshotFolderName = testFolderName + File.separator + "screenshots";
            Files.createDirectories(Paths.get(screenshotFolderName));

            // tang so buoc len 1 don vi
            Integer stepNumber = stepCount.get();
            stepNumber = (stepNumber == null) ? 1 : stepNumber + 1;
            stepCount.set(stepNumber);

            // Quy tac dat ten file: step_01_enterUsername.png
            String fileName = String.format("step_%02d_%s.png", stepNumber, stepName);

            // chup man hinh hien tai -> luu tam thoi vao cache (RAM)
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            // copy anh do vao folder duoc tao
            File destFile = new File(screenshotFolderName, fileName);
            Files.copy(scrFile.toPath(), destFile.toPath());
        } catch (IOException e) {
            System.out.println("Error while taking screenshot" + e.getMessage());
        }
    }
}
