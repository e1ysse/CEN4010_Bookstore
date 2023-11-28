package com.jetbrains.geektext.GeekText.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "User_CreditCard_Data_Base")
public class CreditCardEntity {

    @Id
    @Column(name = "credit_card_number")
    private Long creditCardNum;

    @Column(name = "expiration_date")
    private int expirationDate;

    @Column(name = "cvv")
    private int cvv;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_ID", referencedColumnName = "user_ID")
    private UserEntity user;

    public CreditCardEntity() {
        // Default constructor
    }

    public CreditCardEntity(Long creditCardNum, int expirationDate, int cvv, String name, UserEntity user) {
        this.creditCardNum = creditCardNum;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.name = name;
        this.user = user;
    }

    // Getters and Setters
    public Long getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(Long creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
