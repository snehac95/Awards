package com.xworkz.film.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.film.dao.NominateDAO;
import com.xworkz.film.dto.NominateDTO;
import com.xworkz.film.entity.NominateEntity;


@Service

public class NominateServiceImpl implements NaminateService{
	
	@Autowired
	private NominateDAO nominateDAO;
	
	public NominateServiceImpl() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public boolean validateAndSave(NominateDTO nominateDTO) {
		boolean valid = false;
		try {
			System.out.println("validateAndSave invoked " + nominateDTO);

			if(Objects.nonNull(nominateDTO)) {
				System.out.println("starting validation for " + nominateDTO);
				String FilmName = nominateDTO.getFilmName();
				if (FilmName !=null && !FilmName.isEmpty() && FilmName.length() >=5) {
				System.out.println("FilmName is valid");
				valid = true;
				} else {
					System.out.println("FilmName is invalid");
					if(FilmName == null) {
						System.out.println("FilmName is null");
					}
					if(FilmName !=null && FilmName.length() <5) {
						System.out.println("name length is less than 5");
					}
					valid = false;
				}
		
				String SupportingLead = nominateDTO.getSupportingLead();
				if (SupportingLead !=null && !SupportingLead.isEmpty() && SupportingLead.length() >=5) {
					System.out.println("SupportingLead is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("SupportingLead is invalid");
					valid = false;
					
				}
			}
			
				//String Year = nominateDTO.getYear();
				//if (Year !=null && !Year.isEmpty() && Year.length() >=5) {
					//System.out.println("Year is valid");
					//valid = true;	
			//} else {
				//if(valid) {
					//System.out.println("Year is invalid");
					//valid = false;
					
				//}
			//}
			
				String leadActor = nominateDTO.getLeadActor();
				if (leadActor !=null && !leadActor.isEmpty() && leadActor.length() >=5) {
					System.out.println("leadActor is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("leadActor is invalid");
					valid = false;
				}		
		}
			}
			//return valid;
			
			if(valid) {
				System.out.println("Data is valid ,will convert  to entity");
				
				NominateEntity nominateEntity = new NominateEntity();
				
				BeanUtils.copyProperties(nominateDTO, nominateEntity);
				
				System.out.println("entity is ready \t "+ nominateEntity);
				nominateDAO.save(nominateEntity);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}


