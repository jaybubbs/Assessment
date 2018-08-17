import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class stepDefs {

    ChromeDriver driver;
    private ExtentReports extent;
    ExtentTest test;
    Actions action;

    @Before
    public void setup() {

        System.setProperty(Contstans.strWebdrivertype, Contstans.strWebdriverpath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        action = new Actions(driver);
        extent = new ExtentReports(Contstans.strReportLoc, true);
    }

    @After
    public void teardown() {
        extent.flush();
        driver.quit();
    }


    @Given("^the login page$")
    public void the_login_page() {
        driver.get(Contstans.strBaseURL);
    }

    @When("^I login$")
    public void i_login() {
        test = extent.startTest("Test Login");
        test.log(LogStatus.INFO, "Login");
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        login.populate("Admin", "AdminAdmin");
        _Basepage basepage = PageFactory.initElements(driver, _Basepage.class);
        basepage.login(driver);

        if (basepage.checksignin())
            test.log(LogStatus.PASS, "Login Successful");
        else
            test.log(LogStatus.FAIL, "Login failed");

        Assert.assertTrue(basepage.checksignin());

    }

    @When("^I click the PIM tab$")
    public void i_click_the_PIM_tab() throws InterruptedException {
        test = extent.startTest("Test PIM tab");
        test.log(LogStatus.INFO, "click PIM tab");
        _Basepage basepage = PageFactory.initElements(driver, _Basepage.class);
        basepage.PIM(driver);

    }

    @When("^then the Add Employee Tab$")
    public void then_the_Add_Employee_Tab() throws InterruptedException {
        _Basepage basepage = PageFactory.initElements(driver, _Basepage.class);
        basepage.addEmp(driver);
    }

    @When("^I fill out the Add Employee Details correctly$")
    public void i_fill_out_the_Add_Employee_Details_correctly() throws InterruptedException {
        _Basepage basepage = PageFactory.initElements(driver, _Basepage.class);
        AddEmployee addemp = basepage.fillEmpDetails(driver);
        addemp.populate("Jay", "Jay", "Jay", "123", "n");
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);
    }

    @When("^I choose to create Login Details by clicking the appropriate button$")
    public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I fill out the Login Details correctly$")
    public void i_fill_out_the_Login_Details_correctly() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click the Save button$")
    public void i_click_the_Save_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can search for the Employee I have just created$")
    public void i_can_search_for_the_Employee_I_have_just_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^select them for inspection$")
    public void select_them_for_inspection() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
