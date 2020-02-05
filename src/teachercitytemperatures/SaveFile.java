/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachercitytemperatures;

/**
 *
 * @author johnstringer
 */
import java.io.*;
public class SaveFile {
	
	public static void SaveFile() {
		
		//Declare an output stream for outputting data.
		
		PrintWriter dataOut;
		
		try {
			dataOut = new PrintWriter (new FileWriter("datafile.txt"));
		}
		
		catch (IOException e) {
			System.out.println("Error, can't save the data file");
			return; //end the method after error
		}
		
		try
		{
			for (int i = 0; i < CityTempGUI.cityDatabase.length; i++) {
				dataOut.println(CityTempGUI.cityDatabase[i].getCityName());
				dataOut.println(CityTempGUI.cityDatabase[i].getWindSpeed());
				int temperatures[] = CityTempGUI.cityDatabase[i].getTemp();
				
				String tempString = ""; 
				
				for (int j = 0; j < temperatures.length; j++) {
					if (j < temperatures.length - 1) {
						tempString += temperatures[j] + ",";
					}
					else {
						tempString += temperatures[j];
					}
				}
				dataOut.println(tempString);
				
			}
		}
		
		catch (IndexOutOfBoundsException e) {
			System.out.println("Too much information in the data file");
			System.out.println("Processing has been aborted");
		}
		
		finally {
			dataOut.close();
		}
		
		
	}

}
