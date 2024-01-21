package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    WebDriver driver;
    public FormPage(WebDriver driver) {
        this.driver = driver;
    }
    // шапка формы
    private final By formTitle = By.id("example-modal-sizes-title-lg");
    // имя студента
    private final By studentName = By.xpath(".//div[@class='modal-body']//tbody/tr[1]/td[2]");
    // email студента
    private final By studentEmail = By.xpath(".//div[@class='modal-body']//tbody/tr[2]/td[2]");
    // пол студента
    private final By studentGender = By.xpath(".//div[@class='modal-body']//tbody/tr[3]/td[2]");
    // телефон студента
    private final By studentPhoneNumber = By.xpath(".//div[@class='modal-body']//tbody/tr[4]/td[2]");
    // дата рождения студента
    private final By studentDateOfBirth = By.xpath(".//div[@class='modal-body']//tbody/tr[5]/td[2]");
    // тема
    private final By subjectText = By.xpath(".//div[@class='modal-body']//tbody/tr[6]/td[2]");
    // адрес
    private final By studentAddress = By.xpath(".//div[@class='modal-body']//tbody/tr[9]/td[2]");
    // штат и город
    private final By stateAndCity = By.xpath(".//div[@class='modal-body']//tbody/tr[10]/td[2]");

    @Step("Check form title is visible")
    public boolean isFormTitleVisible() {
        return driver.findElement(formTitle).isDisplayed();
    }
    @Step("Get student name")
    public String getStudentName() {
        return driver.findElement(studentName).getText();
    }
    @Step("Get student email")
    public String getStudentEmail() {
        return driver.findElement(studentEmail).getText();
    }
    @Step("Get student gender")
    public String getStudentGender() {
        return driver.findElement(studentGender).getText();
    }
    @Step("Get student number")
    public String getStudentPhoneNumber() {
        return driver.findElement(studentPhoneNumber).getText();
            }
    @Step("Get student date of birth")
    public String getStudentDateOfBirth() {
        return driver.findElement(studentDateOfBirth).getText();
    }
    @Step("Get subject")
    public String getSubjectText() {
        return driver.findElement(subjectText).getText();
    }
    @Step("Get student address")
    public String getStudentAddress() {
        return driver.findElement(studentAddress).getText();
            }
    @Step("Get state and city")
    public String getStateAndCity() {
        return driver.findElement(stateAndCity).getText();
    }
}
