package pages;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.util.Locale;


public class HomePage {
    WebDriver driver;
    // поле ввода First Name
    private final By firstNameField = By.id("firstName");
    // поле ввода Last Name
    private final By lastNameField = By.id("lastName");
    // поле ввода email
    private final By emailField = By.id("userEmail");
    // кнопка переключения Female
    private final By FemaleGender = By.xpath(".//label[@for='gender-radio-2']");
    // поле ввода телефона
    private final By mobileField = By.cssSelector("#userNumber");
    // поле ввода даты рождения
    private final By dateOfBirthField = By.id("dateOfBirthInput");
    // год рождения
    private final By yearOfBirth = By.xpath(".//select[@class='react-datepicker__year-select']/option[@value='1985']");
    // месяц рождения
    private final By monthOfBirth = By.xpath(".//select[@class='react-datepicker__month-select']/option[@value='8']");
    // дата рождения
    private final By dayOfBirth = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--023']");
    // поле ввода предмета
    private final By subjectsField = By.id("subjectsInput");
    // выбрать предмет
    private final By chooseSubject = By.xpath(".//div[text()='Accounting']");
    // кнопка загрузки файлов
    private final By fileButton = By.id("uploadPicture");
    // поле ввода адреса
    private final By addressField = By.cssSelector("#currentAddress");
    // список штатов
    private final By selectStateList = By.id("state");
    // выбор штата
    private final By chooseState = By.xpath(".//div[text()='Haryana']");
    // список городов
    private final By selectCityList = By.cssSelector("#city");
    // выбор города
    private final By chooseCity = By.xpath(".//div[text()='Karnal']");
    // кнопка Submit
    private final By submitButton = By.xpath(".//button[@id='submit']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Scroll down home page")
    public void scrollSelectStateList() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(selectStateList));
    }
    @Step("Set first name")
    public void setFirstName(String firstName) {
        driver.findElement (firstNameField).sendKeys(firstName);
    }
    @Step("Set last name")
    public void setLastName(String lastName) {
        driver.findElement (lastNameField).sendKeys(lastName);}
    @Step("Set email")
    public void setEmail(String email) {driver.findElement (emailField).sendKeys(email);}
    @Step("Choose female gender")
    public void chooseFemaleGender() {driver.findElement (FemaleGender).click();}
    @Step("Set mobile number")
    public void setMobileNumber(String mobileNumber) {driver.findElement(mobileField).sendKeys(mobileNumber);}
    @Step("Click date of birth field")
    public void clickDateOfBirthField() {
        driver.findElement(dateOfBirthField).click();
    }
    @Step("Choose year of birth")
    public void chooseYearOfBirth() {driver.findElement(yearOfBirth).click();
    }
    @Step("Choose month of birth")
    public void chooseMonthOfBirth() {driver.findElement(monthOfBirth).click();
    }
    @Step("Choose day of birth")
    public void chooseDayOfBirth() {driver.findElement(dayOfBirth).click();
    }
    @Step("Click subject field")
    public void clickSubjectsField() {driver.findElement (subjectsField).sendKeys("a");}
    @Step("Choose subject")
    public void chooseSubject() {driver.findElement(chooseSubject).click();}
    @Step("Upload file")
    public void uploadFile() {driver.findElement(fileButton).sendKeys(new File("C:/Users/Julia/Desktop/1.jpg").getAbsolutePath());}
    @Step("Set current address")
    public void setCurrentAddress(String currentAddress) {driver.findElement(addressField).sendKeys(currentAddress);}
    @Step("Click state list")
    public void clickStateList() {driver.findElement (selectStateList).click();}
    @Step("Click city list")
    public void clickCityList() {driver.findElement (selectCityList).click();}
    @Step("Choose state")
    public void chooseState() {driver.findElement (chooseState).click();}
    @Step("Choose city")
    public void chooseCity() {driver.findElement (chooseCity).click();}
    @Step("Click submit button")
    public void clickSubmitButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                driver.findElement(submitButton));;}

    Faker faker = new Faker(new Locale("en-RU"));
    public String fakeEmail=faker.letterify("??????@gmail.com");
    public String fakeFirstName=faker.name().firstName();
    public String fakeLastName= faker.name().lastName();
    public String fakePhoneNumber=faker.numerify("9#########");
    public String fakeCurrentAddress = faker.address().streetAddress();

    public void setUserData() {
        scrollSelectStateList();
        setFirstName(fakeFirstName);
        setLastName(fakeLastName);
        setEmail(fakeEmail);
        chooseFemaleGender();
        setMobileNumber(fakePhoneNumber);
        clickDateOfBirthField();
        chooseMonthOfBirth();
        chooseYearOfBirth();
        chooseDayOfBirth();
        clickSubjectsField();
        chooseSubject();
        uploadFile();
        setCurrentAddress(fakeCurrentAddress);
        clickStateList();
        chooseState();
        clickCityList();
        chooseCity();
        System.out.printf("%s\n%s\n%s\n%s\n%s%n",fakeFirstName,fakeLastName,fakeEmail,fakePhoneNumber,fakeCurrentAddress);
        clickSubmitButton();
    }
}


