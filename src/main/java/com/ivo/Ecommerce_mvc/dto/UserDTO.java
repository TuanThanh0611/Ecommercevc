package com.ivo.Ecommerce_mvc.dto;

import com.ivo.Ecommerce_mvc.enums.UserRole;
import lombok.Data;

@Data
public class UserDTO {
    String id;
    String name;
    String email;
    String password;
    UserRole userRole;

}
