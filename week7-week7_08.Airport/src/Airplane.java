import java.util.HashMap;
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
public class Airplane {
    
    private String name;
    private int capacity;
    //private Scanner reader;

    public Airplane(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.capacity + " ppl)";
    }
}