import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Flight {
    
    private final Airplane plane;
    private final String originAirport;
    private final String destinationAirport; 
    
    public Flight (Airplane plane, String originAirport, String destinationAirport){
        this.plane = plane;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
    }
    
    @Override
  public String toString(){
      return this.plane + " (" + this.originAirport + "-" + this.destinationAirport + ")";
  }  
}