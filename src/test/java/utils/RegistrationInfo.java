package utils;

import lombok.Value;

@Value
public class RegistrationInfo {
    private final String name;
    private final String phoneNumber;
    private final String city;
}
