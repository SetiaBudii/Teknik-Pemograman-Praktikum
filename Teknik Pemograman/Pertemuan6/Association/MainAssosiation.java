
package Assosiation;
import java.util.*;

class CityClass {
    private String cityName;
    
    public void getCityName(String cityName){
        this.cityName = cityName;
    }
    
    public String toString(){
        return cityName;
    }
}

class State {
    private String stateName;
    List<CityClass> citys;
    
    public String getStateName(){
        return stateName;
    }
    
    public void setStateName(String stateName){
        this.stateName = stateName;
    }
    
    public List<CityClass> getCities(){
        return citys;
    }
    
    public void setState(List<CityClass> citys){
        this.citys = citys;
    }
}

public class MainAssosiation {
    public static void main(String args[]){
        State state = new State();
        state.setStateName("California");
        
        CityClass city = new CityClass();
        CityClass city2 = new CityClass();
        city.getCityName("Los Angeles");
        city2.getCityName("SAn Diago");
        
        List<CityClass> empList = new ArrayList<CityClass>();
        empList.add(city);
        empList.add(city2);
        
        state.setState(empList);
        
        System.out.println(state.getCities()+" are cities in state "+state.getStateName());
    }
}
