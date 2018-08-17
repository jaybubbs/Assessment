import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddEmployee extends _Basepage{

    @FindBy(id = "firstName")
    private WebElement firstNametextbox;

    @FindBy(id = "middleName")
    private WebElement middleNametextbox;

    @FindBy(id = "lastName")
    private WebElement lastNametextbox;

    @FindBy(id = "employeeId")
    private WebElement idtextbox;

    @FindBy(xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
    private WebElement locationtextbox;



    public void populate(String Firstname, String Lastname, String Middlename, String EmployeeId, String Location) {

        firstNametextbox.click();
        firstNametextbox.clear();
        firstNametextbox.sendKeys(Firstname);

        lastNametextbox.click();
        lastNametextbox.clear();
        lastNametextbox.sendKeys(Lastname);

        middleNametextbox.click();
        middleNametextbox.clear();
        middleNametextbox.sendKeys(Middlename);

        idtextbox.click();
        idtextbox.clear();
        idtextbox.sendKeys(EmployeeId);

        locationtextbox.click();
        locationtextbox.sendKeys(Location);


    }

}