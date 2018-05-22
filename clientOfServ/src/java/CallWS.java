
import interfaces.CityWeather;
import interfaces.GetInformationByZIP;
import interfaces.GetInformationByZIPImplService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergey
 */
public class CallWS {
    public static void main(String[] args) {
        String zipcode="11111";//London
        String date="2018-04-01 21:00:00";
        
              
        
        GetInformationByZIPImplService service=new GetInformationByZIPImplService();
        GetInformationByZIP port=service.getGetInformationByZIPImplPort();
       
        System.out.println(port.getCityWeatherByZIP(zipcode));
        
        System.out.println(port.getCityForecastByZIP(zipcode));
        System.out.println(port.saveCityWeatherByZIPandDate(zipcode, date));
    }
    
}
