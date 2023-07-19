package com.patipan.testproject.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import lombok.Data;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity(name = "users")
public class userModel {
    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
    @Column (unique = true, nullable = false, updatable = false)
    public String Id;

    @Column (length = 250, nullable = false)
    private String name;

    @Column (nullable = true)
    private Integer age;

    @Column (nullable = true)
    private String email;

}
