package com.xworkz.film.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.film.dao.AwardDAO;
import com.xworkz.film.dto.AwardDTO;
import com.xworkz.film.entity.AwardEntity;
@Service
public class AwardServiceImpl implements AwardService{
	
	@Autowired
	private AwardDAO awardDAO;

	public AwardServiceImpl() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public boolean validateAndSave(AwardDTO awardDTO) {
		boolean valid = false;
		try {
			System.out.println("validateAndSave invoked " + awardDTO);
			
			if(Objects.nonNull(awardDTO)) {
				System.out.println("starting validation for " + awardDTO);
				String AwardName = awardDTO.getAwardName();
				if (AwardName !=null && !AwardName.isEmpty() && AwardName.length() >=5) {
				System.out.println("AwardName is valid");
				valid = true;
				} else {
					System.out.println("AwardName is invalid");
					if(AwardName == null) {
						System.out.println("AwardName is null");
					}
					if(AwardName !=null && AwardName.length() <5) {
						System.out.println("name length is less than 5");
					}
					valid = false;
				}
				String spansor = awardDTO.getSpansor();
				if (spansor !=null && !spansor.isEmpty() && spansor.length() >=5) {
					System.out.println("spansor is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("spansor is invalid");
					valid = false;
					
				}
			}
				String gift = awardDTO.getGift();
				if (gift !=null && !gift.isEmpty() && gift.length() >=5) {
					System.out.println("gift is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("gift is invalid");
					valid = false;
				}		
		}
			}
			//return valid;
			
			if(valid) {
				System.out.println("Data is valid ,will convert  to entity");
				
				AwardEntity awardEntity = new AwardEntity();
				
				BeanUtils.copyProperties(awardDTO, awardEntity);
				
				System.out.println("entity is ready \t "+ awardEntity);
				awardDAO.save(awardEntity);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}



