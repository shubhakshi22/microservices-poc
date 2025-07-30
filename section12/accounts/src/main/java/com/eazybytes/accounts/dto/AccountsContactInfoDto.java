package com.eazybytes.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts") // to map application.yml fields to java properties of this class
// replacing record class with nomral class since we need to learn how to refresh the changed configuration at run time, as record doesn't support refresh due to not providing setters
@Getter
@Setter
public class AccountsContactInfoDto {
    String message;
    Map<String, String> contactDetails;
    List<String> onCallSupport;
}
