package com.vehicle.dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.vehicle.beans.Vehicle;

public class VehicleDaoImpl implements VehicleDao{
	Vehicle  v = new Vehicle();
	Date date = new Date(0);  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate= formatter.format(date);
	Map<String,Vehicle> InsuranceEntry = new HashMap<String, Vehicle>();
	
	
	public int insuranceReg(Vehicle v) {
		if(InsuranceEntry.containsKey(v.getVehicleNo()))
			return -1;
		else 
		
	InsuranceEntry.put(v.getVehicleNo(),new Vehicle(v.getVehicleNo(),v.getVehicleType(),v.getPeriod(),v.getAdharNo(),v.getMobile()));
		
		
		
		return 1;
		
	}

	public Vehicle validityCheck(String veh) {
	 if(InsuranceEntry.containsKey(veh)) {
        
           v =InsuranceEntry.get(veh);
	        formatter.applyLocalizedPattern(strDate);
	       
	      
	   
	       
	 }
		return v;
	}

}
