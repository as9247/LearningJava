package com.Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import com.mysql.jdbc.PreparedStatement;

public class MainProgram {

	public static void main(String[] args) throws Exception {

		getConnection();

		Scanner inputVariable = new Scanner(System.in);

		MethodsNotInSeca nIS = new MethodsNotInSeca();
		MethodsInSeca iS = new MethodsInSeca();
		MethodsForBothZones fBZ = new MethodsForBothZones();

		// System.out.println("Hello, please select an option which will connect
		// you to the correct Distance Calc.");

		// This section calculates the speed per day of your vessel:
		System.out.println("Enter the speed of your voyage: ");

		nIS.speed = inputVariable.nextDouble();

		System.out.println(nIS.speedCalculator());

		// Here we give the user a selection of three options which form the
		// basis of the final calculation
		System.out.println("Please enter one of the three options:" + " If voyage is inside a SECA zone, type 1."
				+ " If voyage is outside of a SECA zone, type 2." + " If your voyage is mixed, type 3.");
		int choice = inputVariable.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter the distance of your voyage: ");
			nIS.distance = inputVariable.nextDouble();
			System.out.println(nIS.notInSeca());
			break;
		case 2:
			System.out.println("Enter the distance of your voyage: ");
			iS.secaDistance = inputVariable.nextDouble();
			System.out.println(iS.distanceInSeca());
			break;
		case 3:
			System.out.println("Enter the distance outside of the SECA zone: ");
			fBZ.distance = inputVariable.nextDouble();
			System.out.println("Enter the distance travelled inside the SECA zone: ");
			fBZ.secaDistanceM = inputVariable.nextDouble();
			System.out.println(fBZ.bothZones());
			break;
		}

		// This section calculates the voyage duration with adverse weather:
		System.out.println("If there are adverse weather conditions, please enter a value for the delay: ");

		nIS.weatherDelay = inputVariable.nextDouble();

		System.out.println(nIS.InclementWeather());

		// And here, we add the last two sections together!
		System.out.printf("With the weather factor taken into consideration, this voyage will take: " + "%.2f" + "\n",
				+nIS.voyageDurationNoBunkers());

		// Now we include the costs of bunker fuels to this voyage

		get();
		ArrayList bunkerList = new ArrayList();
		System.out.println("Please select which port you would like bunkers from:"
				+ " Antwerp, Busan, Cape Town, Fujairah, Houston, Istanbul, Kaoshing, Las Palmas, Maracaibo, New Orleans, Piraeus, Rotterdam, Singapore."
				+ " Type your reponse below: ");
		bunkerList.
		inputVariable.nextDouble();
		
		// nIS.bunkerPrice = inputVariable.nextDouble();

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

	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/ships";
			String username = "root";
			String password = "version1998";
			Class.forName(driver);

			Connection myConn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return myConn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	
	public static ArrayList<String> get() throws Exception {
		try {
			Connection myConn = getConnection();
			PreparedStatement statement = (PreparedStatement) myConn.prepareStatement("SELECT Location FROM bunkerData");

			ResultSet result = statement.executeQuery();

			ArrayList<String> array = new ArrayList<String>();
			while (result.next()) {
				//System.out.println("Please enter the name of the port you wish to purchase bunkers from: ");
				System.out.println(result.getMetaData());
				//System.out.println(result.getString(" "));
				System.out.println(" ");

				array.add(result.getString(" "));
			}
			System.out.println("The port's bunker prices have been imported. Please select an appropriate fuel.");
			return array;
		} catch (Exception e) {
			System.out.println(e);
		}
		// You return null if there is no data in the record
		return null;
	}
	

}
