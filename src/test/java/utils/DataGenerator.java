package utils;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@UtilityClass
public class DataGenerator {

    @UtilityClass
    public static class Registration {

        public static RegistrationInfo generateInfo(String locale) {
            Faker faker = new Faker(new Locale(locale));
            return new RegistrationInfo(
                    faker.name().firstName(),
                    faker.phoneNumber().phoneNumber(),
                    faker.address().cityName()
            );
        }

        public static DateInfo generateDate() {
            return new DateInfo(
                    LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    LocalDate.now().plusDays(4).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            );
        }
    }
}
