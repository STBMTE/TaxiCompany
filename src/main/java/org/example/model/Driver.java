package org.example.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.time.LocalDate;

@RedisHash("Driver")
public class Driver {
    @Id
    private String id;
    @Indexed
    private String firstName;
    @Indexed
    private String lastName;
    @Indexed
    private String surname;
    @Indexed
    private String licensNum;
    @Indexed
    private String expirationDate;
    @Indexed
    private String address;
    @Indexed
    private String age;
    @Indexed
    private String phoneNumber;

    public Driver(String firstName, String lastName, String surname, String licensNum, String experationDate, String address, String age, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.licensNum = licensNum;
        this.expirationDate = experationDate;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Driver() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLicensNum() {
        return licensNum;
    }

    public void setLicensNum(String licenseNum) {
        this.licensNum = licenseNum;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
