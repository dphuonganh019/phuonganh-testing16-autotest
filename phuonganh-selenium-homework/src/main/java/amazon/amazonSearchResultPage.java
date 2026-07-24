package amazon;

import org.openqa.selenium.By;

public class amazonSearchResultPage {
    // Vì web hiện tại search ra sẽ không giống ảnh bài tập giao, nên sẽ có vài item không có
    //1 Không còn search result như cũ nên sẽ lấy xpath là ô ảnh của kết quả thứ 3
    private static final By PRODUCT_IMAGE_THIRD_RESULT = By.xpath("(//div[@role='listitem'])[3]/descendant::div[@data-cy='image-container']");

    //2 Lấy xpath giá gốc của kết quả thứ 4
    private static final By ORIGINAL_PRICE_FORTH_RESULT = By.xpath("(//div[@role='listitem'])[4]/descendant::div[contains(@class,'inline-block')]");

    //3 Lấy xpath giá hiện tại của kết quả thứ 5
    private static final By CURRENT_PRICE_FIFTH_RESULT = By.xpath("(//div[@role='listitem'])[5]/descendant::div[@data-cy='price-recipe']");

    //4
    private static final By INPUT_SEARCH_BOX = By.xpath("//input[@id='twotabsearchtextbox']");

    //5
    private static final By ICON_CART = By.xpath("//a[@id='nav-cart']");

    //6 Không có trên web hiện tại
    //7 Không có trên web hiện tại

    //8 Tên sản phẩm search result thứ 3
    private static final By PRODUCT_TITLE_THIRD_RESULT = By.xpath("(//div[@role='listitem'])[3]/descendant::div[@data-cy='title-recipe']//a");

    //9 Dự kiến ngày giao hàng của search result thứ 2, trong ảnh bt là lấy cả cục delivery Mon, Dec 9,
    // nhưng web hiện tại thì dòng đó có thêm cả giá tiền vận chuyển đến VN, nên e viết 2 loại xpath, 1 cái lấy cả cục, 1 cái chỉ lấy date
    // Xpath lấy cả cục "VND 1,069,239 delivery Mon, Aug 10"
    private static final By DELIVERY_INFO_SECOND_RESULT = By.xpath("(//div[@role='listitem'])[2]/descendant::div[@data-cy='delivery-recipe']/descendant::div[@data-cy = 'delivery-block']");
    // Xpath chỉ lấy Date
    private static final By DELIVERY_DATE_SECOND_RESULT = By.xpath("(//div[@role='listitem'])[2]/descendant::div[@data-cy='delivery-recipe']/descendant::span[@id = 'WVCRIAFWG']");

    //10 Xpath lấy tên brand của kết quả thứ nhất
    private static final By TITLE_BRAND_FIRST_RESULT = By.xpath("(//div[@role='listitem'])[1]/descendant::div[@data-cy='title-recipe']//div//h2");

    //11 Không có trên web hiện tại

    //12
    private static final By CHECKBOX_GENDER_MEN = By.xpath("//span[text() = 'Men']/../descendant::input[@type='checkbox']");

    //13
    private static final By LABEL_RESULTS_COUNT = By.xpath("//span[@data-component-type = 's-result-info-bar']//descendant::h2//span[1]");
}
