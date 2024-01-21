import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import pages.FormPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class FormTests extends BaseTest {
    HomePage objHomePage;
    FormPage objFormPage;

    @Before
    public void setUp() {
        objHomePage = new HomePage(driver);
        objFormPage = new FormPage(driver);
    }

    @Test
    @DisplayName("Check submitting the form")
    public void checkSubmittingForm() {
        objHomePage.setUserData();
        boolean result = objFormPage.isFormTitleVisible();
        assertTrue(result);
    }
    @Test
    @DisplayName("Check form's fields")
    public void checkFormsFields() {
        objHomePage.setUserData();
        String actualName = objFormPage.getStudentName();
        assertEquals((objHomePage.fakeFirstName+" "+objHomePage.fakeLastName),actualName);
        String actualEmail = objFormPage.getStudentEmail();
        assertEquals(objHomePage.fakeEmail,actualEmail);
        String actualGender = objFormPage.getStudentGender();
        assertEquals("Female",actualGender);
        String actualPhoneNumber = objFormPage.getStudentPhoneNumber();
        assertEquals(objHomePage.fakePhoneNumber,actualPhoneNumber);
        String actualDateOfBirth = objFormPage.getStudentDateOfBirth();
        assertEquals("23 September,1985",actualDateOfBirth);
        String actualSubject = objFormPage.getSubjectText();
        assertEquals("Accounting",actualSubject);
        String actualAddress = objFormPage.getStudentAddress();
        assertEquals(objHomePage.fakeCurrentAddress,actualAddress);
        String actualStateAndCity = objFormPage.getStateAndCity();
        assertEquals("Haryana Karnal",actualStateAndCity);
    }
}
