package com.vehicle.service;

import com.vehicle.beans.Vehicle;

public interface VehicleService {
	 public int insuranceReg(Vehicle v);
     Vehicle validityCheck(String veh);
}
