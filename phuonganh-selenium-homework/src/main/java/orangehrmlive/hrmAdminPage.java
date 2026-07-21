package orangehrmlive;

import org.openqa.selenium.By;

public class hrmAdminPage {
    //1
    private static final By ADMIN_LINK = By.xpath("//a//span[text() = 'Admin']");
    //2
    private static final By PIM_LINK = By.xpath("//a//span[text() = 'PIM']");
    //3
    private static final By LEAVE_LINK = By.xpath("//a//span[text() = 'Leave']");
    //4
    private static final By USERNAME_INPUT_FIELD = By.xpath("//label[text() = 'Username']/../following-sibling::*//input");
    //5
    private static final By USER_ROLE_LIST = By.xpath("//label[text() = 'User Role']/../following-sibling::*//div[@class='oxd-select-wrapper']");
    //6
    private static final By ADMIN_ROLE = By.xpath("//div[@role='option']//span[text()='Admin']");
    //7
    private static final By ESS_ROLE = By.xpath("//div[@role='option']//span[text()='ESS']");
    //8
    private static final By EMPLOYEE_NAME_INPUT_FIELD = By.xpath("//label[text()='Employee Name']//..//following-sibling::*//input");
    //9
    private static final By RESET_BUTTON = By.xpath("//button[text()=' Reset ']");
    //10
    private static final By SEARCH_BUTTON = By.xpath("//button[text()=' Search ']");
    //11
    private static final By USER_MANAGEMENT = By.xpath("//span[text()='User Management ']");
    //12
    private static final By USERNAME_VALUE_SECOND_ROW = By.xpath("(//div[@class='oxd-table-card']//div[@role='row'])[2]//div[contains(@class,'oxd-padding-cell')][3]");
    //13
    private static final By USER_ROLE_VALUE_SECOND_ROW = By.xpath("(//div[@class='oxd-table-card']//div[@role='row'])[2]//div[contains(@class,'oxd-padding-cell')][3]");
    //14
    private static final By TRASH_BUTTON_SECOND_ROW = By.xpath("(//div[@class='oxd-table-card']//div[@role='row'])[2]//i[contains(@class,'trash')]");
    //15
    private static final By EDIT_BUTTON_SECOND_ROW = By.xpath("(//div[@class='oxd-table-card']//div[@role='row'])[2]//i[contains(@class,'pencil')]");
    //16
    private static final By USER_ROLE_HEADER = By.xpath("//div[@role='columnheader'][text() = 'User Role']");
    //17
    private static final By EMPLOYEE_NAME_HEADER = By.xpath("//div[@role='columnheader'][text() = 'Employee Name']");
    //18
    private static final By BREADCRUMB = By.xpath("//span[contains(@class, 'breadcrumb')]");
    //19
    private static final By MENU_BUTTON =  By.xpath("//button[contains(@class, 'main-menu-button')]");
    //20
    private static final By COLLAPSE_SEARCH_FILTER_BUTTON = By.xpath("//div[contains(@class,'filter-header-options')]");
    //21
    private static final By ADD_BUTTON = By.xpath("//button[text() = ' Add ']");

}
