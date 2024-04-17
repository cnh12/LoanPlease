package com.d105.loanplease.domain.loan.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "loan_tb")
public class Loan {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long loanId;

    private String name;
    private String content;
    private Double interest;
    private Integer period;
    private Integer price;
    private Long limit;
}
