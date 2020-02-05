/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachercitytemperatures;

import java.util.Arrays;

/**
 *
 * @author johnstringer
 */
public class DataMethods {
    
    public static String CreateHTMLString(){
        String HTMLString = "<html><table><tr><td><b><font colour = \"blue\">City Name</font></b></td><<b><font colour = \"blue\">Wind Speed</font></b></td><td><b><font colour = \"blue\">Temperatures</font></b></td></tr>";
        
        for (int i = 0; i < CityTempGUI.cityDatabase.length; i++){
            System.out.println(CityTempGUI.cityDatabase[i].getCityName().compareTo("-"));
            if (CityTempGUI.cityDatabase[i].getCityName().compareTo("-") != 0){
                HTMLString += "<tr>";
                HTMLString += "<td>" + CityTempGUI.cityDatabase[i].getCityName() + "</td>";
                HTMLString += "<td>" + CityTempGUI.cityDatabase[i].getWindSpeed() + "</td>";
                int [] temperatures = CityTempGUI.cityDatabase[i].getTemp();
                String temperaturesText = "";

                for (int j = 0; j < temperatures.length; j++){

                        temperaturesText += temperatures[j] + " ";
                }
                HTMLString += "<td>" + temperaturesText + "</td>";
                HTMLString += "</tr>";
            }
        }
        
        HTMLString += "</table></html>";
        return HTMLString;
    }
    
    public static void SortByCity(){
        
        for (int i = 0; i < CityTempGUI.cityDatabase.length - 1; i++) {
                int index = i;
                
                System.out.println(CityTempGUI.cityDatabase[i].getCityName().compareTo("-"));
                
                    for (int j = i + 1; j < CityTempGUI.cityDatabase.length; j++) {
                            if (CityTempGUI.cityDatabase[index].getCityName().compareTo(CityTempGUI.cityDatabase[j].getCityName()) > 0) {
                                    index = j;
                            }
                    }
                        if (CityTempGUI.cityDatabase[i].getCityName().compareTo("-") != 0){
                        if (index != i) {
                                City tempCity;
                                tempCity = CityTempGUI.cityDatabase[index];
                                CityTempGUI.cityDatabase[index] = CityTempGUI.cityDatabase[i];
                                CityTempGUI.cityDatabase[i] = tempCity;
                        }
                    }
        }
               

        
        for (int i = 0; i < CityTempGUI.cityDatabase.length; i++) {
            System.out.println(CityTempGUI.cityDatabase[i].getCityName());
        }
        
    }
    
}
