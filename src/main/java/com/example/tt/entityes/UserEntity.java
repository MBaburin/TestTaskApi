package com.example.tt.entityes;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
}
