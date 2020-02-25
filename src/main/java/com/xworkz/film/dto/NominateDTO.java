package com.xworkz.film.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class NominateDTO {
	private String FilmName;
	private String Language;
	private String LeadActor;
	private Date Year;
	private String SupportingLead;

	public NominateDTO() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "NominateDTO [FilmName=" + FilmName + ", Language=" + Language + ", LeadActor=" + LeadActor + ", Year="
				+ Year + ", SupportingLead=" + SupportingLead + "]";
	}
	


}
