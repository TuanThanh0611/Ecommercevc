package com.ivo.Ecommerce_mvc.entities;

import com.ivo.Ecommerce_mvc.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Entity
@Data
@Setter
@Getter
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String name;
    String email;
    String password;
    UserRole userRole;
    byte[] img;

}
