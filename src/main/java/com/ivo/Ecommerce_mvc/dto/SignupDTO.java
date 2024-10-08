package com.ivo.Ecommerce_mvc.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignupDTO {
    String name;
    String email;
    String password;
}
