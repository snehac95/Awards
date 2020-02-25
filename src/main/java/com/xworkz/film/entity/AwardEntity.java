package com.xworkz.film.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Entity
@Table(name="award_details")
@Data
public class AwardEntity implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name ="id")
	private int id;
	@Column(name = "AwardName")
	private String AwardName;
	@Column(name = "Spansor")
	private String Spansor;
	@Column(name = "Gift")
	private String Gift;

	public AwardEntity() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public AwardEntity(String awardName, String spansor, String gift) {
		//super();
		AwardName = awardName;
		Spansor = spansor;
		Gift = gift;
	}
	

}


