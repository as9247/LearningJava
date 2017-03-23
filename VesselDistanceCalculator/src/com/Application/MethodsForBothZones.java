package com.Application;

public class MethodsForBothZones extends MethodsNotInSeca {

	public double secaSpeed, secaDistanceM;

	// Subtracts non-SECA distance from SECA distance
	public double bothZones() {
		double aDT = (double) distance - (double) secaDistanceM;
		return aDT;
	}
}
