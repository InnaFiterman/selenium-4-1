package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    HomePage homePage;
    WebDriver driver;

    @Before
    public void init(){
        System.setProperty ("webdriver.chrome.driver",
                "C:\\Users\\Igor\\Desktop\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void close(){
        driver.close();
        driver.quit();
    }

    @Given("^user navigates to the app url$")
    public void someTestInfo() {
        driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }


    @Then("^user  fills first name with value \"([^\"]*)\"$")
    public void userFillsFirstNameWithValue(String arg0)  {
        homePage.setFirstName(arg0);

    }

    @Then("^user fills last name with value \"([^\"]*)\"$")
    public void userFillsLastNameWithValue(String lastName)  {
        homePage.setLastName(lastName);
    }


    @Then("^user fills gender this$")
    public void userFillsGenderThis()  {
        homePage.typeGender();

    }

    @Then("^user fills date of birth with value \"([^\"]*)\"$")
    public void userFillsDateOfBirthWithValue(String dob) {
        homePage.typeDOB(dob);
    }

    @Then("^user fills address$")
    public void userFillsAddress()  {
        homePage.typeAddress("1250 N Lasalle. IL 60610");
    }


    @Then("^user fills email with value \"([^\"]*)\"$")
    public void userFillsEmailWithValue(String email)  {
        homePage.typeEmail(email);
    }

    @Then("^user fills password with value \"([^\"]*)\"$")
    public void userFillsPasswordWithValue(String password)  {
        homePage.typePassword(password);
    }

    @Then("^user fills company$")
    public void userFillsCompany()  {
        homePage.typeCompany("Roga i kopita");
    }

    @Then("^user fills Role$")
    public void userFillsRole()  {
        homePage.typeRole();
    }


    @When("^user fills Job$")
    public void userFillsJob() {
        homePage.typeJob();
    }

    @When("^user fills CheckboxOne$")
    public void userFillsCheckboxOne() {
        homePage.typeCheckbox1();
    }

    @When("^user fills CheckboxTwo$")
    public void userFillsCheckboxTwo() {
        homePage.typeCheckbox2();
    }

    @When("^user fills Comments$")
    public void userFillsComments() {
        homePage.typeComments("thank you");
    }

    @When("^user submit form$")
    public void userSubmitForm()  {
        homePage.typeSubmit();
    }

    @When("^user check form is submitted$")
    public void userCheckFormIsSubmitted(){
        Assert.assertEquals(homePage.typeConfirmSubmitted(), "Successfully submitted!");
    }


    @When("^user reload page$")
    public void userReloadPage() {
        driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }



}

