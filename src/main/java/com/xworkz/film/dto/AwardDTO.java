package com.xworkz.film.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AwardDTO {
	private String AwardName;
	private String Spansor;
	private String Gift;
	
	public void AwardDTO() {
		System.out.println("Created \t"+this.getClass().getName());
	}

	@Override
	public String toString() {
		return "AwardDTO [AwardName=" + AwardName + ", Spansor=" + Spansor + ", Gift=" + Gift + "]";
	}

}

