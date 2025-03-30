package tests;

import org.junit.jupiter.api.Test;
import pages.FakeData.FakeData;
import pages.RegistrationPage.RegistrationPage;

public class RegistrationPageTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    FakeData fakeData = new FakeData();



    @Test
    void registrationPageFullTest(){
        registrationPage.openPage()
                .closeBanner()
                .setFirstName(fakeData.getRandomFirstName())
                .setLastName(fakeData.getRandomLastName())
                .setEmail(fakeData.getRandomEmail())
                .setGender(fakeData.getRandomGender())
                .setUserNumber(fakeData.getRandomPhoneNumber())
                .setDateOfBirth(fakeData.getRandomDayOfBirth(),
                        fakeData.getRandomMonthOfBirth(), fakeData.getRandomYearOfBirth())
                .setSubjectInput(fakeData.getRandomSubject())
                .setHobbies(fakeData.getRandomHobbies())
                .selectUploadPicture(fakeData.getRandomPicture())
                .setAddress(fakeData.getRandomAddress())
                .setState(fakeData.getRandomState())
                .setCity(fakeData.getRandomCity())
                .clickSubmit()
                .checkResult(fakeData.getRandomFirstName() + " " + fakeData.getRandomLastName())
                .checkResult(fakeData.getRandomEmail())
                .checkResult(fakeData.getRandomGender())
                .checkResult(fakeData.getRandomPhoneNumber())
                .checkResult(fakeData.getRandomDayOfBirth() + " " + fakeData.getRandomMonthOfBirth()
                    + " " + fakeData.getRandomYearOfBirth())
                .checkResult(fakeData.getRandomSubject())
                .checkResult(fakeData.getRandomHobbies())
                .checkResult(fakeData.getRandomPicture())
                .checkResult(fakeData.getRandomAddress())
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
