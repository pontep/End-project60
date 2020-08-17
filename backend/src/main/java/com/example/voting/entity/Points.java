package com.example.voting.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Score")
public class Points {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Score_ID",insertable = true)
    private long vote_id;

    private long student_id;
    private long party_id;
    private long point;
    
    public Points() {
	}

	public Points(Long student_id, Long party_id, Long point) {
		this.student_id = student_id;
		this.party_id = party_id;
		this.point = point;
	}

}