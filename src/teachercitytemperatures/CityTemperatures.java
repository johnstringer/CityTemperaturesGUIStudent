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
public class CityTemperatures {

    /**
     * @param args the command line arguments
     */
	public static City [] cityDatabase = new City[9];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < cityDatabase.length; i++) {
			cityDatabase[i] = new City();
		}
		//cityDatabase [0] = new City("Toronto", 5, -);
		//cityDatabase [1] = new City("New York", 10, -20);
		
		LoadData.loadFile();
		
		
		System.out.println(cityDatabase[0].getCityName());
		int [] temps = cityDatabase[0].getTemp();
		
		for (int i = 0; i < temps.length; i++) {
			System.out.print(temps[i] + " ");
		}
		System.out.println();
		System.out.println(cityDatabase[0].getWindSpeed());
		//System.out.println(cityDatabase[1].getCityName());
		
		cityDatabase[1].setCityName("Montreal");
		SaveFile.SaveFile();

	}

    
}
