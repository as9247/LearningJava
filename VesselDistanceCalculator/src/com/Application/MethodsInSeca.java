package com.Application;

public class MethodsInSeca {

	public double secaSpeed, secaDistance, secaPrice, secaWF, secaConsumption;

	public double secaZoneSpeed() {
		double sZS = (double) secaSpeed * 24;
		return sZS;
	}

	public double distanceInSeca() {
		double dTS = (double) secaDistance / (double) secaZoneSpeed();
		return dTS;
	}

	public double InclementWeatherSeca() {
		double IW = ((double) secaWF / 100) * (double) distanceInSeca();
		return IW;
	}

	public double overallVoyageInSeca() {
		double oVIS = (double) distanceInSeca() + (double) InclementWeatherSeca();
		return oVIS;
	}

	public double totalSecaCosts() {
		double tSC = (double) secaConsumption * (double) overallVoyageInSeca() * secaPrice;
		return tSC;
	}
}
