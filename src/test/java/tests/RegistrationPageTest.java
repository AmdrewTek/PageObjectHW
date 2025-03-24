package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationPageTest extends TestPreset {
    RegistrationPage registrationPage = new RegistrationPage();



    @Test
    void registrationPageFullTest(){
        registrationPage.openPage()
                .setFirstName("Andrew")
                .setLastName("Tek")
                .setEmail("andrew@exp.com")
                .setGender("Male")
                .setUserNumber("1234567890")
                .setDateOfBirth("9","October","2024")
                .setSubjectInput("Computer Science")
                .setHobbises("Sports")
                .selectUploadPicture("img/File.jpg")
                .setAdres("st.Pushkin")
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmit()
                .checkResalt("Andrew Tek")
                .checkResalt("andrew@exp.com")
                .checkResalt("Male")
                .checkResalt("1234567890")
                .checkResalt("09 October,2024")
                .checkResalt("Computer Science")
                .checkResalt("Sports")
                .checkResalt("file.jpg")
                .checkResalt("st.Pushkin")
                .checkResalt("NCR Delhi");


    }
    @Test
    void registrationPageMinimalTest(){
        registrationPage.openPage()
                .setFirstName("Andrew")
                .setLastName("Tek")
                .setGender("Male")
                .setUserNumber("1234567890")
                .clickSubmit()
                .checkResalt("Andrew Tek")
                .checkResalt("Male")
                .checkResalt("1234567890");


    }
    @Test
    void negativeTest(){
        registrationPage.openPage()
                .setFirstName("")
                .clickSubmit()
                .checkFirstNameColorInput();



    }


}
