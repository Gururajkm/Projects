package com.Qac.Fruits.BusinessLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Qac.Fruits.Entity.Fruits_Details;
import com.Qac.Fruits.dao.DataAccess;
import com.Qac.Fruits.dto.Details;

@Service
public class ServiceLayer implements BusinessLogic{
    @Autowired
	private DataAccess dao;
	
	public String validateandSave(Details details) {
		if(details.getCustomername()!=null && !details.getCustomername().isEmpty()) {
			if(details.getMobileno()!=null &&  !details.getMobileno().isEmpty()) {
				if(details.getFruitsQuantity()!=null && !details.getFruitsQuantity().isEmpty()) {
					
					Fruits_Details fruits =new Fruits_Details();
					 fruits.setCustomerName(details.getCustomername());
					 fruits.setMobileNo(details.getMobileno());
					 fruits.setFruitsQuantity(details.getFruitsQuantity());
					 
					 dao.save(fruits);
					}else {
					return"Invalid FruitsQuantity";
				}
				
			}else {
				return "Invalid Mobile No";
			}
			
		}else {
			return "InvalidCustomerName";
		}
		return "data saved";
	}
	

}
