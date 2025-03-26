package tests;

import org.junit.jupiter.api.Test;
import pages.pages.RegistrationPage;

public class RegistrationPageTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();



    @Test
    void registrationPageFullTest(){
        registrationPage.openPage()
                .closeBanner()
                .setFirstName("Andrew")
                .setLastName("Tek")
                .setEmail("andrew@exp.com")
                .setGender("Male")
                .setUserNumber("1234567890")
                .setDateOfBirth("9","October","2024")
                .setSubjectInput("Computer Science")
                .setHobbies("Sports")
                .selectUploadPicture("img/File.jpg")
                .setAddres("st.Pushkin")
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmit()
                .checkResult("Andrew Tek")
                .checkResult("andrew@exp.com")
                .checkResult("Male")
                .checkResult("1234567890")
                .checkResult("09 October,2024")
                .checkResult("Computer Science")
                .checkResult("Sports")
                .checkResult("file.jpg")
                .checkResult("st.Pushkin")
                .checkResult("NCR Delhi");


    }
    @Test
    void registrationPageMinimalTest(){
        registrationPage.openPage()
                .setFirstName("Andrew")
                .setLastName("Tek")
                .setGender("Male")
                .setUserNumber("1234567890")
                .clickSubmit()
                .checkResult("Andrew Tek")
                .checkResult("Male")
                .checkResult("1234567890");


    }
    @Test
    void negativeTest(){
        registrationPage.openPage()
                .setFirstName("")
                .clickSubmit()
                .checkFirstNameColorInput();



    }


}
