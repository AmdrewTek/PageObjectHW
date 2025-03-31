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
                .checkResult(fakeData.name + " " + fakeData.lastName)
                .checkResult(fakeData.email)
                .checkResult(fakeData.gender)
                .checkResult(fakeData.phoneNumber)
                .checkResult(fakeData.dayOfBirth + " " + fakeData.monthOfBirth
                        + "," + fakeData.yearOfBirth)
                .checkResult(fakeData.subject)
                .checkResult(fakeData.hobbies)
                .checkResult(fakeData.picture)
                .checkResult(fakeData.address)
                .checkResult(fakeData.state + " " + fakeData.city);


    }
    @Test
    void registrationPageMinimalTest(){
        registrationPage.openPage()
                .setFirstName(fakeData.getRandomFirstName())
                .setLastName(fakeData.getRandomLastName())
                .setGender(fakeData.getRandomGender())
                .setUserNumber(fakeData.getRandomPhoneNumber())
                .clickSubmit()
                .checkResult(fakeData.name + " " + fakeData.lastName)
                .checkResult(fakeData.gender)
                .checkResult(fakeData.phoneNumber);


    }
    @Test
    void negativeTest(){
        registrationPage.openPage()
                .setFirstName("")
                .clickSubmit()
                .checkFirstNameColorInput();



    }


}
