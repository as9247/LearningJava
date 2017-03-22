package com.Application;

import java.util.Scanner;

public class UserOptionSelections {

	
	
	// this method calculates the price not inside a SECA zone
	public void option1() {

		Scanner inputVariable = new Scanner(System.in);

		MethodsNotInSeca nIS = new MethodsNotInSeca();

		System.out.println("Hello, please select an option which will connect you to the correct Distance Calc.");

		// This section calculates the speed per day of your vessel:
		System.out.println("Enter the speed of your voyage: ");

		nIS.speed = inputVariable.nextDouble();

		System.out.println(nIS.speedCalculator());

		// This section calculates the voyage duration with no adverse weather:
		System.out.println("Enter the distance between your port of origination and destination port: ");

		nIS.distance = inputVariable.nextDouble();

		System.out.println(nIS.noInclementWeather());

		// This section calculates the voyage duration with adverse weather:
		System.out.println("If there are adverse weather conditions, please enter a value for the delay: ");

		nIS.weatherDelay = inputVariable.nextDouble();

		System.out.println(nIS.InclementWeather());

		// And here, we add the last two sections together!
		System.out.printf("With the weather factor taken into consideration, this voyage will take: " + "%.2f" + "\n",
				+nIS.voyageDurationNoBunkers());

		// Now we include the costs of bunker fuels to this voyage
		System.out.println("Please enter your expected bunker costs: $");

		nIS.bunkerPrice = inputVariable.nextDouble();

		System.out.println("And enter your estimated fuel consumption: ");

		nIS.consumption = inputVariable.nextDouble();

		System.out.printf("The cumulative costs for this leg of your voyage are: " + "%.2f" + "\n",
				+nIS.voyageDurationWithBunkers());

		// Calculating the cost of staying in port on top of our
		// voyageDurationWithBunkers
		System.out.println("Please enter the number of days you'll be in port for: ");
		nIS.portDays = inputVariable.nextDouble();

		System.out.printf("Based on the number of port days " + nIS.portDays + ". The total duration of this voyage is "
				+ "%.2f" + "\n", +nIS.totalDays());

		// Therefore, the total cost per day in USD$ is found bY:
		System.out.printf("This voyage will cost $" + "%.2f" + "\n", +nIS.totalCost());

		// And finally, the time charter rate:
		System.out.println("Enter a rate for the TC: ");
		nIS.tcRate = inputVariable.nextDouble();

		System.out.println("Based on the TC rate of " + nIS.tcRate + ".");

		System.out.printf("The total cost per day is: $" + "%.2f" + "\n", +nIS.totalPerDay());

		inputVariable.close();
	}

	// this method calculates the price inside a SECA zone
	public void option2(){
		Scanner inputVariable = new Scanner(System.in);

		MethodsNotInSeca nIS = new MethodsNotInSeca();

		System.out.println("Hello, please select an option which will connect you to the correct Distance Calc.");

		// This section calculates the speed per day of your vessel:
		System.out.println("Enter the speed of your voyage: ");

		nIS.speed = inputVariable.nextDouble();

		System.out.println(nIS.speedCalculator());

		// This section calculates the voyage duration with no adverse weather:
		System.out.println("Enter the distance between your port of origination and destination port: ");

		nIS.distance = inputVariable.nextDouble();

		System.out.println(nIS.noInclementWeather());

		// This section calculates the voyage duration with adverse weather:
		System.out.println("If there are adverse weather conditions, please enter a value for the delay: ");

		nIS.weatherDelay = inputVariable.nextDouble();

		System.out.println(nIS.InclementWeather());

		// And here, we add the last two sections together!
		System.out.printf("With the weather factor taken into consideration, this voyage will take: " + "%.2f" + "\n",
				+nIS.voyageDurationNoBunkers());

		// Now we include the costs of bunker fuels to this voyage
		System.out.println("Please enter your expected bunker costs: $");

		nIS.bunkerPrice = inputVariable.nextDouble();

		System.out.println("And enter your estimated fuel consumption: ");

		nIS.consumption = inputVariable.nextDouble();

		System.out.printf("The cumulative costs for this leg of your voyage are: " + "%.2f" + "\n",
				+nIS.voyageDurationWithBunkers());

		// Calculating the cost of staying in port on top of our
		// voyageDurationWithBunkers
		System.out.println("Please enter the number of days you'll be in port for: ");
		nIS.portDays = inputVariable.nextDouble();

		System.out.printf("Based on the number of port days " + nIS.portDays + ". The total duration of this voyage is "
				+ "%.2f" + "\n", +nIS.totalDays());

		// Therefore, the total cost per day in USD$ is found bY:
		System.out.printf("This voyage will cost $" + "%.2f" + "\n", +nIS.totalCost());

		// And finally, the time charter rate:
		System.out.println("Enter a rate for the TC: ");
		nIS.tcRate = inputVariable.nextDouble();

		System.out.println("Based on the TC rate of " + nIS.tcRate + ".");

		System.out.printf("The total cost per day is: $" + "%.2f" + "\n", +nIS.totalPerDay());

		inputVariable.close();
	}

	// this method calculates the price travelling inside and outside a SECA zone
	public void option3(){
		Scanner inputVariable = new Scanner(System.in);

		MethodsNotInSeca nIS = new MethodsNotInSeca();

		System.out.println("Hello, please select an option which will connect you to the correct Distance Calc.");

		// This section calculates the speed per day of your vessel:
		System.out.println("Enter the speed of your voyage: ");

		nIS.speed = inputVariable.nextDouble();

		System.out.println(nIS.speedCalculator());

		// This section calculates the voyage duration with no adverse weather:
		System.out.println("Enter the distance between your port of origination and destination port: ");

		nIS.distance = inputVariable.nextDouble();

		System.out.println(nIS.noInclementWeather());

		// This section calculates the voyage duration with adverse weather:
		System.out.println("If there are adverse weather conditions, please enter a value for the delay: ");

		nIS.weatherDelay = inputVariable.nextDouble();

		System.out.println(nIS.InclementWeather());

		// And here, we add the last two sections together!
		System.out.printf("With the weather factor taken into consideration, this voyage will take: " + "%.2f" + "\n",
				+nIS.voyageDurationNoBunkers());

		// Now we include the costs of bunker fuels to this voyage
		System.out.println("Please enter your expected bunker costs: $");

		nIS.bunkerPrice = inputVariable.nextDouble();

		System.out.println("And enter your estimated fuel consumption: ");

		nIS.consumption = inputVariable.nextDouble();

		System.out.printf("The cumulative costs for this leg of your voyage are: " + "%.2f" + "\n",
				+nIS.voyageDurationWithBunkers());

		// Calculating the cost of staying in port on top of our
		// voyageDurationWithBunkers
		System.out.println("Please enter the number of days you'll be in port for: ");
		nIS.portDays = inputVariable.nextDouble();

		System.out.printf("Based on the number of port days " + nIS.portDays + ". The total duration of this voyage is "
				+ "%.2f" + "\n", +nIS.totalDays());

		// Therefore, the total cost per day in USD$ is found bY:
		System.out.printf("This voyage will cost $" + "%.2f" + "\n", +nIS.totalCost());

		// And finally, the time charter rate:
		System.out.println("Enter a rate for the TC: ");
		nIS.tcRate = inputVariable.nextDouble();

		System.out.println("Based on the TC rate of " + nIS.tcRate + ".");

		System.out.printf("The total cost per day is: $" + "%.2f" + "\n", +nIS.totalPerDay());

		inputVariable.close();
	}
}

/*double option1, option2, option3;

Scanner userSelection = new Scanner(System.in);

System.out.println("Hello, please select an option which will connect you to the correct Distance Calc."
		+ " Select 1 if your voyage doesn't go through a SECA zone." 
		+ " Select 2 if your voyage is entirely in a SECA zone." 
		+ " And select 3 if you will travel through both SECA and Non-SECA zones.");

MainProgram select = new MainProgram();

option1 = userSelection.nextDouble();



System.out.println("Please follow the guidelines to calculate the cost.");

select.option2 = userSelection.nextDouble();

System.out.println("Please follow the guidelines to calculate the cost.");

select.option3 = userSelection.nextDouble();

System.out.println("Please follow the guidelines to calculate the cost.");

userSelection.close();

// this method calculates the price not inside a SECA zone
public void option1() {*/