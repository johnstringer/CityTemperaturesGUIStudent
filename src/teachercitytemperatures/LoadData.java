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

public class LoadData {
	//Declar an input stream for reading data
        
	public static void loadFile() {
		BufferedReader dataIn;

		try {
			//dataIn will read the contents of datafile.txt and store them for later use
			dataIn = new BufferedReader(new FileReader("datafile.txt"));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		
		try {
			
			for (int i = 0; i < CityTempGUI.cityDatabase.length; i++) {
				String cityName = dataIn.readLine();
				int windSpeed = Integer.parseInt(dataIn.readLine());
				String tempTemperatures = dataIn.readLine();
				String[] temperatureStringArray = tempTemperatures.split(",");
				int temperatures [] = new int [temperatureStringArray.length];
				
				for (int j = 0; j < temperatures.length; j++) {
					temperatures[j] = Integer.parseInt(temperatureStringArray[j]);
				}
				
				CityTempGUI.cityDatabase[i] = new City(cityName, windSpeed, temperatures);
			}
			
		}
		
		catch (IOException e) {
			System.out.println("Error reading from data");
		}
		
	}
}
