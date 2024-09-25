package com.cbfacademy.restapiexercise.ious;

import jakarta.persistence.*;

import java.math.BigDecimal;

import java.time.Instant;

import java.util.UUID;

@Entity

@Table(name = "ious")

public class IOU {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    @Column(nullable = false)

    private String borrower;

    private String lender;

    private BigDecimal amount;

    private Instant dateTime;

    // Getter for id

    public UUID getId() {

       return id;

    }

    // Getter and Setter for borrower

    public String getBorrower() {

       return borrower;

    }

    public void setBorrower(String borrower) {

       this.borrower = borrower;

    }
    public String getLender() {

       return lender;

    }

    public void setLender(String lender) {

       this.lender = lender;

    }
    public BigDecimal getAmount() {

       return amount;

    }

    public void setAmount(BigDecimal amount) {

       this.amount = amount;

    }
    public Instant getDateTime() {

        return dateTime;
 
    }
    public void setDateTime(Instant dateTime) {

       this.dateTime = dateTime;

    }

}

