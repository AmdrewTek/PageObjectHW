package pages.FakeData;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakeData {
    Faker faker = new Faker(new Locale("en"));


    public String getRandomFirstName() {
        String fakeFirstName = faker.name().firstName();
        return fakeFirstName;
    }

    public String getRandomLastName() {
        String fakeLastName = faker.name().lastName();
        return fakeLastName;
    }

    public String getRandomEmail() {
        String fakeEmail = faker.internet().emailAddress();
        return fakeEmail;
    }

    public String getRandomGender() {
        String fakeGender = faker.options().option("Male", "Female", "Other");
        return fakeGender;
    }

    public String getRandomPhoneNumber() {
        String fakePhoneNumber = faker.numerify("##########");
        return fakePhoneNumber;
    }

    public String getRandomDayOfBirth() {
        String fakeDayOfBirth = String.format("%02d", faker.number().numberBetween(1, 28));
        return fakeDayOfBirth;
    }

    public String getRandomMonthOfBirth() {
        String fakeMonthOfBirth = faker.options().option("January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December");
        return fakeMonthOfBirth;
    }

    public String getRandomYearOfBirth() {
        String fakeYearOfBirth = String.format("%02d", faker.number().numberBetween(1970, 2024));
        return fakeYearOfBirth;
    }

    public String getRandomSubject() {
        String fakeSubject = faker.options().option("Physics", "Computer Science", "Chemistry", "Economics");
        return fakeSubject;
    }

    public String getRandomHobbies() {
        String fakeHobbies = faker.options().option("Sports", "Reading", "Music");
        return fakeHobbies;
    }

    public String getRandomPicture() {
        String randomPicture = faker.options().option("img/File.jpg", "img/File1.jpg");
        return randomPicture;
    }

    public String getRandomAddress() {
        String fakeAddress = faker.address().fullAddress();
        return fakeAddress;
    }

    public String getRandomState() {
        String randomState = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        return randomState;
    }

    public String getRandomCity() {
        //String randomCity = faker.options().option("Delhi", "Gurgaon", "Noida", "Rajasthan");
        if (getRandomState() == "NCR") {
            String randomCity = faker.options().option("Delhi", "Gurgaon", "Noida");
            return randomCity;
        } else if (getRandomState() == "Uttar Pradesh") {
            String randomCity = faker.options().option("Agra", "Lucknow", "Lucknow");
            return randomCity;
        } else if (getRandomState() == "Haryana") {
            String randomCity = faker.options().option("Karnal", "Panipat");
            return randomCity;
        } else {
            String randomCity = faker.options().option("Jaipur", "Jaiselmer");
            return randomCity;
        }

    }
}




