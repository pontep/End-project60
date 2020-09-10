package com.example.voting.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Getter
@Setter
@Table(name = "Party")
public class Party {

    @Id
	@SequenceGenerator(name = "party_seq", sequenceName = "party_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "party_seq")
    @Column(name = "PARTY_ID", unique = true, nullable = true)
    private Long party_id;
    
    @NotNull
    private String p_name;
   // private int member;
    @NotNull
    private String policy;
    @NotNull
    private String p_number;

    private int point;


    @OneToOne(fetch = FetchType.EAGER,targetEntity = Admins.class)
    @JoinColumn(name = "ADMIN_ID", insertable = true)
    @JsonManagedReference
    private @NotNull Admins admins;

    public Party(){}

    public Party(String p_name, String policy, String p_number, int point, Admins admins) {
        this.p_name = p_name;
        this.policy = policy;
        this.p_number = p_number;
        this.point = point;
        this.admins = admins;
    
	}

}