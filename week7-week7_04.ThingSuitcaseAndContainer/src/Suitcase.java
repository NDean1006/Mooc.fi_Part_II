import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Suitcase {
    
    private int maxWeight;
 
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public Suitcase(int weightLimit){
        this.maxWeight = weightLimit;
    }
    
    public void addThing(Thing thing){
        if ((totalWeight() + thing.getWeight()) <= this.maxWeight){
            things.add(thing);
        } 
    }
    
    public String toString(){
        
        if (things.isEmpty()){
             return "empty  (" + totalWeight() + " kg)";
        }else if (things.size()==1){
           return things.size()+" thing (" + totalWeight() + " kg)";
        }else {
            return things.size()+" things (" + totalWeight() + " kg)";
        }
    }
    
    public void printThings(){
        for (Thing t: things){
        System.out.println(t);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Thing t: things){
            totalWeight += t.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        
        if (things.isEmpty()){
            return null;
        }else{
            Thing heavy = things.get(0);
            for (Thing t : things){
                if (t.getWeight()> heavy.getWeight()){
                    heavy = t;
                }
            }
             return heavy;
        }
    }
}
    

