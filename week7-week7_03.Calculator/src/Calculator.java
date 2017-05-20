/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Calculator {
    
    private final Reader reader;
    private int count;
    
    public Calculator() {
        this.reader = new Reader();
        this.count = count;
    }
    
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            
            

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private void sum(){
    System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       // print the value according to the example above
       System.out.println("sum of the values " + (value1 + value2));
       count++;
    }
    
    private void difference(){
    System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       // print the value according to the example above
       System.out.println("difference of the values " + (value1 - value2));
       count++;
    }
    
    private void product(){
    System.out.print("value1: ");
       int value1 = reader.readInteger();
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       // print the value according to the example above
       System.out.println("product of the values " + (value1 * value2));
       count++;
    }
    
    
    private void statistics(){
        System.out.println("Calculations done " + count);
    }
    
}
