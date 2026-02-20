package com.abhijeet.eventseat.model;

import com.abhijeet.eventseat.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private String mobile;

    @Enumerated(EnumType.STRING)
    private Role role;

}
