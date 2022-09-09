package com.jay.sms_springboot.model;


import javax.persistence.*;

/**
 * Create By Jay On 09/07/2022
 */


@Entity
/**
 * @Entity is used to tell the JPA that this class is an entity class and it will be mapped to table in the database
 */

@Table(name = "student")
/**
 * @Table annotation is used to specify the details of the table that this entity will be mapped too
 */

public class Student {

    /**
     * @Id annotation is used to specify the primary key of an entyty
     * @generatedValue annotation is used to specify the primary key generation strategy
     * @GenerationType.IDENTITY is used for auto increment of id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    /**
     * unique = true is used to specify that the column should be unique
     * nullable = false means that the column cannot be null
     */
    @Column(unique = true, nullable = false)
    private Long id;

    /**
     * nullable = false means that the column cannot be null
     */
    @Column(nullable = false)
    private String name;
    private int grade;
    private int age;
    private String email;


    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.toUpperCase();
    }
}
