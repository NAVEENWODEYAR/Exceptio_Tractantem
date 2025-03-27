package com.gowri.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Objects;

/**
 * @author NaveenWodeyar
 * @date 27-Mar-2025 10:55:31 pm
 */

@Entity
@Table(name = "STUDENT_TABLE")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private Long id;

    @Column(name = "STUDENT_NAME", nullable = false)
    private String name;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @Column(name = "COURSE")
    private String course;

    // Default Constructor
    public Student() {}

    // Parameterized Constructor
    public Student(Long id, String name, Integer age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Getters and Setters
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
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString Method
    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", email='" + email + '\'' +
               ", course='" + course + '\'' +
               '}';
    }

    // hashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    // equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
               Objects.equals(name, student.name) &&
               Objects.equals(email, student.email);
    }
}
