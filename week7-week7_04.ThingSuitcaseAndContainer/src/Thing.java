/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Thing {
    
    private String name;
    private int weight;
    
    public Thing (String string, int weight){
        this.name = string;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
    return getName() + " (" + getWeight() + " kg)";
    }
    
    
}
