package com.vehicle.ui;

import java.util.Scanner;

import com.vehicle.beans.Vehicle;
import com.vehicle.service.VehicleService;
import com.vehicle.service.VehicleServiceImpl;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    Vehicle v = new Vehicle();
    VehicleService vs = new VehicleServiceImpl(); 
		
		System.out.println("eneter the choice");
		System.out.println("1.Vehicle Insurance Reg\n 2.Insurance Validity Check");
    int ch = sc.nextInt();
    switch(ch) {
    case 1 :
    	System.out.println("enter the vehicle no");
    	v.setVehicleNo(sc.next());
    	System.out.println("enter the vehicle type");
    	v.setVehicleType(sc.next());
    	System.out.println("enter the insurance period");
    	v.setPeriod(sc.nextInt());
        System.out.println("enter aadhar no");
        v.setAdharNo(sc.next());
        System.out.println("enter mobile");
        v.setMobile(sc.nextInt());
        int vehicle = vs.insuranceReg(v);
        if(vehicle !=0)
        System.out.println("vehicle Insurance details are "+vehicle);
        
        
    case 2:
    	    System.out.println(" enter vehicle no");
    	    String veh = (sc.next());
    	    
    	    	
    	    
    	    Vehicle vc =vs.validityCheck(veh);
    	    System.out.println("period is "+vc.getPeriod());
    	    System.out.println(vc);
    	    
    }
		
	}

}
