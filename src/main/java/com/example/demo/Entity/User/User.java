package com.example.demo.Entity.User;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "ContactNumber",
    "Address",
    "City",
    "Country"
})
public class User {

    /**
     * User Name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("User Name")
    private String name;
    /**
     * The type of this instruction.
     * 
     */
    @JsonProperty("ContactNumber")
    @JsonPropertyDescription("The type of this instruction.")
    private String contactNumber;
    /**
     * Any URL associated with this instruction.
     * 
     */
    @JsonProperty("Address")
    @JsonPropertyDescription("Any URL associated with this instruction.")
    private String address;
    /**
     * Name of the instruction.
     * 
     */
    @JsonProperty("City")
    @JsonPropertyDescription("Name of the instruction.")
    private String city;
    /**
     * Code that describes the instruction.
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("Code that describes the instruction.")
    private String country;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param country
     * @param address
     * @param city
     * @param name
     * @param contactNumber
     */
    public User(String name, String contactNumber, String address, String city, String country) {
        super();
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    /**
     * User Name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * User Name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The type of this instruction.
     * 
     */
    @JsonProperty("ContactNumber")
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * The type of this instruction.
     * 
     */
    @JsonProperty("ContactNumber")
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * Any URL associated with this instruction.
     * 
     */
    @JsonProperty("Address")
    public String getAddress() {
        return address;
    }

    /**
     * Any URL associated with this instruction.
     * 
     */
    @JsonProperty("Address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Name of the instruction.
     * 
     */
    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    /**
     * Name of the instruction.
     * 
     */
    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Code that describes the instruction.
     * 
     */
    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    /**
     * Code that describes the instruction.
     * 
     */
    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

}
