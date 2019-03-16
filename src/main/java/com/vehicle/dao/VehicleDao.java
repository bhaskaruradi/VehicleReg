package com.vehicle.dao;

import com.vehicle.beans.Vehicle;

public interface VehicleDao {
       public int insuranceReg(Vehicle v);
       Vehicle validityCheck(String veh);
}
