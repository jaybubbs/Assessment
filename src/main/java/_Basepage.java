import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _Basepage {

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
    private WebElement PIMItem;

    @FindBy (xpath = "//*[@id=\"dashboard-navbar\"]/nav/div/ul[1]/li")
    private WebElement dashboard;

    @FindBy(xpath = "//*[@id=\"menu_pim_addEmployee\"]/span[2]")
    private WebElement addEmployee;

    @FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
    private WebElement createUsercheckbox;


    public Homepage login (WebDriver driver) {
        loginButton.click();
        return PageFactory.initElements(driver, Homepage.class);

    }

    public boolean checksignin() {

        return dashboard.getText().equals("Dashboard");
    }

    public LoginPage PIM (WebDriver driver) throws InterruptedException {
        PIMItem.click();
        Thread.sleep(3000);
        return PageFactory.initElements(driver, LoginPage.class);

    }

    public LoginPage addEmp (WebDriver driver) throws InterruptedException {
        addEmployee.click();
        Thread.sleep(20000);
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public AddEmployee fillEmpDetails (WebDriver driver) {
        //createUsercheckbox.click();
       return PageFactory.initElements(driver, AddEmployee.class);
    }


}
