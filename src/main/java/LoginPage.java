import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends _Basepage {

    @FindBy(id = "txtUsername")
    private WebElement usernametextbox;

    @FindBy (id = "txtPassword")
    private WebElement passwordtextbox;


    public void populate(String username, String password) {

        usernametextbox.click();
        usernametextbox.clear();
        usernametextbox.sendKeys(username);

        passwordtextbox.click();
        passwordtextbox.clear();
        passwordtextbox.sendKeys(password);

    }
}
