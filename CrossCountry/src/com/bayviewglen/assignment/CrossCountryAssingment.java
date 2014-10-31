package com.bayviewglen.assignment;
import java.text.DecimalFormat;

import java.util.Scanner;
public class CrossCountryAssingment {
public static final int SECONDS_PER_MINIUTE = 60;
public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner usrInput = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000");

		String nameOne;
		String nameTwo;
		String nameThree;
		String nameFour;
		String nameFive;
		
		System.out.println("Please enter the names of the contestants: ");
		
		nameOne = usrInput.nextLine();
		nameTwo = usrInput.nextLine();
		nameThree = usrInput.nextLine();
		nameFour = usrInput.nextLine();
		nameFive = usrInput.nextLine();

		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Please enter " + nameOne + "'s" + " time for the first mile <mm:ss.sss>: ");
		String mileOneFIRST = usrInput.nextLine();	//The FIRST value at the end of the variables signify that this section is for runner One.

		System.out.println("Please enter " + nameOne + "'s" + " time for the second mile <mm:ss.sss>: ");
		String mileTwoFIRST = usrInput.nextLine();

		System.out.println("Please enter " + nameOne + "'s" + " time to complete the 5k race <mm:ss.sss>: ");
		String fnlFIRST = usrInput.nextLine(); // fnl is the time it took for the user to run the 5k.

		String mileOneMinStringFIRST = mileOneFIRST.split(":")[0];	//First mile in minutes
		int mileOneMinIntFIRST = Integer.parseInt(mileOneMinStringFIRST);
		double mileOneMinSecFIRST = (mileOneMinIntFIRST * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String mileOneSecStringFIRST = mileOneFIRST.split(":")[1];
		double mileOneSecDubFIRST = Double.parseDouble(mileOneSecStringFIRST);	// First mile in seconds

		String mileTwoMinStringFIRST = mileTwoFIRST.split(":")[0];	//Second mile in minutes							
		int mileTwoMinIntFIRST = Integer.parseInt(mileTwoMinStringFIRST);
		double mileTwoMinSecFIRST = (mileTwoMinIntFIRST * SECONDS_PER_MINIUTE);		//Converting into seconds
		
		String mileTwoSecStringFIRST = mileTwoFIRST.split(":")[1];	//Second mile in seconds
		double mileTwoSecDubFIRST = Double.parseDouble(mileTwoSecStringFIRST);
		
		String fnlMinStringFIRST = fnlFIRST.split(":")[0];	//5km in minutes
		int fnlMinIntFIRST = Integer.parseInt(fnlMinStringFIRST);
		double fnlMinSecFIRST = (fnlMinIntFIRST * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String fnlSecStringFIRST = fnlFIRST.split(":")[1];	//5km in seconds
		double fnlSecDubFIRST = Double.parseDouble(fnlSecStringFIRST);
		
		double mileOneMathFIRST = (mileOneMinSecFIRST + mileOneSecDubFIRST);	//Creating one value for the miles in seconds
		double mileTwoMathFIRST = (mileTwoMinSecFIRST + mileTwoSecDubFIRST);
		double fnlMathFIRST = (fnlMinSecFIRST + fnlSecDubFIRST);
		
		String splitOneFIRST = mileOneFIRST;
		
		int splitTwoMinFIRST = (int)((mileTwoMathFIRST-mileOneMathFIRST) / SECONDS_PER_MINIUTE);	//Finding the values for both seconds and minutes separately
		double splitTwoSecFIRST = (double)(mileTwoMathFIRST-mileOneMathFIRST) % SECONDS_PER_MINIUTE;
		
		String fSplitTwoSecFIRST = formatter.format(splitTwoSecFIRST);		//This formats the seconds so that it restricts the number of decimal places.
		String splitTwoFIRST = (splitTwoMinFIRST + ":" + fSplitTwoSecFIRST); //Combining the two values into a string, our split time.	 	
		
		int splitThreeMinFIRST = (int)((fnlMathFIRST-mileTwoMathFIRST) / SECONDS_PER_MINIUTE);
		double splitThreeSecFIRST = (double)(fnlMathFIRST-mileTwoMathFIRST) % SECONDS_PER_MINIUTE;
		
		String fSplitThreeSecFIRST = formatter.format(splitThreeSecFIRST);
		String splitThreeFIRST = (splitThreeMinFIRST + ":" + fSplitThreeSecFIRST);
		
		System.out.println ("");	//This block arranges the information, and displays the table for ONE runner
		System.out.println (nameOne + "'s " + "Race Summary");
		System.out.println ("------------------------------");
		System.out.println ("Split One Time: " + splitOneFIRST);
		System.out.println ("Split Two Time: " + splitTwoFIRST);	
		System.out.println ("Split Three Time: " + splitThreeFIRST);
		System.out.println ("------------------------------");
		System.out.println ("Total Race Time: " + fnlFIRST);
		
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
		
		System.out.println("Please enter " + nameTwo + "'s" + " time for the first mile <mm:ss.sss>: ");
		String mileOneSECOND = usrInput.nextLine();	//The SECOND value at the end of the variables signify that this section is for runner Two.

		System.out.println("Please enter " + nameTwo + "'s" + " time for the second mile <mm:ss.sss>: ");
		String mileTwoSECOND = usrInput.nextLine();

		System.out.println("Please enter " + nameTwo + "'s" + " time to complete the 5k race <mm:ss.sss>: ");
		String fnlSECOND = usrInput.nextLine(); // fnl is the time it took for the user to run the 5k.

		String mileOneMinStringSECOND = mileOneSECOND.split(":")[0];	//First mile in minutes
		int mileOneMinIntSECOND = Integer.parseInt(mileOneMinStringSECOND);
		double mileOneMinSecSECOND = (mileOneMinIntSECOND * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String mileOneSecStringSECOND = mileOneSECOND.split(":")[1];
		double mileOneSecDubSECOND = Double.parseDouble(mileOneSecStringSECOND);	// First mile in seconds

		String mileTwoMinStringSECOND = mileTwoSECOND.split(":")[0];	//Second mile in minutes							
		int mileTwoMinIntSECOND = Integer.parseInt(mileTwoMinStringSECOND);
		double mileTwoMinSecSECOND = (mileTwoMinIntSECOND * SECONDS_PER_MINIUTE);		//Converting into seconds
		
		String mileTwoSecStringSECOND = mileTwoSECOND.split(":")[1];	//Second mile in seconds
		double mileTwoSecDubSECOND = Double.parseDouble(mileTwoSecStringSECOND);
		
		String fnlMinStringSECOND = fnlSECOND.split(":")[0];	//5km in minutes
		int fnlMinIntSECOND = Integer.parseInt(fnlMinStringSECOND);
		double fnlMinSecSECOND = (fnlMinIntSECOND * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String fnlSecStringSECOND = fnlSECOND.split(":")[1];	//5km in seconds
		double fnlSecDubSECOND = Double.parseDouble(fnlSecStringSECOND);
		
		double mileOneMathSECOND = (mileOneMinSecSECOND + mileOneSecDubSECOND);	//Creating one value for the miles in seconds
		double mileTwoMathSECOND = (mileTwoMinSecSECOND + mileTwoSecDubSECOND);
		double fnlMathSECOND = (fnlMinSecSECOND + fnlSecDubSECOND);
		
		String splitOneSECOND = mileOneSECOND;
		
		int splitTwoMinSECOND = (int)((mileTwoMathSECOND-mileOneMathSECOND) / SECONDS_PER_MINIUTE);	//Finding the values for both seconds and minutes separately
		double splitTwoSecSECOND = (double)(mileTwoMathSECOND-mileOneMathSECOND) % SECONDS_PER_MINIUTE;
		
		String fSplitTwoSecSECOND = formatter.format(splitTwoSecSECOND);		//This formats the seconds so that it restricts the number of decimal places.
		String splitTwoSECOND = (splitTwoMinSECOND + ":" + fSplitTwoSecSECOND); //Combining the two values into a string, our split time.	 	
		
		int splitThreeMinSECOND = (int)((fnlMathSECOND-mileTwoMathSECOND) / SECONDS_PER_MINIUTE);
		double splitThreeSecSECOND = (double)(fnlMathSECOND-mileTwoMathSECOND) % SECONDS_PER_MINIUTE;
		
		String fSplitThreeSecSECOND = formatter.format(splitThreeSecSECOND);
		String splitThreeSECOND = (splitThreeMinSECOND + ":" + fSplitThreeSecSECOND);
		
		System.out.println ("");	//This block arranges the information, and displays the table for ONE runner
		System.out.println (nameTwo + "'s " + "Race Summary");
		System.out.println ("------------------------------");
		System.out.println ("Split One Time: " + splitOneSECOND);
		System.out.println ("Split Two Time: " + splitTwoSECOND);	
		System.out.println ("Split Three Time: " + splitThreeSECOND);
		System.out.println ("------------------------------");
		System.out.println ("Total Race Time: " + fnlSECOND);
		
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
		
		System.out.println("Please enter " + nameThree + "'s" + " time for the first mile <mm:ss.sss>: ");
		String mileOneTHIRD = usrInput.nextLine();	//The THIRD value at the end of the variables signify that this section is for runner Three.

		System.out.println("Please enter " + nameThree + "'s" + " time for the second mile <mm:ss.sss>: ");
		String mileTwoTHIRD = usrInput.nextLine();

		System.out.println("Please enter " + nameThree + "'s" + " time to complete the 5k race <mm:ss.sss>: ");
		String fnlTHIRD = usrInput.nextLine(); // fnl is the time it took for the user to run the 5k.

		String mileOneMinStringTHIRD = mileOneTHIRD.split(":")[0];	//First mile in minutes
		int mileOneMinIntTHIRD = Integer.parseInt(mileOneMinStringTHIRD);
		double mileOneMinSecTHIRD = (mileOneMinIntTHIRD * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String mileOneSecStringTHIRD = mileOneTHIRD.split(":")[1];
		double mileOneSecDubTHIRD = Double.parseDouble(mileOneSecStringTHIRD);	// First mile in seconds

		String mileTwoMinStringTHIRD = mileTwoTHIRD.split(":")[0];	//Second mile in minutes							
		int mileTwoMinIntTHIRD = Integer.parseInt(mileTwoMinStringTHIRD);
		double mileTwoMinSecTHIRD = (mileTwoMinIntTHIRD * SECONDS_PER_MINIUTE);		//Converting into seconds
		
		String mileTwoSecStringTHIRD = mileTwoTHIRD.split(":")[1];	//Second mile in seconds
		double mileTwoSecDubTHIRD = Double.parseDouble(mileTwoSecStringTHIRD);
		
		String fnlMinStringTHIRD = fnlTHIRD.split(":")[0];	//5km in minutes
		int fnlMinIntTHIRD = Integer.parseInt(fnlMinStringTHIRD);
		double fnlMinSecTHIRD = (fnlMinIntTHIRD * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String fnlSecStringTHIRD = fnlTHIRD.split(":")[1];	//5km in seconds
		double fnlSecDubTHIRD = Double.parseDouble(fnlSecStringTHIRD);
		
		double mileOneMathTHIRD = (mileOneMinSecTHIRD + mileOneSecDubTHIRD);	//Creating one value for the miles in seconds
		double mileTwoMathTHIRD = (mileTwoMinSecTHIRD + mileTwoSecDubTHIRD);
		double fnlMathTHIRD = (fnlMinSecTHIRD + fnlSecDubTHIRD);
		
		String splitOneTHIRD= mileOneTHIRD;
		
		int splitTwoMinTHIRD = (int)((mileTwoMathTHIRD-mileOneMathTHIRD) / SECONDS_PER_MINIUTE);	//Finding the values for both seconds and minutes separately
		double splitTwoSecTHIRD = (double)(mileTwoMathTHIRD-mileOneMathTHIRD) % SECONDS_PER_MINIUTE;
		
		String fSplitTwoSecTHIRD = formatter.format(splitTwoSecTHIRD);		//This formats the seconds so that it restricts the number of decimal places.
		String splitTwoTHIRD = (splitTwoMinTHIRD + ":" + fSplitTwoSecTHIRD); //Combining the two values into a string, our split time.	 	
		
		int splitThreeMinTHIRD = (int)((fnlMathTHIRD-mileTwoMathTHIRD) / SECONDS_PER_MINIUTE);
		double splitThreeSecTHIRD = (double)(fnlMathTHIRD-mileTwoMathTHIRD) % SECONDS_PER_MINIUTE;
		
		String fSplitThreeSecTHIRD = formatter.format(splitThreeSecTHIRD);
		String splitThreeTHIRD = (splitThreeMinTHIRD + ":" + fSplitThreeSecTHIRD);
		
		System.out.println ("");	//This block arranges the information, and displays the table for ONE runner
		System.out.println (nameThree + "'s " + "Race Summary");
		System.out.println ("------------------------------");
		System.out.println ("Split One Time: " + splitOneTHIRD);
		System.out.println ("Split Two Time: " + splitTwoTHIRD);	
		System.out.println ("Split Three Time: " + splitThreeTHIRD);
		System.out.println ("------------------------------");
		System.out.println ("Total Race Time: " + fnlTHIRD);
		System.out.println ("");
		
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
		
		System.out.println("Please enter " + nameFour + "'s" + " time for the first mile <mm:ss.sss>: ");
		String mileOneFOURTH = usrInput.nextLine();		//The FOURTH value at the end of the variables signify that this section is for runner Four.

		System.out.println("Please enter " + nameFour + "'s" + " time for the second mile <mm:ss.sss>: ");
		String mileTwoFOURTH = usrInput.nextLine();

		System.out.println("Please enter " + nameFour + "'s" + " time to complete the 5k race <mm:ss.sss>: ");
		String fnlFOURTH = usrInput.nextLine(); // fnl is the time it took for the user to run the 5k.

		String mileOneMinStringFOURTH = mileOneFOURTH.split(":")[0];	//First mile in minutes
		int mileOneMinIntFOURTH = Integer.parseInt(mileOneMinStringFOURTH);
		double mileOneMinSecFOURTH = (mileOneMinIntFOURTH * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String mileOneSecStringFOURTH = mileOneFOURTH.split(":")[1];
		double mileOneSecDubFOURTH = Double.parseDouble(mileOneSecStringFOURTH);	// First mile in seconds

		String mileTwoMinStringFOURTH = mileTwoFOURTH.split(":")[0];	//Second mile in minutes							
		int mileTwoMinIntFOURTH = Integer.parseInt(mileTwoMinStringFOURTH);
		double mileTwoMinSecFOURTH = (mileTwoMinIntFOURTH * SECONDS_PER_MINIUTE);		//Converting into seconds
		
		String mileTwoSecStringFOURTH = mileTwoFOURTH.split(":")[1];	//Second mile in seconds
		double mileTwoSecDubFOURTH = Double.parseDouble(mileTwoSecStringFOURTH);
		
		String fnlMinStringFOURTH = fnlFOURTH.split(":")[0];	//5km in minutes
		int fnlMinIntFOURTH = Integer.parseInt(fnlMinStringFOURTH);
		double fnlMinSecFOURTH = (fnlMinIntFOURTH * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String fnlSecStringFOURTH = fnlFOURTH.split(":")[1];	//5km in seconds
		double fnlSecDubFOURTH = Double.parseDouble(fnlSecStringFOURTH);
		
		double mileOneMathFOURTH = (mileOneMinSecFOURTH + mileOneSecDubFOURTH);	//Creating one value for the miles in seconds
		double mileTwoMathFOURTH = (mileTwoMinSecFOURTH + mileTwoSecDubFOURTH);
		double fnlMathFOURTH = (fnlMinSecFOURTH + fnlSecDubFOURTH);
		
		String splitOneFOURTH= mileOneFOURTH;
		
		int splitTwoMinFOURTH = (int)((mileTwoMathFOURTH-mileOneMathFOURTH) / SECONDS_PER_MINIUTE);	//Finding the values for both seconds and minutes separately
		double splitTwoSecFOURTH = (double)(mileTwoMathFOURTH-mileOneMathFOURTH) % SECONDS_PER_MINIUTE;
		
		String fSplitTwoSecFOURTH = formatter.format(splitTwoSecFOURTH);		//This formats the seconds so that it restricts the number of decimal places.
		String splitTwoFOURTH = (splitTwoMinFOURTH + ":" + fSplitTwoSecFOURTH); //Combining the two values into a string, our split time.	 	
		
		int splitThreeMinFOURTH = (int)((fnlMathFOURTH-mileTwoMathFOURTH) / SECONDS_PER_MINIUTE);
		double splitThreeSecFOURTH = (double)(fnlMathFOURTH-mileTwoMathFOURTH) % SECONDS_PER_MINIUTE;
		
		String fSplitThreeSecFOURTH = formatter.format(splitThreeSecFOURTH);
		String splitThreeFOURTH = (splitThreeMinFOURTH + ":" + fSplitThreeSecFOURTH);
		
		System.out.println ("");	//This block arranges the information, and displays the table for ONE runner
		System.out.println (nameFour + "'s " + "Race Summary");
		System.out.println ("------------------------------");
		System.out.println ("Split One Time: " + splitOneFOURTH);
		System.out.println ("Split Two Time: " + splitTwoFOURTH);	
		System.out.println ("Split Three Time: " + splitThreeFOURTH);
		System.out.println ("------------------------------");
		System.out.println ("Total Race Time: " + fnlFOURTH);
		System.out.println ("");
		
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
		
		System.out.println("Please enter " + nameFive + "'s" + " time for the first mile <mm:ss.sss>: ");
		String mileOneFIFTH = usrInput.nextLine();	//The FIFTH value at the end of the variables signify that this section is for runner Five.

		System.out.println("Please enter " + nameFive + "'s" + " time for the second mile <mm:ss.sss>: ");
		String mileTwoFIFTH = usrInput.nextLine();

		System.out.println("Please enter " + nameFive + "'s" + " time to complete the 5k race <mm:ss.sss>: ");
		String fnlFIFTH = usrInput.nextLine(); // fnl is the time it took for the user to run the 5k.

		String mileOneMinStringFIFTH = mileOneFIFTH.split(":")[0];	//First mile in minutes
		int mileOneMinIntFIFTH = Integer.parseInt(mileOneMinStringFIFTH);
		double mileOneMinSecFIFTH = (mileOneMinIntFIFTH * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String mileOneSecStringFIFTH = mileOneFIFTH.split(":")[1];
		double mileOneSecDubFIFTH = Double.parseDouble(mileOneSecStringFIFTH);	// First mile in seconds

		String mileTwoMinStringFIFTH = mileTwoFIFTH.split(":")[0];	//Second mile in minutes							
		int mileTwoMinIntFIFTH = Integer.parseInt(mileTwoMinStringFIFTH);
		double mileTwoMinSecFIFTH = (mileTwoMinIntFIFTH * SECONDS_PER_MINIUTE);		//Converting into seconds
		
		String mileTwoSecStringFIFTH = mileTwoFIFTH.split(":")[1];	//Second mile in seconds
		double mileTwoSecDubFIFTH = Double.parseDouble(mileTwoSecStringFIFTH);
		
		String fnlMinStringFIFTH = fnlFIFTH.split(":")[0];	//5km in minutes
		int fnlMinIntFIFTH = Integer.parseInt(fnlMinStringFIFTH);
		double fnlMinSecFIFTH = (fnlMinIntFIFTH * SECONDS_PER_MINIUTE);	//Converting into seconds
		
		String fnlSecStringFIFTH = fnlFIFTH.split(":")[1];	//5km in seconds
		double fnlSecDubFIFTH = Double.parseDouble(fnlSecStringFIFTH);
		
		double mileOneMathFIFTH = (mileOneMinSecFIFTH + mileOneSecDubFIFTH);	//Creating one value for the miles in seconds
		double mileTwoMathFIFTH = (mileTwoMinSecFIFTH + mileTwoSecDubFIFTH);
		double fnlMathFIFTH = (fnlMinSecFIFTH + fnlSecDubFIFTH);
		
		String splitOneFIFTH= mileOneFIFTH;
		
		int splitTwoMinFIFTH = (int)((mileTwoMathFIFTH-mileOneMathFIFTH) / SECONDS_PER_MINIUTE);	//Finding the values for both seconds and minutes separately
		double splitTwoSecFIFTH = (double)(mileTwoMathFIFTH-mileOneMathFIFTH) % SECONDS_PER_MINIUTE;
		
		String fSplitTwoSecFIFTH = formatter.format(splitTwoSecFIFTH);		//This formats the seconds so that it restricts the number of decimal places.
		String splitTwoFIFTH = (splitTwoMinFIFTH + ":" + fSplitTwoSecFIFTH); //Combining the two values into a string, our split time.	 	
		
		int splitThreeMinFIFTH = (int)((fnlMathFIFTH-mileTwoMathFIFTH) / SECONDS_PER_MINIUTE);
		double splitThreeSecFIFTH = (double)(fnlMathFIFTH-mileTwoMathFIFTH) % SECONDS_PER_MINIUTE;
		
		String fSplitThreeSecFIFTH = formatter.format(splitThreeSecFIFTH);
		String splitThreeFIFTH = (splitThreeMinFIFTH + ":" + fSplitThreeSecFIFTH);
		
		System.out.println ("");	//This block arranges the information, and displays the table for ONE runner
		System.out.println (nameFive + "'s " + "Race Summary");
		System.out.println ("------------------------------");
		System.out.println ("Split One Time: " + splitOneFIFTH);
		System.out.println ("Split Two Time: " + splitTwoFIFTH);	
		System.out.println ("Split Three Time: " + splitThreeFIFTH);
		System.out.println ("------------------------------");
		System.out.println ("Total Race Time: " + fnlFIFTH);
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
		System.out.println ("");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                                    FINAL SUMMARY TABLE");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\n%20s%20s%20s%20s%20s", "Runner", "Split One","Split Two", "Split Three", "Final Time");
        System.out.println ("");
        System.out.printf("\n%20s%20s%20s%20s%20s", nameOne, splitOneFIRST, splitTwoFIRST, splitThreeFIRST, fnlFIRST);
        System.out.printf("\n%20s%20s%20s%20s%20s", nameTwo, splitOneSECOND, splitTwoSECOND, splitTwoSECOND, fnlSECOND); 
        System.out.printf("\n%20s%20s%20s%20s%20s", nameThree, splitOneTHIRD, splitTwoTHIRD, splitTwoTHIRD, fnlTHIRD);
        System.out.printf("\n%20s%20s%20s%20s%20s", nameFour, splitOneFOURTH, splitTwoFOURTH, splitTwoFOURTH, fnlFOURTH);
     	System.out.printf("\n%20s%20s%20s%20s%20s", nameFive, splitOneFIFTH, splitTwoFIFTH, splitTwoFIFTH, fnlFIFTH);
		
     	usrInput.close();

	}

}
