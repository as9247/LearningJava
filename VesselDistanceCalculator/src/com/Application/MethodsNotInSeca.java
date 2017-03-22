package com.Application;

class MethodsNotInSeca {

	public double speed, distance, weatherDelay, bunkerPrice, consumption, portDays, tcRate;

	// need to consider in unit testing what happens when 0 is passed!
	public double speedCalculator() {
		double s = (double) speed * 24;
		return s;
	}

	// need to consider in unit testing what happens when 0 is passed!
	public double noInclementWeather() {
		double nIW = (double) distance / (double) speedCalculator();
		return nIW;
	}

	public double InclementWeather() {
		double IW = ((double) weatherDelay / 100) * (double) noInclementWeather();
		return IW;
	}

	public double voyageDurationNoBunkers() {
		double vDNB = (double) noInclementWeather() + (double) InclementWeather();
		return vDNB;
	}

	public double voyageDurationWithBunkers() {
		double withBunkers = (double) voyageDurationNoBunkers() * (double) consumption * (double) bunkerPrice;
		return withBunkers;
	}

	public double totalDays() {
		double tD = (double) portDays + (double) noInclementWeather();
		return tD;
	}

	public double totalCost() {
		double tC = (double) voyageDurationWithBunkers() / (double) noInclementWeather();
		return tC;
	}

	public double timeCharterRate() {
		double tCR = (double) totalDays() * (double) tcRate;
		return tCR;
	}

	public double calculatedTC() {
		double actualTC = (double) voyageDurationWithBunkers() + (double) timeCharterRate();
		return actualTC;
	}

	public double totalPerDay() {
		double tPD = (double) calculatedTC() / (double) noInclementWeather();
		return tPD;
	}
}
