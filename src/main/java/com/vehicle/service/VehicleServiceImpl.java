package com.vehicle.service;

import com.vehicle.beans.Vehicle;
import com.vehicle.dao.VehicleDao;
import com.vehicle.dao.VehicleDaoImpl;

public class VehicleServiceImpl implements VehicleService{
VehicleDao vd = new VehicleDaoImpl();
	public int insuranceReg(Vehicle v) {
		// TODO Auto-generated method stub
		return vd.insuranceReg(v);
	}

	public Vehicle validityCheck(String veh) {
		// TODO Auto-generated method stub
		return vd.validityCheck(veh);
	}

}
