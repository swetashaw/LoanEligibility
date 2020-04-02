package com.example.loaneligibility.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.loaneligibility.dao.CityStatusDoa;
import com.example.loaneligibility.repository.CityStatusRepo;
import com.example.loaneligibility.repository.NativeSqlRepo;
import com.example.loaneligibility.repository.StatusRepo;

public class CityStatusDaoImpl implements CityStatusDoa {
	
	@Autowired
	NativeSqlRepo nativeSqlRepo;
	@Autowired
	CityStatusRepo cityStatusRepo;
	
	@Autowired 
	StatusRepo statusRepo;

	@Override
	public String getCityState(int statusId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStatusid(int pinCodode) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * @Override public int getCityState(int pincode) { List<CityStatus>
	 * cityStatus=nativeSqlRepo.getCityStaus(pincode); return cityStatus.get(2); }
	 * 
	 * @Override public int getStatusid(int pinCode) { // TODO Auto-generated method
	 * stub nativeSqlRepo.getStaus(pinCode); return
	 * cityStatus.getStatus().getStatus_id(); }
	 */

}
