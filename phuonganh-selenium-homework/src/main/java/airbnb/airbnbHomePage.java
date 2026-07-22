package airbnb;

import org.openqa.selenium.By;

public class airbnbHomePage {
    // xác định locator trên web https://demo5.cybersoft.edu.vn/
    //1 logo ở header
    private static final By LOGO_HEADER = By.xpath("//span[text() = 'CyberSoft']");
    //2 Home
    private static final By HOME = By.xpath("//a[text() = 'Home']");
    //3 About
    private static final By ABOUT = By.xpath("//a[text() = 'About']");
    //4 Profile
    private static final By PROFILE = By.xpath("//button//img");
    //5 Địa điểm
    private static final By LOCATION_INPUT_FIELD = By.xpath("//p[text() = 'Địa điểm']/..");
    //6 Chọn ngày
    private static final By SELECTED_DATE = By.xpath("//div[contains(@class, 'col-span-4 flex-1 smm:h-16 p-3')]//p");
    //7 chọn số lượng khách
    private static final By GUESS_NUMBER = By.xpath("//p[text() = 'Thêm khách']/..");
    // 8 Tăng số lượng khách
    private static final By ADD_GUESS_NUMBER = By.xpath("//div[text() = '+']/..");
    // 9 Giảm số lượng khách
    private static final By MINUS_GUESS_NUMBER = By.xpath("//div[text() = '-']/..");
    // 10 Hồ Chí Minh
    private static final By HO_CHI_MINH_SELECTION = By.xpath("(//a[contains(@href, '/rooms/ho-chi-minh')])[1]");
    // 11 Cần Thơ
    private static final By CAN_THO_TXT = By.xpath("//h2[text() = 'Cần Thơ']");
    // 12 Loại nơi ở
    private static final By ACCOMMODATION_TYPE = By.xpath("//button[text() = 'Loại nơi ở']");
    // 13 Giá
    private static final By PRICE = By.xpath("//button[text() = 'Giá']");
    //14 Thời gian di chuyển ra Nha Trang
    private static final By TIME_TO_NHA_TRANG = By.xpath("//h2[text() = 'Nha Trang']/following-sibling::p");
}
