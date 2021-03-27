package com.selfos.services.person;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.Serializable;

public class AddPersonRequest implements Serializable {

    private String firstName;
    private String lastName;
    private String imageUrl;
    private String phone;
    private String email;
    private String streetAddress;
    private String aptNumber;
    private String city;
    private String state;
    private String zipCode;

    public AddPersonRequest(String firstName, String lastName, String imageUrl, String phone, String email,
                            String streetAddress, String aptNumber, String city, String state, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageUrl = imageUrl;
        this.phone = phone;
        this.email = email;
        this.streetAddress = streetAddress;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "AddPersonRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", aptNumber='" + aptNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipCode + '\'' +
                '}';
    }


    public ObjectNode serialize(){
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode tempObj = objectMapper.createObjectNode();
        tempObj.put("firstName", this.firstName);
        tempObj.put("lastname", this.lastName);
        tempObj.put("imageUrl", this.imageUrl);
        tempObj.put("phone", this.phone);
        tempObj.put("email", this.email);
        tempObj.put("streetAddress", this.streetAddress);
        tempObj.put("aptNumber", this.aptNumber);
        tempObj.put("city", this.city);
        tempObj.put("state", this.state);
        tempObj.put("zipcode", this.zipCode);
        return tempObj;
    }
}
