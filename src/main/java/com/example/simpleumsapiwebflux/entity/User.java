package com.example.simpleumsapiwebflux.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Table("tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = -2079884000812529703L;

    @Id
    private Long id;

    private String name;

    private Integer age;

    private Character gender;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();
}
