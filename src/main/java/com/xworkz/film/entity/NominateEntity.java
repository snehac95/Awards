package com.xworkz.film.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "nominate_detailss")
@Data
public class NominateEntity implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "FilmName")
	private String FilmName;
	@Column(name = "Language")
	private String Language;
	@Column(name = "LeadActor")
	private String LeadActor;
	@Column(name = "Year")
	private Date Year;
	@Column(name = "SupportingLead")
	private String SupportingLead;

	public NominateEntity() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
}

	public NominateEntity(String filmName, String language, String leadActor, Date year, String supportingLead) {
		super();
		FilmName = filmName;
		Language = language;
		LeadActor = leadActor;
		Year = year;
		SupportingLead = supportingLead;
	}
	
}


