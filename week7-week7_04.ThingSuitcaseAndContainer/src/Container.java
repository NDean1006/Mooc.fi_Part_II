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
public class Container {
    
    private int maxWeight;
    
    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();
    
    public Container(int weight){
        this.maxWeight = weight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if ((totalWeight() + suitcase.totalWeight()) <= maxWeight )
        container.add(suitcase);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase s: container){
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }
    
    public String toString(){
    return container.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printThings(){
        for (Suitcase s: container){
            s.printThings();
        }
    }
}
